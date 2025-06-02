/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
import java.util.Scanner;
import java.util.Stack;

public class stackstudikasus {
    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();
        String currentText = "";
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tambah teks");
            System.out.println("2. Undo (hapus teks terakhir)");
            System.out.println("3. Lihat isi dokumen");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    String newText = input.nextLine();
                    undoStack.push(currentText); // Simpan teks saat ini ke stack
                    currentText += newText + " ";
                    break;
                case 2:
                    if (!undoStack.isEmpty()) {
                        currentText = undoStack.pop(); // Kembalikan ke teks sebelumnya
                        System.out.println("Undo berhasil.");
                    } else {
                        System.out.println("Tidak ada yang bisa di-undo.");
                    }
                    break;
                case 3:
                    System.out.println("Isi dokumen saat ini:\n" + currentText);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
