package com.company.Biblioteca;

public class Ejemplar {

    /*1. Realizar un diagrama de clase que modele a un Ejemplar de una biblioteca.
      En principio, un ejemplar tiene un Libro (Libro), un número de edición (Integer) y una ubicación(String).
      2. Implementar la clase creando los atributos que sean necesarios.*/

    private Integer numeroDeEdicion;
    private String ubicacion;
    private Libro unLibro;

    public Ejemplar(Integer numeroDeEdicion, String ubicacion, Libro unLibro) {
        this.numeroDeEdicion = numeroDeEdicion;
        this.ubicacion = ubicacion;
        this.unLibro = unLibro;

    }

    public Integer getNumeroDeEdicion() {
        return numeroDeEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Libro getUnLibro() {
        return unLibro;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ejemplar)) {
            return false;
        }
        Ejemplar otroEjemplar = (Ejemplar) obj;
        return otroEjemplar.getNumeroDeEdicion().equals(numeroDeEdicion);
    }
}
