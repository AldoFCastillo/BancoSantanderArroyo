package com.company;

//STATIC ="SOLO DE LA CLASE" FINAL= INMODIFICABLE

public class Auto extends Vehiculo {
    public static final Double PESO_DE_AUTO=1000.0;
    public static final Integer RUEDAS_DE_AUTO=4;

    public Auto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        super(velocidad, aceleracion,anguloDeGiro, patente, PESO_DE_AUTO, RUEDAS_DE_AUTO);

    }
}
