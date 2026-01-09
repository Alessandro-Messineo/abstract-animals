package org.lessons.java.animals;

public class Delfino extends AbstractAnimals{

    // utilizzo metodo astratto verso tramite override
    @Override
    public void verso() {
        System.out.println("Fischia");
    }

    // utilizzo metodo astratto mangia tramite override
    @Override
    public void mangia() {
        System.out.println("Pesce");
    }

}
