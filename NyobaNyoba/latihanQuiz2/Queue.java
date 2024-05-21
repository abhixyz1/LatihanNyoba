package latihanQuiz2;

public class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(String nama) {

        Node temp = new Node(nama);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    String dequeue() {
        if (this.front == null) {
            return null;
        } else {
            Node temp = this.front;
            this.front = this.front.next;

            if (this.front == null) {
                this.rear = null;
            }
            return temp.nama;
        }
    }

    void tampil() {
        if (this.front == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Node currentNode = this.front;
        while (currentNode != null) {
            System.out.print(currentNode.nama + "\t");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    void cariNama(String cari) {
        if (this.front == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Node currentNode = this.front;
        int position = 1;
        while (currentNode != null) {
            if (currentNode.nama.equalsIgnoreCase(cari)) {
                System.out.println("Nama " + cari + " ditemukan pada antrian ke-" + position);
                return;
            }
            currentNode = currentNode.next;
            position++;
        }
        System.out.println("Nama " + cari + " tidak ditemukan");
    } 
}
