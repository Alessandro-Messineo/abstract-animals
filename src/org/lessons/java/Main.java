package org.lessons.java;

import org.lessons.java.animals.AbstractAnimals;
import org.lessons.java.animals.Cane;
import org.lessons.java.animals.Delfino;

public class Main {
    public static void main(String[] args) {

        AbstractAnimals c1 = new Cane();
        Cane c2 = new Cane();

        Delfino d1 = new Delfino();

        c1.verso();
        c2.verso();

        c1.mangia();
        c1.dormi();

        d1.verso();

    }
}
