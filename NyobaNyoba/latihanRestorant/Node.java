package latihanRestorant;

public class Node {
    String nama;
    Node next;
    Pembeli pembeli;
    Pesanan pesanan;
    int nomorAntrian;

    public Node(String nama) {
        this.nama = nama;
        this.next = null;
    }
    
    public class Pembeli{
        String namaPembeli;
        String noHP;

        public Pembeli(String namaPembeli, String noHP) {
            this.namaPembeli = namaPembeli;
            this.noHP = noHP;
        }
    }

    public class Pesanan{
        int kodePesanan;
        String namaPesanan;
        int harga;

        public Pesanan(int kodePesanan, String namaPesanan, int harga) {
            this.kodePesanan = kodePesanan;
            this.namaPesanan = namaPesanan;
            this.harga = harga;
        }
    }
}
