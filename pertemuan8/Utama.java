public class Utama {
    public static void main(String args[]) {
        Mahasiswa mhs = new Mahasiswa("001", "Budi");
        Karyawan kry = new Karyawan("2101", "Andi");

        Manusia man = new Manusia();

        man = mhs;
        System.out.println("Nama  : " + man.getNama());
        System.out.println("NIM   : " + mhs.getNIM());
        man.makan();

        System.out.println(); // Baris kosong pembatas

        man = kry;
        System.out.println("Nama  : " + man.getNama());
        System.out.println("NIP   : " + kry.getNIP());
        man.makan();

        man = new Manusia("Siti");
        System.out.println("Nama  : " + man.getNama());
        man.makan();
    }
}
