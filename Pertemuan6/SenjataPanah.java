package Pertemuan6;

public class SenjataPanah extends Serangan {
    
    private String[] daftarSenjata = { "Panah Beracun", "Panah Petir" };
    private int indexSenjata = 0;

    public SenjataPanah() {
        this.tipeEfek = "Physical Damage + Poison";
        System.out.println("Saya memiliki senjata berupa Panah Beracun");
    }

    @Override
    public void serang(String namaPengguna) {
        this.namaSenjata = daftarSenjata[indexSenjata % daftarSenjata.length];
        indexSenjata++;
        this.lastUsed = true;
        System.out.println(namaPengguna + " menembakkan " + namaSenjata);
    }

    @Override
    public void efek(String namaPengguna) {
        this.lastUsed = false;
        System.out.println(namaPengguna + " memberikan efek " + tipeEfek);
    }
}
