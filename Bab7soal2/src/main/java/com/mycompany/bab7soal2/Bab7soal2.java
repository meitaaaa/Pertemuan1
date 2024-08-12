/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;

/**
 *
 * @author Wpras
 */
import java.util.Scanner;

public class Bab7soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM: ");
        int nim = scanner.nextInt();

        scanner.nextLine(); // Consume newline left by nextInt()

        System.out.print("NAMA: ");
        String nama = scanner.nextLine();

        System.out.print("TAHUN: ");
        int tahun = scanner.nextInt();

        scanner.nextLine(); // Consume newline left by nextInt()

        System.out.print("PILIH PEMINATAN (C/E/M): ");
        char peminatan = scanner.next().charAt(0);

        switch (tahun) {
            case 1:
                System.out.println("Bahasa Inggris, Matematika, Sain");
                break;
            case 2:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
                        break;
                    case 'E':
                        System.out.println("Algoritma, Logika Informatika");
                        break;
                    case 'M':
                        System.out.println("DBMS, Manajemen Proyek");
                        break;
                }
                break;
            case 3:
                switch (peminatan) {
                    case 'C':
                        System.out.println("Organisasi Komputer, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Perancangan Sistem, Pemrograman WEB");
                        break;
                    case 'M':
                        System.out.println("PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA 2");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                }
                break;
            default:
                System.out.println("Tahun tidak valid");
        }
    }
}