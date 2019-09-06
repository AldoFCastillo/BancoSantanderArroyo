package com.company;

import com.company.Biblioteca.Biblioteca;
import com.company.Biblioteca.Ejemplar;
import com.company.Biblioteca.Libro;
import com.company.Socios.Socio;
import com.company.Socios.SocioClasico;
import com.company.Socios.SocioVip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*En la clase Main, realizar pruebas para comprobar el correcto funcionamiento de la biblioteca. Es decir,
          crear libros, ejemplares, socios y agregarlos a una nueva biblioteca. Luego realizar préstamos y devoluciones.*/
        Libro libro1 = new Libro("El Aleph", 1, "Borges");
        Libro libro2 = new Libro("Biblia", 2, "Desconocido");
        Ejemplar ejemplar1 = new Ejemplar(1, "A", libro1);
        Ejemplar ejemplar2 = new Ejemplar(2, "B", libro1);
        Ejemplar ejemplar3 = new Ejemplar(3, "C", libro2);
        Ejemplar ejemplar4 = new Ejemplar(4, "D", libro2);
        libro1.agregarNuevoEjemplar(ejemplar1);
        libro1.agregarNuevoEjemplar(ejemplar2);
        libro2.agregarNuevoEjemplar(ejemplar3);
        libro2.agregarNuevoEjemplar(ejemplar4);

        Socio socio1 = new SocioClasico("Aldo", "Castillo", 1);
        Socio socio2 = new SocioVip("Mario", "Bros", 2, 300);

        List<Libro> listaDeLibros = new ArrayList<>();
        listaDeLibros.addAll(Arrays.asList(libro1, libro2));
        List<Socio> listaDeSocios = new ArrayList<>();
        listaDeSocios.addAll(Arrays.asList(socio1, socio2));


        Biblioteca biblio1 = new Biblioteca(listaDeLibros, listaDeSocios);

        biblio1.prestar(1, 1);
        biblio1.prestar(2, 2);
        biblio1.devolver(socio1.getEjemplaresRetirados(), socio1.getNumeroDeID());
        biblio1.devolver(socio2.getEjemplaresRetirados(), socio2.getNumeroDeID());


    }
}
