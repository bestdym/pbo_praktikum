package mesin;

public class Mesin {

    private int    jumlahSilinder;
    private double kapasitasSilinder;
    private String langkah;

    public Mesin(int jumlahSilinder, double kapasitasSilinder, String langkah) {
        this.jumlahSilinder    = jumlahSilinder;
        this.kapasitasSilinder = kapasitasSilinder;
        this.langkah           = langkah;
    }

    public int getJumlahSilinder() {
        return jumlahSilinder;
    }
    public void setJumlahSilinder(int jumlahSilinder) {
        this.jumlahSilinder = jumlahSilinder;
    }

    public double getKapasitasSilinder() {
        return kapasitasSilinder;
    }
    public void setKapasitasSilinder(double kapasitasSilinder) {
        this.kapasitasSilinder = kapasitasSilinder;
    }

    public String getLangkah() {
        return langkah;
    }
    public void setLangkah(String langkah) {
        this.langkah = langkah;
    }
}