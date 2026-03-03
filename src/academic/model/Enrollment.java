// File: academic/model/Enrollment.java
package academic.model;

public class Enrollment {
    private String courseCode;
    private String studentId;
    private String academicYear;
    private String semester;
    private String grade; // Asumsi grade bisa di-set kemudian, default "None"

    public Enrollment(String courseCode, String studentId, String academicYear, String semester) {
        this.courseCode = courseCode;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None"; // Default grade
    }

    // Constructor with grade, in case it's needed later (optional)
    public Enrollment(String courseCode, String studentId, String academicYear, String semester, String grade) {
        this.courseCode = courseCode;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = grade;
    }

    // Getters for all fields
    public String getCourseCode() {
        return courseCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }

    // Setter for grade, if it needs to be updated later
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // toString method to format output as specified: CourseID|StudentID|AcademicYear|Semester|Grade
    @Override
    public String toString() {
        return this.courseCode + "|" + this.studentId + "|" + this.academicYear + "|" + this.semester + "|" + this.grade;
    }
}
