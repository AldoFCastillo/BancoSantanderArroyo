package com.company.Socios;

public class SocioClasico extends Socio {

    public static final Integer MAXIMO_DE_LIBROS = 3;

    public SocioClasico(String nombre, String apellido, Integer numeroDeID) {
        super(nombre, apellido, numeroDeID, MAXIMO_DE_LIBROS);
    }

    public static Integer getMaximoDeLibros() {
        return MAXIMO_DE_LIBROS;
    }
}
