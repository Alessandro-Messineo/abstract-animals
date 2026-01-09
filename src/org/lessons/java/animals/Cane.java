package org.lessons.java.animals;

public class Cane extends AbstractAnimals {

    // utilizzo metodo astratto verso tramite override
    @Override
    public void verso(){
        System.out.println("Bau");
    }

    // utilizzo metodo astratto mangia tramite override
    @Override
    public void mangia(){
        System.out.println("Crocchette");
    }

}
