package com.company;

public class Empleado {
    private String nombre;
    private Integer numeroDeLegajo;

    public Empleado(String nombre, Integer numeroDeLegajo) {
        this.nombre = nombre;
        this.numeroDeLegajo = numeroDeLegajo;
    }

    @Override
    public boolean equals(Object obj) {
        Empleado otroEmpleado=(Empleado)obj;

        return (this.numeroDeLegajo.equals(otroEmpleado.numeroDeLegajo));
    }
}
