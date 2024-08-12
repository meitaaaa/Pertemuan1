/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal2;

/**
 *
 * @author Wpras
 */

import java.util.Scanner; 
public class Bab5soal2 {

    public static void main(String[] args) {
 
        Scanner myInput = new Scanner(System.in);

        System.out.println("Masukkan Alas Segitiga:");
        double alas = myInput.nextDouble();

        System.out.println("Masukkan Tinggi Segitiga:");
        double tinggi = myInput.nextDouble();

        double luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
    }
}
