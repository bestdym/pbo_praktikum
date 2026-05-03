import kendaraan.Harga;

public class Utama {
    public static void main(String[] args) {

        Harga[] kendaraan = new Harga[3];

        kendaraan[0] = new Harga();
        kendaraan[0].setJenisKendaraan("Mobil");
        kendaraan[0].setNamaMerk("Toyota Avanza");
        kendaraan[0].setHarga(250000000);

        kendaraan[1] = new Harga();
        kendaraan[1].setJenisKendaraan("Motor");
        kendaraan[1].setNamaMerk("Honda CBR");
        kendaraan[1].setHarga(25000000);

        kendaraan[2] = new Harga();
        kendaraan[2].setJenisKendaraan("Sepeda");
        kendaraan[2].setNamaMerk("Polygon");
        kendaraan[2].setHarga(5000000);

        System.out.println("Nama : Dimas Nurdiansyah");
        System.out.println("NIM  : 251110058");
        System.out.println();

        System.out.println("==============================");
        System.out.println("        DATA KENDARAAN        ");
        System.out.println("==============================");

        for (int i = 0; i < kendaraan.length; i++) {
            System.out.println("Kendaraan ke " + (i + 1) + ":");
            System.out.println("Jenis  : " + kendaraan[i].getJenisKendaraan());
            System.out.println("Merk   : " + kendaraan[i].getNamaMerk());
            System.out.println("Harga  : " + kendaraan[i].getHargaFormatted());
            System.out.println("------------------------------");
        }
    }
}
