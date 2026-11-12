/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P5.Pertemuan5;

/**
 *
 * @author HP
 */
public class PerbedaanIncrement {
    public static void main(String[] args) {
        System.out.println("Menggunakan i++");
        int i = 1;
        while (i <= 3) {
            System.out.println("nilai i: " + (i++)); 
        }

        System.out.println("\nMenggunakan ++i");
        int j = 1;
        while (j <= 3) {
            System.out.println("nilai j: " + (++j)); 
        }
    }
}
