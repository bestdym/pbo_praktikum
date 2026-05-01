package Pertemuan4;

public class Utama {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mamalia
        Mamalia kucing = new Mamalia();
        
        // Menggunakan metode yang sudah diimplementasikan
        kucing.setSpesies("felis catus");
        
        // Menampilkan hasil ke layar
        System.out.println("kucing ber-filum = " + kucing.getFilum());
        System.out.println("nama ilmiah kucing = " + kucing.getSpesies());
    }
}