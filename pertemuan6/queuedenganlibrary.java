/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Asus A409
 */
import java.util.LinkedList;
import java.util.Queue;

public class queuedenganlibrary {
    public static void main(String[] args) {
        // Membuat Queue menggunakan LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke dalam antrian (enqueue)
        antrian.add("Andi");
        antrian.add("Budi");
        antrian.add("Citra");

        // Menampilkan isi antrian
        System.out.println("Isi antrian: " + antrian);

        // Mengakses elemen terdepan (peek)
        System.out.println("Antrian terdepan: " + antrian.peek());

        // Menghapus elemen terdepan (dequeue)
        System.out.println("Mengeluarkan: " + antrian.poll());

        // Menampilkan isi antrian setelah dequeue
        System.out.println("Isi antrian sekarang: " + antrian);
    }
}
