package mesin;

public class Mesin {

    // Atribut dengan hak akses public agar bisa diakses kelas lain
    public int jumlahSilinder;
    public double kapasitasSilinder; // dalam CC, contoh: 150.0
    public String langkah;           // contoh: "4-Tak" atau "2-Tak"

    // Constructor untuk mengisi nilai atribut saat objek dibuat
    public Mesin(int jumlahSilinder, double kapasitasSilinder, String langkah) {
        this.jumlahSilinder    = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
        this.langkah           = langkah;
    }
}