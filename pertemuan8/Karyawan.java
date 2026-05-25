class Karyawan extends Manusia
{
    String nip;

    public Karyawan() {} // default konstruktor
    public Karyawan(String nip, String nama)
    {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNIP(String nip)
    {
        this.nip = nip;
    }

    public String getNIP()
    {
        return this.nip;
    }

    public void makan() //override dari Manusia
    {
        System.out.println("Karyawan makan di RM padang");
    }
}
