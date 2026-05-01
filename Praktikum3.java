// 1. Kelas Titik
class Titik {
    private double x; 
    private double y; 

    public Titik(double x, double y) {
        this.x = x; 
        this.y = y; 
    }

    public double hitungJarak(Titik titikLain) {
        double selisihX = titikLain.x - this.x; 
        double selisihY = titikLain.y - this.y;
        return Math.sqrt(Math.pow(selisihX, 2) + Math.pow(selisihY, 2));
    }

    public double getX() { return x; }
    public double getY() { return y; }
}

// 2. Kelas Mahasiswa
class Mahasiswa {
    private String nama;
    private String nim;
    private int semester;
    private String peminatan; 
    private String alamat;    

    // Konstruktor
    public Mahasiswa(String nama, String nim, int semester, String peminatan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.peminatan = peminatan;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public int getSemester() { return semester; }   
    public void setSemester(int semester) { this.semester = semester; }

    public String getPeminatan() { return peminatan; }
    public void setPeminatan(String peminatan) { this.peminatan = peminatan; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    // Metode untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama       : " + this.nama);
        System.out.println("NIM        : " + this.nim);
        System.out.println("Semester   : " + this.semester);
        System.out.println("Peminatan  : " + this.peminatan);
        System.out.println("Alamat     : " + this.alamat);
    }
}

// Class Utama
public class Praktikum3 {
    public static void main(String[] args) {
        // Print identitas Dimas
        System.out.println("Nama : DIMAS NURDIANSYAH");
        System.out.println("NIM  : 251110058\n");

        // Eksekusi Kelas Titik 
        System.out.println("OPERASI KELAS TITIK");
        Titik titikA = new Titik(0.0, 1.0); 
        Titik titikB = new Titik(3.9, 4.5); 
        
        System.out.printf("Jarak antara Titik A (%.1f, %.1f) dan Titik B (%.1f, %.1f) adalah: %.2f\n", 
        titikA.getX(), titikA.getY(), titikB.getX(), titikB.getY(), titikA.hitungJarak(titikB));
        System.out.println();

        //Eksekusi Kelas Mahasiswa 
        System.out.println("DATA MAHASISWA");
        Mahasiswa mhs = new Mahasiswa("Dimas Nurdiansyah", "251110058", 1, "Web Development", "Bantul");
        mhs.tampilkanData();

        // Perubahan data Mahasiswa
        System.out.println();
        System.out.println("Setelah Update Data melalui Setter:");
        mhs.setSemester(2); 
        mhs.setPeminatan("Full Stack Developer");
        mhs.setAlamat("Kota Yogyakarta");
        
        // Menampilkan data setelah update
        mhs.tampilkanData();
    }
}