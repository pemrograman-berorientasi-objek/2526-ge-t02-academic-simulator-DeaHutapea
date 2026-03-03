// File: academic/driver/Driver1.java
package academic.driver;

import academic.model.Course;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>(); // Menggunakan ArrayList sebagai media penyimpanan array dinamis

        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();

            if (line.equals("---")) {
                break; // Hentikan pembacaan input jika ditemukan "---"
            }

            // Memecah baris masukan menjadi segmen-segmen
            String[] segments = line.split("#");

            // Validasi sederhana jumlah segmen
            if (segments.length == 4) {
                String code = segments[0];
                String name = segments[1];
                int credits = Integer.parseInt(segments[2]); // Mengkonversi SKS ke integer
                String grade = segments[3];

                // Membuat objek Course dan menambahkannya ke ArrayList
                Course course = new Course(code, name, credits, grade);
                courses.add(course);
            } else {
                // Opsional: Penanganan error jika format input tidak sesuai
                System.err.println("Peringatan: Format input tidak valid untuk baris ini: " + line);
            }
        }

        // Menampilkan semua courses yang tersimpan
        for (Course course : courses) {
            System.out.println(course); // Method toString() dari Course akan otomatis dipanggil
        }

        input.close(); // Menutup scanner
    }
}
