

public class Utama 
{
    public static void main(String[] args) 
    {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.setNim("123");
        mhs.setNama("Budi");
        
        System.out.println("NIM : " + mhs.getNim());
        System.out.println("Nama : " + mhs.getNama());
    }
}

