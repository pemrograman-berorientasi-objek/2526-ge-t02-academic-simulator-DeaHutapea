// File: academic/driver/Driver4.java
package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika ditemukan "---"
            }

            String[] segments = line.split("#");
            String command = segments[0]; // Bagian pertama adalah perintah (course-add, student-add, enrollment-add)

            switch (command) {
                case "course-add":
                    if (segments.length == 5) { // Command + 4 data
                        String code = segments[1];
                        String name = segments[2];
                        int credits = Integer.parseInt(segments[3]);
                        String grade = segments[4]; // Asumsi grade ini untuk course, dari model yang diberikan
                        Course course = new Course(code, name, credits, grade);
                        courses.add(course);
                    } else {
                        System.err.println("Peringatan: Format input 'course-add' tidak valid: " + line);
                    }
                    break;
                case "student-add":
                    if (segments.length == 5) { // Command + 4 data
                        String id = segments[1];
                        String name = segments[2];
                        int entryYear = Integer.parseInt(segments[3]);
                        String major = segments[4];
                        Student student = new Student(id, name, entryYear, major);
                        students.add(student);
                    } else {
                        System.err.println("Peringatan: Format input 'student-add' tidak valid: " + line);
                    }
                    break;
                case "enrollment-add":
                    if (segments.length == 5) { // Command + 4 data
                        String courseCode = segments[1];
                        String studentId = segments[2];
                        String academicYear = segments[3];
                        String semester = segments[4];
                        // Grade default "None" akan diset di konstruktor Enrollment
                        Enrollment enrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                        enrollments.add(enrollment);
                    } else {
                        System.err.println("Peringatan: Format input 'enrollment-add' tidak valid: " + line);
                    }
                    break;
                default:
                    System.err.println("Peringatan: Perintah tidak dikenal: " + command + " pada baris: " + line);
                    break;
            }
        }

        // Menampilkan semua courses
        for (Course course : courses) {
            System.out.println(course);
        }

        // Menampilkan semua students
        for (Student student : students) {
            System.out.println(student);
        }

        // Menampilkan semua enrollments
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        input.close(); // Menutup scanner
    }
}