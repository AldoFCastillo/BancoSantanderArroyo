package com.company.Socios;

public class SocioVip extends Socio {
    /*Se quiere agregar al modelo anterior una nueva categoría de socios, los socios VIP. Dichos socios
      además de un nombre, un apellido y un número de identificación, tienen un valor de cuota mensual(Integer).
      1. ¿Cómo modificaría el diagrama de Socio que realizó anteriormente?
      2. Modificar la implementación contemplando los nuevos cambios. Crear las clases que sean
      necesarias.
      3. Crear los atributos necesarios.*/
    private Integer cuotaMensual;
    public static final Integer MAXIMO_DE_LIBROS_VIP = 15;

    public SocioVip(String nombre, String apellido, Integer numeroDeID, Integer cuotaMensual) {
        super(nombre, apellido, numeroDeID, MAXIMO_DE_LIBROS_VIP);
        this.cuotaMensual = cuotaMensual;
    }

    public Integer getCuotaMensual() {
        return cuotaMensual;
    }

    public static Integer getMaximoDeLibrosVip() {
        return MAXIMO_DE_LIBROS_VIP;
    }
}
