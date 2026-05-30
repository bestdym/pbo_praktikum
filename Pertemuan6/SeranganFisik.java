package Pertemuan6;

public class SeranganFisik extends Serangan {
    
    private String[] daftarSenjata = { "Pedang Kutukan" };
    private int indexSenjata = 0;

    public SeranganFisik() {
        this.tipeEfek = "Physical Damage";
        System.out.println("Saya memiliki senjata berupa Pedang Kutukan");
    }

    @Override
    public void serang(String namaPengguna) {
        this.namaSenjata = daftarSenjata[indexSenjata % daftarSenjata.length];
        indexSenjata++;
        this.lastUsed = true;
        System.out.println(namaPengguna + " menggunakan " + namaSenjata);
    }

    @Override
    public void efek(String namaPengguna) {
        this.lastUsed = false;
        System.out.println(namaPengguna + " memberikan efek " + tipeEfek);
    }
}
