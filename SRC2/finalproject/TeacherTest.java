package SRC2.finalproject;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        int errors = 0;

        System.out.println("TeacherTest started");

        teacher1.setFirstName("Richard");
        if (!teacher1.getFirstName().equals("Richard")) {
            System.out.println("Error with teacher firstName");
            errors++;
        }

        teacher1.setLastName("Feynman");
        if (!teacher1.getLastName().equals("Feynman")) {
            System.out.println("Error with teacher lastName");
            errors++;
        }

        teacher1.setEmployeeID("1001");
        if (!teacher1.getEmployeeID().equals("1001")) {
            System.out.println("Error with teacher employeeID");
            errors++;
        }

        teacher2.setFirstName("Katherine");
        teacher2.setLastName("Johnson");
        teacher2.setEmployeeID(new String("1002"));

        teacher1.printDetails();
        teacher2.printDetails();

        System.out.println("TeacherTest completed with " + errors + " errors");
    }
}
