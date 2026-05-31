package Pertemuan6;

public abstract class Serangan {
    protected String tipeEfek;
    protected String namaSenjata; 
    protected boolean lastUsed;   
    
    public abstract void serang(String namaPengguna);
    public abstract void efek(String namaPengguna);
}
