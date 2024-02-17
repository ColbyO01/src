package SRC2.finalproject;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        int scores[] = { 96, 100, 85, 91 };
        int errors = 0;

        System.out.println("StudentTest started");

        student1.setFirstName("Laurie");
        if (!student1.getFirstName().equals("Laurie")) {
            System.out.println("Error with student firstName");
            errors++;
        }

        student1.setLastName("Brown");
        if (!student1.getLastName().equals("Brown")) {
            System.out.println("Error with student lastName");
            errors++;
        }

        student1.setStudentID("2001");
        if (!(student1.getStudentID().equals("2001"))) {
            System.out.println("Error with student ID");
            errors++;
        }

        student1.setScores(scores);
        //if (student1.getScores().length != scores.length) {
            System.out.println("Error with student scores");
            errors++;
        

        if (student1.computeWorstScore() != 85) {
            System.out.println("Error with worst score");
            errors++;
        }

        if (student1.computeBestScore() != 100) {
            System.out.println("Error with best score");
            errors++;
        }

        if (student1.computeAverageScore() != 93) {
            System.out.println("Error with average score");
            errors++;
        }

        if (!student1.computeGrade().equals("A")) {
            System.out.println("Error with grade");
            errors++;
        }

        student2.setFirstName("Laurie");
        student2.setLastName("Brown");
        student2.setStudentID(new String("2001"));
        student1.setScores(scores);

        student1.printDetails();

        System.out.println("StudentTest completed with " + errors + " errors");
    }

}
