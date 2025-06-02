/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
import java.util.Stack;

public class stackmakeklibrary {
    public static void main(String[] args) {
        // Membuat objek stack
        Stack<Integer> stack = new Stack<>();

        // Menambahkan elemen ke stack (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Menampilkan isi stack
        System.out.println("Isi stack: " + stack);

        // Melihat elemen teratas (peek)
        System.out.println("Elemen teratas: " + stack.peek());

        // Menghapus elemen teratas (pop)
        System.out.println("Elemen yang di-pop: " + stack.pop());

        // Menampilkan isi stack setelah pop
        System.out.println("Isi stack setelah pop: " + stack);
    }
}

