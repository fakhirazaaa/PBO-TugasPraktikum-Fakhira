package P3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PembelanjaanIO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Nama: ");
        String nama = reader.readLine();

        System.out.print("Masukkan Total Belanja: ");
        double totalBelanja = Double.parseDouble(reader.readLine());

        System.out.print("Masukkan Diskon (%): ");
        double diskonPersen = Double.parseDouble(reader.readLine());

        double diskon = totalBelanja * (diskonPersen / 100);
        double total = totalBelanja - diskon;

        System.out.print("Masukkan Pembayaran (Bayar): ");
        double bayar = Double.parseDouble(reader.readLine());

        double kembalian = bayar - total;

        System.out.println("\n--- STRUK PEMBELANJAAN ---");
        System.out.println("Nama          : " + nama);
        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : Rp " + diskon);
        System.out.println("Total         : Rp " + total);
        System.out.println("Bayar         : Rp " + bayar);
        System.out.println("Kembalian     : Rp " + kembalian);
    }
}