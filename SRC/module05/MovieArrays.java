package SRC.module05;

// You should only change this program in places where "Add logic here" appears

// We will learn more about using files later on in the semester
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MovieArrays {
    public static void main(String[] args) throws IOException {
        final int MAX_MOVIES = 1000;
        String[] title = new String[MAX_MOVIES];
        int[] releaseYear = new int[MAX_MOVIES];
        int[] runtime = new int[MAX_MOVIES];
        String[] genre = new String[MAX_MOVIES];
        double[] imdbRating = new double[MAX_MOVIES];
        int[] metaScore = new int[MAX_MOVIES];
        String[] director = new String[MAX_MOVIES];
        // Notice how this is a two-dimensional array
        String[][] star = new String[MAX_MOVIES][4];
        // Keep track of how many movies have been read from the file
        int movies = 0;

        // The movie details are derived from a dataset provided at
        // https://www.kaggle.com/harshitshankhdhar/imdb-dataset-of-top-1000-movies-and-tv-shows
        FileInputStream fis = new FileInputStream("src/module05/movies.txt");
        Scanner fileScanner = new Scanner(fis);
        int count = 0;

        // Keep reading as long as there is another movie and there is still room in the
        // arrays
        while (fileScanner.hasNext() && movies < MAX_MOVIES) {
            // Read a line from the file and break it up into fields based on tab characters
            String[] field = fileScanner.nextLine().split("\t");
            title[movies] = field[0];
            // Integer.parseInt is used to change a String into an int
            releaseYear[movies] = Integer.parseInt(field[1]);
            runtime[movies] = Integer.parseInt(field[2]);
            genre[movies] = field[3];
            // Double.parseDouble is used to change a String into a double
            imdbRating[movies] = Double.parseDouble(field[4]);
            // The metaScore is sometimes blank; if so, use 0, but otherwise, convert the
            // number
            metaScore[movies] = field[5].equals("") ? 0 : Integer.parseInt(field[5]);
            director[movies] = field[6];
            // Stars are stored in a two-dimensional array
            star[movies][0] = field[7];
            star[movies][1] = field[8];
            star[movies][2] = field[9];
            star[movies][3] = field[10];
            ++movies;
        }
        fileScanner.close();

        System.out.println();
        System.out.println("Movies that are longer than 3.5 hours/210 minutes (8)");
        for (int i = 0; i < movies; i++) {
            if (runtime[i] > 210) {
                count++;
                System.out.printf("%d %s\n", runtime[i], title[i]);
            }
        }
        System.out.printf("Count: %d\n\n", count);
        System.out.println("Movies with Audrey Hepburn as the leading star (3)");
        count = 0;
        for (int i = 0; i < movies; i++) {
            if (star[i][0].equals("Audrey Hepburn")) {
            count++;
            System.out.println(title[i]);
            }
        }
        System.out.printf("Count: %d\n\n", count);
        System.out.println("Movies released in the 1930's (24)");
        count = 0;
        for (int i = 0; i < title.length; i++) {
            if (releaseYear[i] >= 1930 && releaseYear[i] <= 1939) {
            count++;
            System.out.println(releaseYear[i] + " " + title[i]);
            }

        }
        System.out.printf("Count: %d\n\n", count);
        System.out.println("Movies directed by Christopher Nolan (8)");
        count = 0;
        for (int i = 0; i < movies; i++) {
            if (director[i].equals("Christopher Nolan")) {
                count++;
                System.out.print(title[i] + " starring ");
            for (int j = 0; j < 4; j++) {
                if (star[i][j] != null) {
                    System.out.print(star[i][j]);
                    if (j < 3 && star[i][j + 1] != null) {
                        System.out.print(", ");
                        }
                    }
                }
                System.out.println();
            }
        }
        System.out.printf("Count: %d\n\n", count);
        System.out.println("Movies starring Ken Watanabe (4)");
        count = 0;
        for (int i = 0; i < movies; i++) {
            for (int j = 0; j < 4; j++) {
                if (star[i][j] != null && star[i][j].equals("Ken Watanabe")) {
                    count++;
                    System.out.print(title[i] + " directed by " + director[i]);
                    if (j < 3 && star[i][j + 1] != null) {
                        System.out.print(", ");
                    }
                    System.out.println();
                    break;
                }
            }
        }
        System.out.printf("Count: %d\n\n", count);
        System.out.println("Movies directed by Christopher Nolan and starring Ken Watanabe (2)");
        count = 0;
        for (int i = 0; i < movies; i++) {
            if (director[i].equals("Christopher Nolan")) {
                for (int j = 0; j < 4; j++) {
                    if (star[i][j] != null && star[i][j].equals("Ken Watanabe")) {
                    count++;
                    System.out.println(title[i]);
                    break;
                    }
                }
            }
        }
        System.out.printf("Count: %d\n\n", count);
        System.out.println("Genre Sci-Fi but not Adventure with either a IMDB Rating above 8.0 or a MetaScore at or above 90 (20)");
        count = 0;
        for (int i = 0; i < movies; i++) {
            if (genre[i].contains("Sci-Fi") && !genre[i].contains("Adventure") && (imdbRating[i] > 8.0 || metaScore[i] >= 90)) {
            count++;
            System.out.printf("%.1f %d %s\n", imdbRating[i], metaScore[i], title[i]);
            }
        }
        System.out.printf("Count: %d\n\n", count);
        System.out.println("Statistics");

        int shortestRuntime = Integer.MAX_VALUE;
        int longestRuntime = 0;
        int totalRuntime = 0;
        int averageRuntime = 0;

        for (int i = 0; i < movies; i++) {
            totalRuntime += runtime[i];
            if (runtime[i] < shortestRuntime) {
                shortestRuntime = runtime[i];
            }
            if (runtime[i] > longestRuntime) {
                longestRuntime = runtime[i];
            }
        }
        averageRuntime = totalRuntime / movies;
        System.out.printf("Shortest runtime: %d\n", shortestRuntime);
        System.out.printf("Longest runtime:  %d\n", longestRuntime);
        System.out.printf("Total runtime:    %d\n", totalRuntime);
        System.out.printf("Average runtime:  %d\n", averageRuntime);
        System.out.println();
    }
}