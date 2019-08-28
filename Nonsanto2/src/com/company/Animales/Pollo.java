package com.company.Animales;

public class Pollo extends Animal {

    private Integer huevos;

    public Pollo(String fechaDeNac, Integer patente, Integer huevos) {
        super(fechaDeNac, patente);
        this.huevos=huevos;
    }
}
