

public class Manusia {
    String nama;
    
    public Manusia() {} 
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
         System.out.println("metodo ini dioverride lho");
        return this.nama;
    }
}
