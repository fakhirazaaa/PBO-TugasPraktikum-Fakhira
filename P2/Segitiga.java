package praktikum;

public class Segitiga {
    public static void main(String[] args) {
        // Diketahui dari soal nomor 5
        double a = 6; // tinggi
        double b = 8; // alas
        
        // Menghitung Luas Segitiga (Soal No. 5)
        double luas = 0.5 * b * a;
        
        // Menghitung Sisi Miring c dengan Pythagoras & Keliling (Soal No. 6)
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;
        
        // Output yang rapi dan terstruktur
        System.out.println("========================================");
        System.out.println("      PROGRAM PERHITUNGAN SEGITIGA      ");
        System.out.println("========================================");
        System.out.println(" Diketahui:");
        System.out.println(" - Sisi Tinggi (a) = " + (int)a);
        System.out.println(" - Sisi Alas (b)   = " + (int)b);
        System.out.println("----------------------------------------");
        System.out.println(" 1. Luas Segitiga");
        System.out.println("    Rumus        : 1/2 * alas * tinggi");
        System.out.println("    Hasil Luas   : " + luas);
        System.out.println("----------------------------------------");
        System.out.println(" 2. Pythagoras");
        System.out.println("    Rumus        : Akar(a^2 + b^2)");
        System.out.println("    Hasil c      : " + c);
        System.out.println("----------------------------------------");
        System.out.println(" 3. Keliling Segitiga");
        System.out.println("    Rumus        : a + b + c");
        System.out.println("    Hasil Keliling: " + keliling);
        System.out.println("========================================");
    }
}