package praktikum;

public class WaktuCahaya {
    public static void main(String[] args) {
        double kecepatanCahaya = 300000.0; // km/s
        double jarakBulan = 384400.0; // km
        double jarakMatahari = 152100000.0; // 152.1 juta km
        
        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;
        
        System.out.println("Waktu tempuh Bumi ke Bulan: " + waktuBulan + " detik");
        System.out.println("Waktu tempuh Bumi ke Matahari: " + waktuMatahari + " detik (" + (waktuMatahari / 60) + " menit)");
    }
}