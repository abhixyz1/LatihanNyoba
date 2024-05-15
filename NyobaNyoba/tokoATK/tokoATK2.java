package NyobaNyoba;

import java.util.Scanner;

/**
 * @author Abhinaya
 */

public class tokoATK2 {

    tokoATK listBarang[] = new tokoATK[10000];
    int idx;

    void inputBarang(Scanner sc) {
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i] == null) {
                System.out.println("Input Data Barang");
                System.out.print("Kode Barang\t: ");
                String kode = sc.next();
                System.out.print("Nama Barang\t: ");
                String namaBarang = sc.next();
                System.out.print("Stok\t\t: ");
                int stok = sc.nextInt();
                System.out.print("Harga Satuan\t: ");
                double hargaSatuan = sc.nextDouble();
                listBarang[i] = new tokoATK(kode, namaBarang, stok, hargaSatuan);
                break;
            }
        }
    }
    
    double jualBarang(Scanner sc) {
        System.out.println("Jual Barang");
        System.out.print("Kode Barang\t: ");
        String kode = sc.next();
        System.out.print("Jumlah\t\t: ");
        int jumlah = sc.nextInt();
        double total = 0;
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i] != null) {
                if (listBarang[i].kode.equals(kode)) {
                    if (listBarang[i].stok >= jumlah) {
                        total = jumlah * listBarang[i].hargaSatuan;
                        listBarang[i].stok -= jumlah;
                        break;
                    } else {
                        System.out.println("Stok tidak mencukupi");
                    }
                }
            }
        }
        return total;
    }

    void urutkanData() {
        for (int i = 0; i < listBarang.length - 1; i++) {
            for (int j = 0; j < listBarang.length - i - 1; j++) {
                if (listBarang[j] != null && listBarang[j + 1] != null) {
                    if (listBarang[j].stok < listBarang[j + 1].stok) {
                        tokoATK temp = listBarang[j]; // 
                        listBarang[j] = listBarang[j + 1];
                        listBarang[j + 1] = temp;
                    }
                }
            }
        }
    }

    void cariData(String kode) {
        for (int i = 0; i < listBarang.length; i++) {
            if (listBarang[i] != null) {
                if (listBarang[i].kode.equals(kode)) {
                    System.out.println("=====================================");
                    System.out.println("Kode\t\t: " + listBarang[i].kode);
                    System.out.println("Nama Barang\t: " + listBarang[i].namaBarang);
                    System.out.println("Stok\t\t: " + listBarang[i].stok);
                    System.out.println("Harga Satuan\t: " + listBarang[i].hargaSatuan);
                    System.out.println("=====================================");
                    return;
                }
            }
        }
        System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
    }

    void tampilkanData() {
        for (tokoATK barang : listBarang) {
            if (barang != null) {
                barang.tampil();
            }
        }
    }
}