package com.company;

import com.company.Biblioteca.Ejemplar;
import com.company.Socios.Socio;

import java.util.Date;

public class Prestamo {
    /*Se quiere modelar una representación de un objeto préstamo. Préstamo representa el préstamo de un
      ejemplar a un socio. En principio, posee un ejemplar (Ejemplar), un socio (Socio) y una fecha (Date). Los
      préstamos siempre vencen a los 5 días con lo que no es necesario registrar la fecha de finalización del préstamo.*/
    private Ejemplar unEjemplar;
    private Socio unSocio;
    private Date fecha;

    public Prestamo(Ejemplar unEjemplar, Socio unSocio) {
        this.unEjemplar = unEjemplar;
        this.unSocio = unSocio;
        this.fecha = new Date();
    }

    public Ejemplar getUnEjemplar() {
        return unEjemplar;
    }

    public Socio getUnSocio() {
        return unSocio;
    }

    public Date getFecha() {
        return fecha;
    }
}
