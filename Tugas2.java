public class Tugas2 {
    public static void main(String args[]) {
        String nama = "Dimas Nurdiansyah";
        int nim = 251110058;

        System.out.println("Nama     : " + nama);  
        System.out.println("NIM      : " + nim);

        System.out.println("1. Perulangan angka 50 sampai 1:");
        for (int i = 50; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("2. Bilangan prima dari 1 sampai 50:");
        for (int i = 2; i <= 50; i++) {
            boolean isPrima = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            
            if (isPrima) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\n\nTerimakasih");
    }
}