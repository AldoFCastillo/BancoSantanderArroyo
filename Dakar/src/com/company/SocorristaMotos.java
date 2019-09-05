package com.company;

public abstract class SocorristaMotos implements Socorrista {

     @Override
    public void socorrer(Moto unaMoto) {
        System.out.println("Socorriendo moto "+ unaMoto.getPatente());
    }
}
