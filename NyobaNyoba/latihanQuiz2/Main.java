package latihanQuiz2;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("===================================");
        System.out.println("=== SUPERMARKET QUEUE SIMULATOR ===");
        System.out.println("===================================");

        q.tampil();
        q.enqueue("Budi");
        q.enqueue("Susi");
        q.enqueue("Lala");
        q.tampil();
        System.out.println("Antrian saat ini : " + q.dequeue());
        System.out.println("Antrian Setelah melayani 1 antrian : ");
        q.tampil();
        System.out.println("Antrian saat ini : " + q.dequeue());
        System.out.println("Antrian Setelah melayani 1 antrian : ");
        q.tampil();

        System.out.println("===================================");

    }
}
