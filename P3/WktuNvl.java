package P3;

import java.util.Scanner;

public class WktuNvl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan tebal lembar per novel: ");
        int tebalPerNovel = input.nextInt();

        long totalLembar = (long) jumlahNovel * tebalPerNovel;
        long totalDetik = totalLembar; // Karena kecepatan 1 lembar/detik

        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\n=== HASIL PERHITUNGAN WAKTU PERCETAKAN ===");
        System.out.println("Total Lembar yang dicetak : " + totalLembar + " lembar");
        System.out.println("Waktu pengerjaan          : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");

        input.close();
    }
}