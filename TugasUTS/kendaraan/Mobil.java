package kendaraan;

import mesin.Mesin;

public class Mobil {

    private String bahanBakar;
    private Mesin  mesin;
    private int    jumlahPintu; 

    public String getBahanBakar() {
        return bahanBakar;
    }
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public Mesin getMesin() {
        return mesin;
    }
    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
}