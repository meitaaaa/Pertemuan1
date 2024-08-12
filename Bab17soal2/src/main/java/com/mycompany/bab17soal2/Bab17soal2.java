/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17soal2;

/**
 *
 * @author Wpras
 */
public class Bab17soal2 {
    public static void main(String[] args) {
        // Array multidimensi berisi nama negara dan ibukotanya
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Menampilkan data dari array
        for (String[] data : negaraIbukota) {
            String negara = data[0];
            String ibukota = data[1];
            System.out.println("Ibukota " + negara + " adalah " + ibukota);
        }
    }
}
