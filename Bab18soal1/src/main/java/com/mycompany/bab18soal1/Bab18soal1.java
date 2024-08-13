/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal1;

/**
 *
 * @author Wpras
 */
public class Bab18soal1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Ini akan melempar ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}

/* Blok try-catch digunakan untuk menangani exception yang mungkin terjadi.
throw digunakan untuk secara eksplisit melempar exception sesuai dengan kondisi yang kita tentukan. */