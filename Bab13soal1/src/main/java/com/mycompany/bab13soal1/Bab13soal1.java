/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal1;

/**
 *
 * @author Wpras
 */
class Kalkulator {
    // Metode penambahan (overloaded)
    public int tambah(int a, int b) {
        return a + b;
    }

    // Metode pengurangan (overloaded)
    public int kurang(int a, int b) {
        return a - b;
    }

    // Metode perkalian (overloaded)
    public int kali(int a, int b) {
        return a * b;
    }

    // Metode pembagian (overloaded)
    public double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}

public class Bab13soal1 {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int hasilTambah = kalkulator.tambah(20, 10);
        int hasilKurang = kalkulator.kurang(20, 10);
        int hasilKali = kalkulator.kali(20, 10);
        double hasilBagi = kalkulator.bagi(20.0, 10.0);

        System.out.println("Hasil Pertambahan: " + hasilTambah);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    }
}

