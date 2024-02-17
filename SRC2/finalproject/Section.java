package SRC2.finalproject;

public class Section {
    private String title;
    private Teacher teacher;
    private Student[] students;

    public Section() {
    }

    public Section(String title, Teacher teacher, Student[] students) {
        this.title = title;
        this.teacher = teacher;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void printRoster() {
        System.out.println("Class " + title);
        teacher.printDetails();

        for (Student student : students) {
            student.printDetails();
        }
    }
}