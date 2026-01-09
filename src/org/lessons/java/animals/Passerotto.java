package org.lessons.java.animals;

public class Passerotto extends AbstractAnimals{

    // utilizzo metodo astratto verso tramite override
    @Override
    public void verso() {
        System.out.println("Cip cip");
    }

    // utilizzo metodo astratto mangia tramite override
    @Override
    public void mangia() {
        System.out.println("Semi");
    }

}
