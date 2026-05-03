package kendaraan;

public class Harga extends Merk {
    private double harga;

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return this.harga;
    }

    public String getHargaFormatted() {
        return String.format("Rp %,.0f", this.harga);
    }
}