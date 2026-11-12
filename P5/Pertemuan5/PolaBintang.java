/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5.Pertemuan5;

/**
 *
 * @author HP
 */
public class PolaBintang {
    public static void main(String[] args) {
        int n = 5; 

        System.out.println("Half Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle:");
        int[] barisBintang = {1, 3, 5, 3, 1};
        int[] jumlahSpasi = {2, 1, 0, 1, 2}; 

        for (int i = 0; i < barisBintang.length; i++) {
            for (int s = 0; s < jumlahSpasi[i]; s++) {
                System.out.print("  ");
            }
            for (int j = 0; j < barisBintang[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}