// File: academic/model/Course.java
package academic.model;

public class Course {
    private String code;
    private String name;
    private int credits;
    private String grade; // Assuming grade can be a String like "A", "B", "C", "D", "E"

    public Course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    // Getters for all fields (optional but good practice, not strictly needed for this task's output)
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getGrade() {
        return grade;
    }

    // toString method to format output as specified: ID|Name|SKS|Grade
    @Override
    public String toString() {
        return this.code + "|" + this.name + "|" + this.credits + "|" + this.grade;
    }
}
