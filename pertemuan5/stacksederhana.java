/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
public class StackSederhana {
    // Ukuran maksimal stack
    private static final int MAX = 5;
    private int[] stack = new int[MAX];
    private int top = -1;

    // Method untuk menambahkan elemen ke stack (push)
    public void push(int data) {
        if (top == MAX - 1) {
            System.out.println("Stack penuh! Tidak bisa menambahkan " + data);
        } else {
            top++;
            stack[top] = data;
            System.out.println("Data " + data + " ditambahkan ke stack.");
        }
    }

    // Method untuk menghapus elemen dari stack (pop)
    public int pop() {
        if (top == -1) {
            System.out.println("Stack kosong! Tidak ada data yang bisa dihapus.");
            return -1;
        } else {
            int removedData = stack[top];
            top--;
            System.out.println("Data " + removedData + " dihapus dari stack.");
            return removedData;
        }
    }

    // Method untuk melihat elemen teratas (peek)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack kosong!");
            return -1;
        } else {
            System.out.println("Elemen teratas: " + stack[top]);
            return stack[top];
        }
    }

    // Method untuk menampilkan semua isi stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack kosong!");
        } else {
            System.out.print("Isi stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method untuk menjalankan program
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
