/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab12soal1;

/**
 *
 * @author Wpras
 */
class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;
    private double tunjanganMakan;
    private double transport;

    // Constructor dengan parameter
    public Karyawan(String idKaryawan, String namaKaryawan, String golongan, String jabatan,
                    double tunjanganMakan, double transport) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }

    // Metode untuk menghitung gaji total
    public double hitungGajiTotal() {
        return gajiPokok + tunjanganMakan + transport;
    }

    // Metode untuk menampilkan informasi karyawan
    public void tampilkanInfo() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Transport: " + transport);
        System.out.println("Gaji Total: " + hitungGajiTotal());
    }
}

public class Bab12soal1 {
    public static void main(String[] args) {
        // Membuat objek Karyawan dengan constructor parameter
        Karyawan systemAnalyst = new Karyawan("0001", "Agus Suharto", "2", "Supervisor",
                400000.0, 500000.0);

        // Menampilkan informasi karyawan
        System.out.println("Informasi Karyawan:");
        systemAnalyst.tampilkanInfo();
    }
}
