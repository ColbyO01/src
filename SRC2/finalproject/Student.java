package SRC2.finalproject;

public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private int[] scores;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public int[] getScores() {
        return scores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int computeWorstScore() {
        if (scores.length == 0) {
            return 0;
        }

        int minScore = scores[0];
        for (int score : scores) {
            if (score < minScore) {
                minScore = score;
            }
        }
        return minScore;
    }

    public int computeBestScore() {
        if (scores.length == 0) {
            return 0;
        }

        int maxScore = scores[0];
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        return maxScore;
    }

    public int computeAverageScore() {
        if (scores.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public String computeGrade() {
        int averageScore = computeAverageScore();
        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void printDetails() {
        System.out.printf("Student ID %s %s %s%n", studentID, firstName, lastName);
        System.out.printf("Scores %s Worst %d Best %d Average %d Grade %s%n",
                arrayToString(scores), computeWorstScore(), computeBestScore(), computeAverageScore(), computeGrade());
    }

    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}