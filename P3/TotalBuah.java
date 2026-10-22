package P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TotalBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int manggaAwal = 70;
        int manggaBusuk = 15;
        int manggaDibeli = manggaAwal - manggaBusuk;

        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;
        int totalJambu = jumlahTetangga * jambuPerTetangga;

        int totalBuahKeseluruhan = manggaDibeli + totalJambu;

        System.out.println("=== PROGRAM PERHITUNGAN BUAH IBU SISCA ===");
        System.out.println("Mangga awal : 70 pcs");
        System.out.println("Mangga busuk yang dikembalikan : 15 pcs");
        System.out.println("Jumlah mangga bersih : " + manggaDibeli + " pcs");
        System.out.println("Jambu untuk 4 tetangga (@30 pcs) : " + totalJambu + " pcs");
        System.out.println("----------------------------------------");
        System.out.println("Total keseluruhan buah yang dibeli : " + totalBuahKeseluruhan + " pcs");
    }
}