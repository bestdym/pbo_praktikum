public class TesKemanusiaan {
    public static void printInfo(ManusiaKemanusiaan man) {
        man.getNama();
    }
    public static void main(String[] args) {
        ManusiaKemanusiaan orang1 = new MahasiswaKemanusiaan();
        ManusiaKemanusiaan orang2 = new DosenKemanusiaan();
        orang1.nama = "Andi";
        orang2.nama = "Toni";
        printInfo(orang1);
        printInfo(orang2);

        ManusiaKemanusiaan orang3 = (ManusiaKemanusiaan) orang1;
        orang3.nama = "Budi";
        printInfo(orang3);
    }
}

class ManusiaKemanusiaan {
    String nama;
    String getNama() {
        System.out.println("Manusia nama: "+nama);
        return nama;
    }
}

class MahasiswaKemanusiaan extends ManusiaKemanusiaan {
    String getNama() {
        System.out.println("Mahasiswa nama: "+nama);
        return nama;
    }
}

class DosenKemanusiaan extends ManusiaKemanusiaan {
    String getNama() {
        System.out.println("Dosen nama: "+nama);
        return nama;
    }
}
