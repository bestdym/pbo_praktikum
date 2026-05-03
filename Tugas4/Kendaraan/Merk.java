package kendaraan;

public class Merk extends Kendaraan {
    String namaMerk;

    public void setJenisKendaraan(String jenis) {
        this.jenisKendaraan = jenis;
    }

    public String getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setNamaMerk(String merk) {
        this.namaMerk = merk;
    }

    public String getNamaMerk() {
        return this.namaMerk;
    }
}