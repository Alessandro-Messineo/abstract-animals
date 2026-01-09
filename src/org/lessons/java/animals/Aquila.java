package org.lessons.java.animals;

import org.lessons.java.interfaces.IVolante;

public class Aquila extends AbstractAnimals implements IVolante{

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

    //utilizzo metodo nuota di un interfaccia
    @Override
    public void vola(){
        System.out.println("Sto volando");
    }


}
