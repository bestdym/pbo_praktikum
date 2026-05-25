class Mahasiswa extends Manusia
{
    String nim;

    public Mahasiswa() {} // default konstruktor
    public Mahasiswa(String nim, String nama)
    {
        this.nim = nim;
        this.nama = nama;
    }

    public void setNIM(String nim)
    {
        this.nim = nim;
    }

    public String getNIM()
    {
        return this.nim;
    }

    public void makan() //override dari Manusia
    {
        System.out.println("Mahasiswa makan di burjo");
    }
}
