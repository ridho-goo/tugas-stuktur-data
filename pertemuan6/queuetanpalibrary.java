/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Asus A409
 */
public class queuetanpalibrary {
    private static final int MAX = 5; // Ukuran maksimal queue
    private String[] queue = new String[MAX];
    private int front = 0;
    private int rear = -1;
    private int count = 0;

    // Menambahkan data ke antrian (enqueue)
    public void enqueue(String data) {
        if (count == MAX) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan " + data);
            return;
        }

        rear = (rear + 1) % MAX;
        queue[rear] = data;
        count++;
        System.out.println(data + " ditambahkan ke antrian.");
    }

    // Menghapus data dari antrian (dequeue)
    public String dequeue() {
        if (count == 0) {
            System.out.println("Antrian kosong!");
            return null;
        }

        String data = queue[front];
        front = (front + 1) % MAX;
        count--;
        System.out.println(data + " dikeluarkan dari antrian.");
        return data;
    }

    // Menampilkan isi antrian
    public void display() {
        if (count == 0) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.print("Isi antrian: ");
        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % MAX] + " ");
        }
        System.out.println();
    }

    // Program utama
    public static void main(String[] args) {
        queuetanpalibrary antrian = new queuetanpalibrary();

        antrian.enqueue("Andi");
        antrian.enqueue("Budi");
        antrian.enqueue("Citra");
        antrian.display();

        antrian.dequeue();
        antrian.display();

        antrian.enqueue("Dina");
        antrian.enqueue("Eka");
        antrian.enqueue("Fahmi"); // Akan penuh jika MAX = 5
        antrian.display();
    }
}
