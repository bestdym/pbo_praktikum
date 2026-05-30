package Pertemuan6;

public class MainCharacter {
    private String nama;
    private Serangan lastSerangan;

    public MainCharacter(String nama) {
        this.nama = nama;
        System.out.println("Saya " + nama);
        System.out.println("Saya tergabung di kubu Demon King, untuk menyerang Hero");
    }

    public void serang(Serangan serangan) {
        this.lastSerangan = serangan;
        serangan.serang(this.nama);
    }

    public void efek() {
        if (this.lastSerangan != null) {
            this.lastSerangan.efek(this.nama);
        }
    }
}
