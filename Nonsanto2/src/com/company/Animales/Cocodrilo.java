package com.company.Animales;

public class Cocodrilo extends Animal {

    private Double kilosDeCuero;

    public Cocodrilo(String fechaDeNac, Integer patente, Double kilosDeCuero) {
        super(fechaDeNac, patente);
        this.kilosDeCuero=kilosDeCuero;
    }
}
