public class MahasiswaReguler extends Mahasiswa {
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiASN; // ASN/Tugas

    public MahasiswaReguler(String nim, String nama, double nilaiUTS, double nilaiUAS, double nilaiASN) {
        super(nim, nama);
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiASN = nilaiASN;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public double getNilaiASN() {
        return nilaiASN;
    }

    public void setNilaiASN(double nilaiASN) {
        this.nilaiASN = nilaiASN;
    }

    public double hitungNilaiAkhir() {
        return (0.30 * nilaiUTS) + (0.40 * nilaiUAS) + (0.30 * nilaiASN);
    }

    public String getGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 80.0) {
            return "A";
        } else if (nilaiAkhir >= 70.0) {
            return "B";
        } else if (nilaiAkhir >= 60.0) {
            return "C";
        } else if (nilaiAkhir >= 50.0) {
            return "D";
        } else {
            return "E";
        }
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Nilai UTS     : " + nilaiUTS);
        System.out.println("Nilai UAS     : " + nilaiUAS);
        System.out.println("Nilai Tugas   : " + nilaiASN);
        System.out.println("Nilai Akhir   : " + hitungNilaiAkhir());
        System.out.println("Grade         : " + getGrade());
    }
}
