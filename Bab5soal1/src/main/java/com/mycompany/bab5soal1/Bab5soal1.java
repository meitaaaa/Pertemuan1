/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal1;

/**
 *
 * @author Wpras
 */

import java.util.Scanner; 

/**
 *
 * @author Wpras
 */
public class Bab5soal1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan NIM: ");
        int NIM = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("Masukkan Nama Karyawan: ");
        String Nama_Karyawan = input.nextLine();

        System.out.print("Masukkan Kelas: ");
        String Kelas = input.nextLine();

        System.out.print("Masukkan Usia: ");
        double Usia = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan: ");
        double Tinggi_badan = input.nextDouble();

        // Output data karyawan
        System.out.println("\nOutput Pendataan Karyawan:");
        System.out.println("NIM : " + NIM);
        System.out.println("Nama Karyawan : " + Nama_Karyawan);
        System.out.println("Kelas : " + Kelas);
        System.out.println("Usia : " + Usia);
        System.out.println("Tinggi : " + Tinggi_badan);

        input.close();
    } 
   }
