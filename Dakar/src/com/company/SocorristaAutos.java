package com.company;


public abstract class SocorristaAutos implements Socorrista {

    @Override
    public void socorrer(Auto unAuto) {
        System.out.println("Socorriendo auto "+ unAuto.getPatente());


    }
}
