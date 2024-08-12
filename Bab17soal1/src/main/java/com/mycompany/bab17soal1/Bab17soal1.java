/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17soal1;

/**
 *
 * @author Wpras
 */
import java.util.Scanner;

public class Bab17soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter newline setelah angka

        String[] kota = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.nextLine();
        }

        System.out.println("Kota-kota yang dimasukkan:");
        for (String namaKota : kota) {
            System.out.println(namaKota);
        }
    }
}

