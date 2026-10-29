package praktikum.P4;

import java.util.Scanner;

public class KodeHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = input.nextInt();
        
        switch (kodeHari) {
            case 1:
                System.out.println("Nama Hari: Senin");
                break;
            case 2:
                System.out.println("Nama Hari: Selasa");
                break;
            case 3:
                System.out.println("Nama Hari: Rabu");
                break;
            case 4:
                System.out.println("Nama Hari: Kamis");
                break;
            case 5:
                System.out.println("Nama Hari: Jumat");
                break;
            case 6:
                System.out.println("Nama Hari: Sabtu");
                break;
            case 7:
                System.out.println("Nama Hari: Minggu");
                break;
            default:
                System.out.println("Kode hari tidak valid! Masukkan angka 1 - 7.");
                break;
        }
        
        input.close();
    }
}