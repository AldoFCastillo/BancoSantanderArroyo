package com.company.Animales;

public class Vaca extends Animal {

    private Double cantidadDeLeche;
    private Boolean vacaLoca;


    public Vaca(String fechaDeNac, Integer patente, Double cantidadDeLeche, Boolean vacaLoca) {
        super(fechaDeNac, patente);
        this.cantidadDeLeche=cantidadDeLeche;
        this.vacaLoca=vacaLoca;
    }



    }
}