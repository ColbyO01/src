package SRC2.finalproject;

public class SectionTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student();
        Student student2 = new Student();
        int scores1[] = { 96, 100, 85, 91 };
        int scores2[] = { 90, 70, 80, 76, 82 };
        Section section = new Section();
        int errors = 0;

        System.out.println("SectionTest starts");
        System.out.println();

        teacher.setFirstName("Richard");
        teacher.setLastName("Feynman");
        teacher.setEmployeeID("1001");

        student1.setFirstName("Laurie");
        student1.setLastName("Brown");
        student1.setStudentID("2001");
        student1.setScores(scores1);

        student2.setFirstName("Michel");
        student2.setLastName("Baranger");
        student2.setStudentID("2002");
        student2.setScores(scores2);

        section.setTitle("Physics 101");
        if (!section.getTitle().equals("Physics 101")) {
            System.out.println("Error with section title");
        }

        Student[] students = new Student[14];
        students[0] = student1;
        students[1] = student2;
        for (int i = 2; i < 14; i++) {
            Student gradeTest = new Student();
            int[] scores = { 40 + i * 5 };
            gradeTest.setFirstName("Grade");
            gradeTest.setLastName("Test");
            gradeTest.setStudentID("" + (2000 + scores[0]));
            gradeTest.setScores(scores);
            students[i] = gradeTest;
        }

        section.setTeacher(teacher);
        section.setStudents(students);
        section.printRoster();

        System.out.println("SectionTest completed with " + errors + " errors");
    }
}