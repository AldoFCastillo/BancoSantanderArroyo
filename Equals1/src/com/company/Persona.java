package com.company;

public class Persona {
    private String nombre;
    private Integer dni;

    public Persona(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object obj){
        Persona otraPersona=(Persona)obj;
        return (this.dni.equals(otraPersona.dni));
    }
}
