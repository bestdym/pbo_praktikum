package Pertemuan6;

public class SeranganSihir extends Serangan {

    private String[] daftarSihir = { "Sihir Hitam", "Sihir Api Neraka" };
    private int indexSihir = 0;

    public SeranganSihir() {
        this.tipeEfek = "Magic Damage";
        System.out.println("Saya memiliki sihir berupa Sihir Hitam");
    }

    @Override
    public void serang(String namaPengguna) {
        this.namaSenjata = daftarSihir[indexSihir % daftarSihir.length];
        indexSihir++;
        this.lastUsed = true;
        System.out.println(namaPengguna + " menggunakan " + namaSenjata);
    }

    @Override
    public void efek(String namaPengguna) {
        this.lastUsed = false;
        System.out.println(namaPengguna + " memberikan efek " + tipeEfek);
    }
}
