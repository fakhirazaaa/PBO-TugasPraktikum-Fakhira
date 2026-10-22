/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class tugas2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float jari, keliling, luas;
        final float PI = 3.14f;

        System.out.print("Masukkan jari-jari: ");
        jari = input.nextFloat();

        luas = PI * jari * jari;
        keliling = 2 * PI * jari;

        System.out.println(luas);
        System.out.println(keliling);
    }
}
