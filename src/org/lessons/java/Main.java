package org.lessons.java;

import org.lessons.java.animals.Aquila;
import org.lessons.java.animals.Cane;
import org.lessons.java.animals.Delfino;
import org.lessons.java.animals.Passerotto;
import org.lessons.java.interfaces.INuotante;
import org.lessons.java.interfaces.IVolante;

public class Main {

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {

        // AbstractAnimals c1 = new Cane();
        // Cane c2 = new Cane();

        // Delfino d1 = new Delfino();

        // c1.verso();
        // c2.verso();

        // c1.mangia();
        // c1.dormi();

        // d1.verso();

        Cane cane = new Cane();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        Passerotto passerotto = new Passerotto();


        faiVolare(aquila); 
        faiVolare(passerotto);
        faiNuotare(cane);
        faiNuotare(delfino); 

    }
}
