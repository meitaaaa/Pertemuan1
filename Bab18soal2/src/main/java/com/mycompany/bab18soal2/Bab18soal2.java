/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal2;

/**
 *
 * @author Wpras
 */
class Bab18soal2 {
    public static void main(String args[]) {
        try {
            // Kode di bawah ini tidak akan melempar exception
            float data = 500 / 15;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Blok finally akan selalu dieksekusi");
        }
    }
}
