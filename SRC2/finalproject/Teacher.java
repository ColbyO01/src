package SRC2.finalproject;

public class Teacher {
    private String firstName;
    private String lastName;
    private String employeeID;

    public Teacher() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void printDetails() {
        System.out.println("Employee ID " + employeeID + " " + firstName + " " + lastName);
    }
}
