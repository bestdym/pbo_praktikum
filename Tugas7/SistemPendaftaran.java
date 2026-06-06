import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class SistemPendaftaran {
    private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nSISTEM PENDAFTARAN MAHASISWA");
            System.out.println("1. Daftarkan Mahasiswa (Reguler)");
            System.out.println("2. Daftarkan Mahasiswa Informatika");
            System.out.println("3. Tampilkan Semua Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            try {
                String pilihan = reader.readLine();
                if (pilihan == null) continue;

                switch (pilihan.trim()) {
                    case "1":
                        daftarMahasiswaReguler();
                        break;
                    case "2":
                        daftarMahasiswaInformatika();  
                        break;
                    case "3":
                        tampilkanSemua();
                        break;
                    case "4":
                        System.out.println("Terima kasih! Program selesai.");
                        running = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
                }
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan sistem saat membaca input.");
            }
        }
    }

    private static void daftarMahasiswaReguler() {
        try {
            System.out.print("Masukkan Nama   : ");
            String nama = reader.readLine();
            System.out.print("Masukkan Email  : ");
            String email = reader.readLine();
            System.out.print("Masukkan NIM    : ");
            String nim = reader.readLine();
            System.out.print("Masukkan IPK    : ");
            String ipkStr = reader.readLine();

            double ipk = Double.parseDouble(ipkStr);

            if (ipk < 0.0 || ipk > 4.0) {
                throw new IllegalArgumentException("IPK harus berada di antara 0.0 dan 4.0");
            }

            for (Mahasiswa m : daftarMahasiswa) {
                if (m.getNim().equalsIgnoreCase(nim)) {
                    throw new NIMSudahAdaException("NIM '" + nim + "' sudah terdaftar di sistem!");
                }
            }

            Mahasiswa baru = new Mahasiswa(nama, email, nim, ipk);
            daftarMahasiswa.add(baru);
            System.out.println("Mahasiswa Reguler berhasil didaftarkan!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Format IPK tidak valid. Harap masukkan angka (contoh: 3.5).");
            // Mencetak jejak stack error ke konsol untuk melacak lokasi exception
            e.printStackTrace(); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error Validasi: " + e.getMessage());
        } catch (NIMSudahAdaException e) {
            System.out.println("Error Pendaftaran: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        }
    }

    private static void daftarMahasiswaInformatika() {
        try {
            System.out.print("Masukkan Nama                    : ");
            String nama = reader.readLine();
            System.out.print("Masukkan Email                   : ");
            String email = reader.readLine();
            System.out.print("Masukkan NIM                     : ");
            String nim = reader.readLine();
            System.out.print("Masukkan IPK                     : ");
            String ipkStr = reader.readLine();
            System.out.print("Masukkan Peminatan               : ");
            String peminatan = reader.readLine();
            System.out.print("Masukkan Bahasa Pemrograman Favorit : ");
            String bahasa = reader.readLine();

            double ipk = Double.parseDouble(ipkStr);
            
            if (ipk < 0.0 || ipk > 4.0) {
                throw new IllegalArgumentException("IPK harus berada di antara 0.0 dan 4.0");
            }

            for (Mahasiswa m : daftarMahasiswa) {
                if (m.getNim().equalsIgnoreCase(nim)) {
                    throw new NIMSudahAdaException("NIM '" + nim + "' sudah terdaftar di sistem!");
                }
            }

            MahasiswaInformatika baru = new MahasiswaInformatika(nama, email, nim, ipk, peminatan, bahasa);
            daftarMahasiswa.add(baru); 
            System.out.println("Mahasiswa Informatika berhasil didaftarkan!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Format IPK tidak valid. Harap masukkan angka (contoh: 3.5).");
            e.printStackTrace(); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error Validasi: " + e.getMessage());
        } catch (NIMSudahAdaException e) {
            System.out.println("Error Pendaftaran: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        }
    }

    private static void tampilkanSemua() {
        System.out.println("\nDAFTAR MAHASISWA TERDAFTAR");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa yang terdaftar.");
        } else {
            for (Mahasiswa m : daftarMahasiswa) {
                m.tampilkanInfo();
            }
        }
    }
}