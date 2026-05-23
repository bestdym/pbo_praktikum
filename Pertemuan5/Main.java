public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("       SISTEM PENCATATAN NILAI MAHASISWA       ");
        System.out.println("===============================================");
        System.out.println();

        // 1. Membuat objek Mahasiswa Reguler
        System.out.println("--- DATA MAHASISWA REGULER ---");
        MahasiswaReguler mhsReguler = new MahasiswaReguler(
            "251110058", 
            "Dimas Nurdiansyah", 
            80.0,  // UTS
            85.0,  // UAS
            90.0   // Tugas / ASN
        );
        mhsReguler.tampilInfo();
        System.out.println("-----------------------------------------------");
        System.out.println();

        // 2. Membuat objek Mahasiswa Beasiswa
        System.out.println("--- DATA MAHASISWA BEASISWA ---");
        MahasiswaBeasiswa mhsBeasiswa = new MahasiswaBeasiswa(
            "251110099", 
            "Ahmad Fauzi", 
            80.0,  // UTS
            85.0,  // UAS
            90.0,  // Tugas / ASN
            95.0   // Nilai Organisasi
        );
        mhsBeasiswa.tampilInfo();
        System.out.println("===============================================");
    }
}
