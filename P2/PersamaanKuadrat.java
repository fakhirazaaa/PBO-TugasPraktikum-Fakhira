package praktikum;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 5;
        
        int hasil = (b * b) - (4 * a * c);
        
        System.out.println("========================================");
        System.out.println("     PROGRAM HITUNG PERSAMAAN KUADRAT   ");
        System.out.println("========================================");
        System.out.println(" Diketahui nilai variabel:");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        System.out.println("----------------------------------------");
        System.out.println(" Rumus        : b^2 - 4ac");
        System.out.println(" Penyelesaian : (" + b + " x " + b + ") - (4 x " + a + " x " + c + ")");
        System.out.println(" Hasil        : " + hasil);
        System.out.println("========================================");
    }
}