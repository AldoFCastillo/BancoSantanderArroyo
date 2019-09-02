package com.company;

public class Coca {
    private Integer tamanio;
    private Double precio;

    public Coca(Integer tamanio, Double precio) {
        this.tamanio = tamanio;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        Coca otraCoca = (Coca)obj;
        return (otraCoca.tamanio.equals(this.tamanio));
    }
}
