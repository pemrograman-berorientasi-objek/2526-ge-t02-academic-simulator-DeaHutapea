// File: academic/driver/Driver3.java
package academic.driver;

import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Enrollment> enrollments = new ArrayList<>(); // Menggunakan ArrayList sebagai media penyimpanan array dinamis

        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika ditemukan "---"
            }

            // Memecah baris masukan menjadi segmen-segmen
            String[] segments = line.split("#");

            // Validasi sederhana jumlah segmen (memastikan ada 4 segmen untuk CourseID, StudentID, AcademicYear, Semester)
            if (segments.length == 4) {
                String courseCode = segments[0];
                String studentId = segments[1];
                String academicYear = segments[2];
                String semester = segments[3];

                // Membuat objek Enrollment dan menambahkannya ke ArrayList
                Enrollment enrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                enrollments.add(enrollment);
            } else {
                // Opsional: Penanganan error jika format input tidak sesuai
                System.err.println("Peringatan: Format input tidak valid untuk baris ini: " + line);
            }
        }

        // Menampilkan semua enrollments yang tersimpan
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment); // Method toString() dari Enrollment akan otomatis dipanggil
        }

        input.close(); // Menutup scanner
    }
}
