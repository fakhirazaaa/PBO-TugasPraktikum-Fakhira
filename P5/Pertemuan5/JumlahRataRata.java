/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5.Pertemuan5;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class JumlahRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double total = 0, rataRata;

        System.out.print("Masukkan jumlah bilangan yang ingin diinput: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            double angka = input.nextDouble();
            total += angka;
        }

        rataRata = total / n;

        System.out.println("\nTotal jumlah bilangan: " + total);
        System.out.println("Rata-rata bilangan: " + rataRata);
    }
}