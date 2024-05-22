package latihanRestorant;

import java.util.Scanner;
import latihanRestorant.Node.Pesanan;

public class SLL {
    Node head, tail;
    int totalPendapatan;
    int nomorAntrian = 1;
    int nomorPesanan = 1;
    Pesanan[] daftarPesanan;

    public SLL() {
        this.head = this.tail = null;
        this.totalPendapatan = 0;
        this.daftarPesanan = new Pesanan[1000000];
    }

    void tambahAntrian(String nama, String noHP) {
        Node temp = new Node(nama);
        temp.pembeli = temp.new Pembeli(nama, noHP);
        temp.nomorAntrian = this.nomorAntrian;

        if (this.tail == null) {
            this.head = this.tail = temp;
        } else {
            this.tail.next = temp;
            this.tail = temp;
        }
        this.nomorAntrian++;
    }

    void cetakAntrian() {
        if (this.head == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println("Nomor Antrian: " + currentNode.nomorAntrian + "\nNama: " + currentNode.nama + "\nNo HP: "
                    + currentNode.pembeli.noHP);
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    void hapusAntrian() {
        if (this.head == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println(this.head.nama + " telah memesan menu");
        System.out.println("Transaksi Input Pesanan");
        System.out.println("Nomor Pesanan: " + this.nomorPesanan);
        System.out.print("Nama Pesanan: ");
        String namaPesanan = sc.next();
        System.out.print("Harga: ");
        int harga = sc.nextInt();

        Pesanan pesanan = this.head.new Pesanan(this.nomorPesanan, namaPesanan, harga);
        daftarPesanan[this.nomorPesanan - 1] = pesanan;

        this.head.pesanan = pesanan;

        System.out.println("Daftar Pesanan: ");
        System.out.println("Nomor Pesanan \t Nama Pesanan \t Harga");
        System.out.println(pesanan.kodePesanan + "\t\t" + pesanan.namaPesanan + "\t\t" + pesanan.harga);

        totalPendapatan += harga;
        this.nomorPesanan++;

        Node temp = this.head;
        this.head = this.head.next;

        if (this.head == null) {
            this.tail = null;
        }
    }

    void laporanPengurutanPesanan() {
        if (this.nomorPesanan == 1) {
            System.out.println("Belum ada pesanan");
            return;
        }

        for (int i = 0; i < this.nomorPesanan - 1; i++) {
            for (int j = i + 1; j < this.nomorPesanan - 1; j++) {
                if (daftarPesanan[i] != null && daftarPesanan[j] != null &&
                        daftarPesanan[i].namaPesanan.compareTo(daftarPesanan[j].namaPesanan) > 0) {
                    Pesanan temp = daftarPesanan[i];
                    daftarPesanan[i] = daftarPesanan[j];
                    daftarPesanan[j] = temp;
                }
            }
        }

        System.out.println("Laporan Pengurutan Pesanan by Nama");
        System.out.println("Nomor Pesanan \t Nama Pesanan \t Harga");
        for (int i = 0; i < this.nomorPesanan - 1; i++) {
            if (daftarPesanan[i] != null) {
                System.out.println(daftarPesanan[i].kodePesanan + "\t\t" + daftarPesanan[i].namaPesanan + "\t\t" + daftarPesanan[i].harga);
            }
        }
    }

    int hitungTotalPendapatan() {
        return totalPendapatan;
    }
}