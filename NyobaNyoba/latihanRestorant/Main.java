package latihanRestorant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SLL sll = new SLL();

        System.out.println("=================== LATIHAN QUIZ 2 ====================");
        System.out.println("Dibuat oleh: Abhinaya");
        System.out.println("=======================================================");

        int pilih;
        do{
            System.out.println("SISTEM ANTRIAN RESTORAN");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by Nama");
            System.out.println("5. Hitung total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("------------------");
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.next();
                    System.out.print("No HP: ");
                    String noHP = sc.next();
                    sll.tambahAntrian(nama, noHP);
                    break;
                case 2:
                    sll.cetakAntrian();
                    break;
                case 3:
                    sll.hapusAntrian();
                    break;
                case 4:
                    sll.laporanPengurutanPesanan();
                    break;
                case 5:
                    int totalPendapatan = sll.hitungTotalPendapatan();
                    System.out.println("Total Pendapatan: " + totalPendapatan);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    break;
            }
        } while (pilih != 6);
    }
}
