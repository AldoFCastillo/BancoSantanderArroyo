package com.company.Animales;

public class Oveja extends Animal {
    private Double kilosDeLana;


    public Oveja(String fechaDeNac, Integer patente,Double kilosDeLana) {
        super(fechaDeNac, patente);
        this.kilosDeLana=kilosDeLana;
    }
}
