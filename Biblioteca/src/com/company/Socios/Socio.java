package com.company.Socios;

import com.company.Biblioteca.Ejemplar;

import java.util.ArrayList;
import java.util.List;

public class Socio {

    /*1. Realizar un diagrama de clase que modele a un Socio de una biblioteca.
      En principio, un socio tiene un nombre (String), un apellido (String) y un número de identificación
      (Integer).
      2. Implementar la clase creando los atributos necesarios.*/

    private String nombre;
    private String apellido;
    private Integer numeroDeID;
    /*Un socio de una biblioteca además de tener nombre, un apellido, un número de identificación, posee una
      lista de ejemplares retirados (List<Ejemplar>) y una cantidad máxima (Integer) de libros que puede
      retirar. Si es un socio clásico, puede llevarse hasta 3 libros. En cambio si es un socio VIP puede llevarse
      hasta 15 libros.*/
    private List<Ejemplar> ejemplaresRetirados;
    private Integer maximoDeLibros;


    public Socio(String nombre, String apellido, Integer numeroDeID, Integer maximoDeLibros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeID = numeroDeID;
        this.maximoDeLibros = maximoDeLibros;
        this.ejemplaresRetirados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNumeroDeID() {
        return numeroDeID;
    }

    public List<Ejemplar> getEjemplaresRetirados() {
        return ejemplaresRetirados;
    }

    /*Crear un método en la clase Socio que permita consultar si un socio tiene cupo disponible para
      llevarse un libro. Este método devuelve true si tiene cupo o false si no tiene cupo.*/
    public Boolean tieneCupoDisponible(SocioClasico unSocio) {
        return (this.ejemplaresRetirados.size() < 3);
    }

    public Boolean tieneCupoDisponible(SocioVip unSocio) {
        return (this.ejemplaresRetirados.size() < 15);
    }

    /*Crear un método en la clase Socio que permita al socio pedir prestado un ejemplar. Es decir, el
      método deberá agregar un ejemplar a la lista de ejemplares prestados del socio.*/
    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar) {
        ejemplaresRetirados.add(unEjemplar);
    }

    /*Crear un método en la clase Socio que permita devolver un ejemplar. Es decir, el método deberá
      eliminar de la lista de prestados el ejemplar prestado, ya que el socio hizo la devolución.*/

    public void devolverUnEjemplar(Ejemplar unEjemplar) {
        List<Ejemplar> ejemplaresADevolver = new ArrayList<>();

        for (Ejemplar otroEjemplar : ejemplaresRetirados) {
            if (otroEjemplar.equals(unEjemplar)) {
                ejemplaresADevolver.add(unEjemplar);
                break;
            }
        }
        ejemplaresRetirados.removeAll(ejemplaresADevolver);
    }


}