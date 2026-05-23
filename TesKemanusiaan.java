public class TesKemanusiaan {
    public static void printInfo(Manusia man) {
        man.getNama();
    }
    public static void main(String[] args) {
        Manusia orang1 = new Mahasiswa();
        Manusia orang2 = new Dosen();
        orang1.nama = "Andi";
        orang2.nama = "Toni";
        printInfo(orang1);
        printInfo(orang2);

        Manusia orang3 = (Manusia) orang1;
        orang3.nama = "Budi";
        printInfo(orang3);
    }
}

class Manusia {
    String nama;
    String getNama() {
        System.out.println("Manusia nama: "+nama);
        return nama;
    }
}

class Mahasiswa extends Manusia {
    String getNama() {
        System.out.println("Mahasiswa nama: "+nama);
        return nama;
    }
}

class Dosen extends Manusia {
    String getNama() {
        System.out.println("Dosen nama: "+nama);
        return nama;
    }
}
