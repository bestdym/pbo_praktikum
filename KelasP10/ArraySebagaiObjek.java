package KelasP10;

public class ArraySebagaiObjek {
    public static void main(String[] args) {
        // 1. Membuktikan bahwa array adalah objek
        int[] angka = {1, 2, 3};
        
        System.out.println("=== Bukti Array adalah Objek ===");
        // Menggunakan instanceof Object
        if (angka instanceof Object) {
            System.out.println("int[] angka adalah instance dari Object");
        }
        
        // Menampilkan nama class dari array
        System.out.println("Nama class dari array: " + angka.getClass().getName());
        
        // Memanggil method dari class Object
        System.out.println("Hashcode array: " + angka.hashCode());
        System.out.println("String representation: " + angka.toString());

        // 2. Membuat multidimensional array (array dalam array)
        System.out.println("\n=== Multidimensional Array (Array dalam Array) ===");
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Menampilkan isi array multidimensi
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Bukti array multidimensi adalah array dari array
        System.out.println("\nBukti array multidimensi adalah array dari array:");
        System.out.println("Tipe matriks: " + matriks.getClass().getName());
        System.out.println("Tipe matriks[0]: " + matriks[0].getClass().getName());
    }
}
