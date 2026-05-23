

class Mahasiswa extends Manusia
{
    String nim;
    
    public Mahasiswa() {} // default constructor
    public Mahasiswa(String nim, String nama)
    {
        this.nim = nim;
        this.nama = nama;
    }
    
    public void setNim(String nim)
    {
        this.nim = nim;
    }
    
    public String getNim()
    {
        return this.nim;
    }

    public String getNama()
    {
        return this.nama;
    }
}
