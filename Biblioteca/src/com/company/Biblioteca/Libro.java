package com.company.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    /*1. Realizar un diagrama de clase que modele a un objeto Libro.
      En principio, un libro posee un nombre (String), un código ISBN (Integer) y un autor (String).
      2. Implementar la clase creando los atributos necesarios.	*/
    private String nombre;
    private Integer codigoISBN;
    private String autor;
    /*Un libro de una biblioteca además de tener nombre, un código ISBN y un autor, posee una lista de
      ejemplares (List<Ejemplar>) disponibles para ser prestados.*/
    private List<Ejemplar> listaDeEjemplares;

    public Libro(String nombre, Integer codigoISBN, String autor) {
        this.nombre = nombre;
        this.codigoISBN = codigoISBN;
        this.autor = autor;
        this.listaDeEjemplares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCodigoISBN() {
        return codigoISBN;
    }

    public String getAutor() {
        return autor;
    }

    /*Crear un método en la clase Libro que permita agregar un nuevo ejemplar a la lista de
    ejemplares.*/

    public void agregarNuevoEjemplar(Ejemplar unEjemplar) {
        if (!repetidos(unEjemplar)) {
            listaDeEjemplares.add(unEjemplar);
            System.out.println("El ejemplar se ingreso correctamente");
        } else System.out.println("El ejemplar ya fue ingresado previamente");
    }


    /*Crear un método en la clase Libro que permita consultar si un libro tiene ejemplares disponibles.
    Este método devuelve true si tiene disponible ejemplares o false en caso contrario.*/

    public Boolean tieneEjemplaresDisponibles(Libro unLibro) {
        Boolean hayEjemplares = false;
        for (Ejemplar otroEjemplar : listaDeEjemplares) {
            if (otroEjemplar.getUnLibro().equals(unLibro)) {
                hayEjemplares = true;
            } else System.out.println("No tiene ejemplares disponibles");
        }
        return hayEjemplares;
    }


    /*Crear un método en la clase Libro que permita prestar un ejemplar de un libro. Directamente, se
      tiene que eliminar de la lista de ejemplares el primer ejemplar y devolver dicho ejemplar.*/

    public Ejemplar prestarEjemplar(Libro unLibro) {

        List<Ejemplar> listaParaRemover = new ArrayList<>();


        if (tieneEjemplaresDisponibles(unLibro)) {
            for (Ejemplar unEjemplar : listaDeEjemplares) {
                if (unEjemplar.getUnLibro().equals(unLibro)) {
                    listaParaRemover.add(unEjemplar);
                    break;
                } else System.out.println("No se pudo concretar la operacion");
            }
            this.listaDeEjemplares.removeAll(listaParaRemover);
        }
        return listaParaRemover.get(0);
    }


    /*Crear un método en la clase Libro que permita registrar el reingreso de un ejemplar que fue
    prestado a un socio. Este método debe agregar a la lista el ejemplar que recibe por parámetro.*/

    public void reingresarEjemplar(Ejemplar unEjemplar) {
        if (!repetidos(unEjemplar)) {
            listaDeEjemplares.add(unEjemplar);
            System.out.println("El ejemplar ha sido reingresado");
        } else System.out.println("El ejemplar que intenta devolver ya se encontraba disponible");
    }

    public Boolean repetidos(Ejemplar unEjemplar) {
        Boolean hayRepetido = false;
        for (Ejemplar otroEjemplar : listaDeEjemplares) {
            if (otroEjemplar.equals(unEjemplar)) {
                hayRepetido = true;
            }
        }
        return (hayRepetido);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Libro)) {
            return false;
        }
        Libro otroLibro = (Libro) obj;
        return otroLibro.getCodigoISBN().equals(this.codigoISBN);
    }
}
