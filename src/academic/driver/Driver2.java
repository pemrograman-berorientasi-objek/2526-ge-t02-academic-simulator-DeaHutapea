// File: academic/driver/Driver2.java
package academic.driver;

import academic.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(); // Menggunakan ArrayList sebagai media penyimpanan array dinamis

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
                String id = segments[0];
                String name = segments[1];
                int entryYear = Integer.parseInt(segments[2]); // Mengkonversi tahun masuk ke integer
                String major = segments[3];

                // Membuat objek Student dan menambahkannya ke ArrayList
                Student student = new Student(id, name, entryYear, major);
                students.add(student);
            } else {
                // Opsional: Penanganan error jika format input tidak sesuai
                System.err.println("Peringatan: Format input tidak valid untuk baris ini: " + line);
            }
        }

        // Menampilkan semua students yang tersimpan
        for (Student student : students) {
            System.out.println(student); // Method toString() dari Student akan otomatis dipanggil
        }

        input.close(); // Menutup scanner
    }
}
