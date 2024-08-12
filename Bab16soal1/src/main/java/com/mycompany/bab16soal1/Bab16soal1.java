/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16soal1;

/**
 *
 * @author Wpras
 */
abstract class OperasiAritmatika {
    protected double bilanganA;
    protected double bilanganB;

    public OperasiAritmatika(double a, double b) {
        this.bilanganA = a;
        this.bilanganB = b;
    }

    // Metode untuk menjumlahkan bilangan A dan B (abstrak)
    public abstract double tambah();

    // Metode untuk mengurangkan bilangan A dan B (abstrak)
    public abstract double kurang();

    // Metode untuk mengalikan bilangan A dan B (abstrak)
    public abstract double kali();

    // Metode untuk membagi bilangan A dengan B (abstrak)
    public abstract double bagi();
}

class OperasiAritmatikaImpl extends OperasiAritmatika {
    public OperasiAritmatikaImpl(double a, double b) {
        super(a, b);
    }

    @Override
    public double tambah() {
        return bilanganA + bilanganB;
    }

    @Override
    public double kurang() {
        return bilanganA - bilanganB;
    }

    @Override
    public double kali() {
        return bilanganA * bilanganB;
    }

    @Override
    public double bagi() {
        if (bilanganB != 0) {
            return bilanganA / bilanganB;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}

public class Bab16soal1 {
    public static void main(String[] args) {
        double bilanganA = 9.5;
        double bilanganB = 2.5;

        OperasiAritmatika operasi = new OperasiAritmatikaImpl(bilanganA, bilanganB);

        System.out.println("Hasil Penjumlahan: " + operasi.tambah());
        System.out.println("Hasil Pengurangan: " + operasi.kurang());
        System.out.println("Hasil Perkalian: " + operasi.kali());
        System.out.println("Hasil Pembagian: " + operasi.bagi());
    }
}
