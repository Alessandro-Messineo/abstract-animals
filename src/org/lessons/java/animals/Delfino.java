package org.lessons.java.animals;

import org.lessons.java.interfaces.INuotante;

public class Delfino extends AbstractAnimals implements INuotante{

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

    //utilizzo metodo nuota di un interfaccia
    @Override
    public void nuota(){
        System.out.println("Sto nuotando");
    }

}
