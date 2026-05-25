public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Dimas Nurdiansyah");
        System.out.println("NIM     : 251110058\n");
        System.out.println("       SISTEM PENCATATAN NILAI MAHASISWA       ");
        System.out.println("=".repeat(45));
        System.out.println();

        //Mahasiswa Reguler
        System.out.println("DATA MAHASISWA REGULER");
        MahasiswaReguler mhsReguler = new MahasiswaReguler(
            "251110017", 
            "AL Farel", 
            80.0,  // UTS
            82.5,  // UAS
            75.0   // ASN
        );
        mhsReguler.tampilInfo();
        System.out.println();

        // Mahasiswa Beasiswa
        System.out.println("DATA MAHASISWA BEASISWA");
        MahasiswaBeasiswa mhsBeasiswa = new MahasiswaBeasiswa(
            "251110058", 
            "Dimas Nurdiansyah", 
            90.0,  // UTS
            91.0,  // UAS
            88.5,  // ASN
            95.0   // Nilai Organisasi
        );
        mhsBeasiswa.tampilInfo();
    }
}
