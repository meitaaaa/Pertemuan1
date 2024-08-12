/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14soal2;

/**
 *
 * @author Wpras
 */
abstract class AbstrakHewan {
    // Method abstract
    public abstract void suara();

    // Method non-abstract (konkrit)
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}

class Burung extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
}

public class Bab14soal2 {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.suara();
    }
}

