package com.company;

public class Moto extends Vehiculo {
    public static final Double PESO_DE_MOTO=300.0;
    public static final Integer RUEDAS_DE_MOTO=2;

    public Moto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente, PESO_DE_MOTO, RUEDAS_DE_MOTO);
    }
}
