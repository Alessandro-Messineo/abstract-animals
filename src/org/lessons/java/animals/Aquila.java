package org.lessons.java.animals;

public class Aquila extends AbstractAnimals{

    // utilizzo metodo astratto verso tramite override
    @Override
    public void verso() {
        System.out.println("Strida");
    }

    // utilizzo metodo astratto mangia tramite override
    @Override
    public void mangia() {
        System.out.println("Carne");
    }

}
