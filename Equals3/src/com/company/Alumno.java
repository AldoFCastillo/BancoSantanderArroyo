package com.company;

public class Alumno {

    private String nombre;
    private Integer numeroDeAlumno;

    public Alumno(String nombre, Integer numeroDeAlumno) {
        this.nombre = nombre;
        this.numeroDeAlumno = numeroDeAlumno;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno otroAlumno=(Alumno)obj;
        return (this.numeroDeAlumno.equals(otroAlumno.numeroDeAlumno));
    }
}
