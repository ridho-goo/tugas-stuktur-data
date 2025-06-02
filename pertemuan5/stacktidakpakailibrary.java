/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
public class stacktidakpakailibrary {
    // Ukuran maksimal stack
    private static final int MAX = 10;
    private int[] stack = new int[MAX];
    private int top = -1;

    // Menambahkan elemen ke stack (push)
    public void push(int data) {
        if (top >= MAX - 1) {
            System.out.println("Stack penuh! Tidak bisa menambahkan " + data);
        } else {
            top++;
            stack[top] = data;
            System.out.println(data + " ditambahkan ke stack.");
        }
    }

    // Menghapus elemen dari stack (pop)
    public int pop() {
        if (top < 0) {
            System.out.println("Stack kosong! Tidak ada data yang bisa dihapus.");
            return -1;
        } else {
            int popped = stack[top];
            top--;
            System.out.println(popped + " dihapus dari stack.");
            return popped;
        }
    }

    // Melihat elemen teratas (peek)
    public int peek() {
        if (top < 0) {
            System.out.println("Stack kosong!");
            return -1;
        } else {
            System.out.println("Elemen teratas: " + stack[top]);
            return stack[top];
        }
    }

    // Menampilkan semua elemen di stack
    public void display() {
        if (top < 0) {
            System.out.println("Stack kosong!");
        } else {
            System.out.print("Isi stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Program utama
    public static void main(String[] args) {
        StackSederhana stack = new StackSederhana();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();
        stack.display();
    }
}
