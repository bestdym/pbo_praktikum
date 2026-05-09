package kendaraan;

import mesin.Mesin;

public class SepedaMotor {

    private String bahanBakar;
    private Mesin  mesin;
    private String merk;        

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

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
}