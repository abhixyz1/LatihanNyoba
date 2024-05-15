package tokoATK;

import java.util.Scanner; 

public class tokoATK3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        tokoATK2 data = new tokoATK2();

        System.out.println("=======================================");
        System.out.println("=======    TOKO ATK ABHINAYA    =======");
        System.out.println("=======================================");

        System.out.println("1. Input Data Barang\n2. Jual Barang\n3. Urutkan Data Barang\n4. Cari Data Barang\n5. Tampilkan Data\n6. Keluar\n");
        System.out.print("Pilih Menu : ");
        int pilih = sc.nextInt();

        while (pilih != 6) { 
            if (pilih == 1) {
                data.inputBarang(sc);
            } else if (pilih == 2) {
                double total = data.jualBarang(sc);
                System.out.println("Total Harga\t: " + total);
            } else if (pilih == 3) {
                data.urutkanData();
            } else if (pilih == 4) {
                System.out.print("Masukkan kode barang yang dicari : ");
                String kode = sc.next();
                data.cariData(kode);
            } else if (pilih == 5) {
                data.tampilkanData();
            } else {
                System.out.println("Menu tidak tersedia");
            }

            System.out.println("=======================================");
            System.out.println("1. Input Data Barang\n2. Jual Barang\n3. Urutkan Data Barang\n4. Cari Data Barang\n5. Tampilkan Data\n6. Keluar\n");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
        }
    }
}
