package praktikum;

public class UbahString {
    public static void main(String[] args) {
        String a = "Saya Belajar Java";
        String b = "Saya Belajar Java";
        
        // Perbaikan: Hapus kata "System." di depan String
        String aKecil = a.toLowerCase();
        String bBesar = b.toUpperCase();
        
        // Output yang dirapikan
        System.out.println("========================================");
        System.out.println("                UBAH STRING        ");
        System.out.println("========================================");
        System.out.println(" Teks Awal    : Saya Belajar Java");
        System.out.println("----------------------------------------");
        System.out.println(" - Menjadi Huruf Kecil:");
        System.out.println("   " + aKecil);
        System.out.println(" - Menjadi Huruf Besar:");
        System.out.println("   " + bBesar);
        System.out.println("========================================");
    }
}