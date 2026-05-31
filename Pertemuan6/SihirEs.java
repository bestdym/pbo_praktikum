package Pertemuan6;

public class SihirEs extends Serangan {

    private String[] daftarSihir = { "Tombak Es", "Badai Salju" };
    private int indexSihir = 0;

    public SihirEs() {
        this.tipeEfek = "Magic Damage + Freeze";
        System.out.println("Saya memiliki sihir berupa Tombak Es");
    }

    @Override
    public void serang(String namaPengguna) {
        this.namaSenjata = daftarSihir[indexSihir % daftarSihir.length];
        indexSihir++;
        this.lastUsed = true;
        System.out.println(namaPengguna + " merapalkan " + namaSenjata);
    }

    @Override
    public void efek(String namaPengguna) {
        this.lastUsed = false;
        System.out.println(namaPengguna + " memberikan efek " + tipeEfek);
    }
}
