package P3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerbedaanScannerBufferedReader {
    public static void main(String[] args) throws IOException {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka (pakai Scanner): ");
        int angka = scanner.nextInt();
        System.out.println("Angka yang dimasukkan: " + angka);

        System.out.println("----------------------------------------");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan sebuah teks (pakai BufferedReader): ");
        String teks = reader.readLine();
        System.out.println("Teks yang dimasukkan: " + teks);
    }
}