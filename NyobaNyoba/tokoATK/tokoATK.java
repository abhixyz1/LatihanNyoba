package NyobaNyoba;

/**
 * @author Abhinaya
 */

public class tokoATK {

    int stok;
    String kode, namaBarang;
    double hargaSatuan;

    tokoATK(String kode, String namaBarang, int stok, double hargaSatuan) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    void tampil() {
        System.out.println("=====================================");
        System.out.println("Kode Barang\t: " + kode);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga Satuan\t: " + hargaSatuan);
    }
}
