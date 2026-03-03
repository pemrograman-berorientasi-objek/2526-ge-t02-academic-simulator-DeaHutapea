// File: academic/model/Student.java
package academic.model;

public class Student {
    private String id;
    private String name;
    private int entryYear; // Tahun masuk
    private String major;  // Program studi

    public Student(String id, String name, int entryYear, String major) {
        this.id = id;
        this.name = name;
        this.entryYear = entryYear;
        this.major = major;
    }

    // Getters for all fields (optional but good practice)
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public String getMajor() {
        return major;
    }

    // toString method to format output as specified: ID|Name|EntryYear|Major
    @Override
    public String toString() {
        return this.id + "|" + this.name + "|" + this.entryYear + "|" + this.major;
    }
}
