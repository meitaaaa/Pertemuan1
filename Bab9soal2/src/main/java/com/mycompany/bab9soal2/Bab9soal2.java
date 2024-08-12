/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;

/**
 *
 * @author Wpras
 */
import java.util.Scanner;

public class Bab9soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan awal: ");
        int bilanganAwal = scanner.nextInt();

        System.out.print("Masukkan bilangan akhir: ");
        int bilanganAkhir = scanner.nextInt();

        System.out.print("Hasil deret bilangan: ");

        // Menampilkan deret bilangan dengan pertambahan 5
        for (int i = bilanganAwal; i <= bilanganAkhir; i += 5) {
            System.out.print(i);
            if (i + 5 <= bilanganAkhir) {
                System.out.print(", ");
            }
        }

        System.out.println(); // Baris baru
    }
}

