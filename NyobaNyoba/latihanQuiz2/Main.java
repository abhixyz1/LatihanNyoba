package latihanQuiz2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        System.out.println("===================================");
        System.out.println("=== SUPERMARKET QUEUE SIMULATOR ===");
        System.out.println("===================================");

        int pilih;
        do {
            System.out.println("1. Masukkan antrian");
            System.out.println("2. Panggil antrian");
            System.out.println("3. Lihat antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    q.enqueue(nama);
                    break;
                case 2:
                    String data = q.dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang dikeluarkan: " + data);
                    } else {
                        System.out.println("Antrian masih kosong");
                    }
                    break;
                case 3:
                    q.tampil();
                    break;
                case 4:
                    System.out.println("====================================================");
                    System.out.println("===  Terima kasih telah menggunakan program ini  ===");
                    System.out.println("====================================================");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilih != 4);
        

    }
}
