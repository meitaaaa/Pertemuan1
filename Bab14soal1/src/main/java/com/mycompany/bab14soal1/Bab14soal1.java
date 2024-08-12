/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14soal1;

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

class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Meong-meong!");
    }
}

class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Guk-guk!");
    }
}

public class Bab14soal1 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.suara();
        kucing.suara2();

        Anjing anjing = new Anjing();
        anjing.suara();
        anjing.suara2();
    }
}
