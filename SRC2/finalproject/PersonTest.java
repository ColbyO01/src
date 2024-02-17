package SRC2.finalproject;

public class PersonTest {
    private String firstName;
    private String lastName;

    // Constructor
    public PersonTest() {
        // Default constructor
    }

    // Getter and setter methods for first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter methods for last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to print details of the person
    public void printDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}