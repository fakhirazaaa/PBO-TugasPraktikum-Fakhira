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

public class TerbesarTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terbesar, terkecil, bilangan;

        System.out.print("Masukkan bilangan ke-1: ");
        bilangan = input.nextInt();
        terbesar = bilangan;
        terkecil = bilangan;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bilangan = input.nextInt();

            if (bilangan > terbesar) {
                terbesar = bilangan;
            }
            if (bilangan < terkecil) {
                terkecil = bilangan;
            }
        }

        System.out.println("\nBilangan terbesar adalah: " + terbesar);
        System.out.println("Bilangan terkecil adalah: " + terkecil);
    }
}