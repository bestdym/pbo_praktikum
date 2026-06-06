public class MahasiswaInformatika extends Mahasiswa {
    private String peminatan;
    private String bahasaPemrogramanFavorit;

    public MahasiswaInformatika(String nama, String email, String nim, double ipk, String peminatan, String bahasaPemrogramanFavorit) {
        super(nama, email, nim, ipk);
        this.peminatan = peminatan;
        this.bahasaPemrogramanFavorit = bahasaPemrogramanFavorit;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("MAHASISWA INFORMATIKA");
        super.tampilkanInfo();
        System.out.println("Peminatan            : " + peminatan);
        System.out.println("Bahasa Pemrograman   : " + bahasaPemrogramanFavorit);
        System.out.println("=".repeat(45));
    }
}