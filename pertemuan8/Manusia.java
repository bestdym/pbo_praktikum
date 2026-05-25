class Manusia
{
    String nama;

    public Manusia() {} // default konstruktor
    public Manusia(String nama)
    {
        this.nama = nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return this.nama;
    }

    public void makan()
    {
        System.out.println("Manusia makan");
    }
}
