public class MahasiswaBeasiswa extends MahasiswaReguler {
    private double nilaiOrganisasi;

    public MahasiswaBeasiswa(String nim, String nama, double nilaiUTS, double nilaiUAS, double nilaiASN, double nilaiOrganisasi) {
        super(nim, nama, nilaiUTS, nilaiUAS, nilaiASN);
        this.nilaiOrganisasi = nilaiOrganisasi;
    }

    public double getNilaiOrganisasi() {
        return nilaiOrganisasi;
    }

    public void setNilaiOrganisasi(double nilaiOrganisasi) {
        this.nilaiOrganisasi = nilaiOrganisasi;
    }

    @Override
    public double hitungNilaiAkhir() {
        double nilaiReguler = super.hitungNilaiAkhir();
        return (nilaiReguler * 0.90) + (this.nilaiOrganisasi * 0.10);
    }

    @Override
    public void tampilInfo() {
        System.out.println("NIM                 : " + getNim());
        System.out.println("Nama                : " + getNama());
        System.out.println("Nilai UTS           : " + getNilaiUTS());
        System.out.println("Nilai UAS           : " + getNilaiUAS());
        System.out.println("Nilai Tugas         : " + getNilaiASN());
        System.out.println("Nilai Organisasi    : " + nilaiOrganisasi);
        System.out.println("Nilai Akhir         : " + String.format("%.2f", hitungNilaiAkhir()));
        System.out.println("Grade               : " + getGrade());
    }
}
