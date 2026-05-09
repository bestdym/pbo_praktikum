import kendaraan.Mobil;
import kendaraan.SepedaMotor;
import mesin.Mesin;

public class Utama {

    public static void main(String[] args) {

        System.out.println("Nama    : Dimas Nurdiansyah");
        System.out.println("NIM     : 251110058\n");
        System.out.println("DEALER JOGJA ISTIMEWA");         
        System.out.println("=".repeat(40));

        Mesin mesinMotor = new Mesin(1, 150.0, "2-Tak");

        SepedaMotor motor = new SepedaMotor();
        motor.setBahanBakar("Pertalite");
        motor.setMesin(mesinMotor);
        motor.setMerk("Yamaha");

        System.out.println("DATA SEPEDA MOTOR");
        System.out.println("Merk                  : " + motor.getMerk());
        System.out.println("Bahan Bakar           : " + motor.getBahanBakar());
        System.out.println("Spesifikasi Mesin :");
        System.out.println("Jumlah Silinder       : " + motor.getMesin().getJumlahSilinder());       
        System.out.println("Kapasitas Silinder    : " + motor.getMesin().getKapasitasSilinder() + " CC"); 
        System.out.println("Langkah               : " + motor.getMesin().getLangkah());               

        System.out.println();

        Mesin mesinMobil = new Mesin(4, 1500.0, "4-Tak");

        Mobil mobil = new Mobil();
        mobil.setBahanBakar("Pertamax");
        mobil.setMesin(mesinMobil);
        mobil.setJumlahPintu(4);

        System.out.println("DATA MOBIL");
        System.out.println("Jumlah Pintu          : " + mobil.getJumlahPintu());
        System.out.println("Bahan Bakar           : " + mobil.getBahanBakar());
        System.out.println("Spesifikasi Mesin :");
        System.out.println("Jumlah Silinder       : " + mobil.getMesin().getJumlahSilinder());       
        System.out.println("Kapasitas Silinder    : " + mobil.getMesin().getKapasitasSilinder() + " CC");
        System.out.println("Langkah               : " + mobil.getMesin().getLangkah());               
    }
}