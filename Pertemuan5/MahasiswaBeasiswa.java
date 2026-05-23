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
        // WAJIB memanggil super.hitungNilaiAkhir() untuk mengambil hasil perhitungan dari kelas induk
        double nilaiReguler = super.hitungNilaiAkhir();
        return (nilaiReguler * 0.90) + (this.nilaiOrganisasi * 0.10);
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Nilai Org     : " + nilaiOrganisasi);
    }
}
