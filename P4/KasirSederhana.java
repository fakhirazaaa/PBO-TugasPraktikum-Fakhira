package praktikum.P4;

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apakah memiliki kartu member? (y/n): ");
        char member = input.next().toLowerCase().charAt(0);
        
        System.out.print("Masukkan Total Belanja (Rp): ");
        double totalBelanja = input.nextDouble();
        
        double diskon = 0;
        
        if (member == 'y') {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        
        double totalBayar = totalBelanja - diskon;
        
        System.out.println("\nTotal Belanja Setelah Diskon : Rp " + totalBayar);
        System.out.print("Masukkan Uang Pembayaran    : Rp ");
        double uangDiberikan = input.nextDouble();
        
        double kembalian = uangDiberikan - totalBayar;
        
        System.out.println("--- STRUK PEMBAYARAN ---");
        System.out.println("Total Belanja Awal : Rp " + totalBelanja);
        System.out.println("Diskon             : Rp " + diskon);
        System.out.println("Harus Dibayar      : Rp " + totalBayar);
        System.out.println("Uang Diterima      : Rp " + uangDiberikan);
        System.out.println("Kembalian          : Rp " + kembalian);
        
        input.close();
    }
}