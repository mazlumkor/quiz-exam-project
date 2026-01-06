// Stores student personal information
/**
 * Student class represents a student who takes the quiz.
 * It stores student information such as name, student ID and department.
 */

public class Student {

    private String name;
    private String studentId;
    private String department;

    public Student(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }
}
