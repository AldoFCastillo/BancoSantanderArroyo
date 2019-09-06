package com.company.Biblioteca;

import com.company.Prestamo;
import com.company.Socios.Socio;
import com.company.Socios.SocioClasico;
import com.company.Socios.SocioVip;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    /*Por último se quiere agregar al modelo anterior una representación de la Biblioteca. Una biblioteca tiene
      una lista de libros (List<Libro>), una lista de socios (List<Socio>) y una lista de préstamos realizados (List<Prestamo>).*/
    private List<Libro> listaDeLibros;
    private List<Socio> listaDeSocios;
    private List<Prestamo> listaDePrestamos;
    private static Libro libroEncontrado = new Libro("", 0, "");
    private static Socio socioEncontrado = new Socio("", "", 0, 0);

    public Biblioteca(List<Libro> listaDeLibros, List<Socio> listaDeSocios) {
        this.listaDeLibros = listaDeLibros;
        this.listaDeSocios = listaDeSocios;
        this.listaDePrestamos = new ArrayList<>();
    }

    public List<Libro> getListaDeLibros() {
        return listaDeLibros;
    }

    public List<Socio> getListaDeSocios() {
        return listaDeSocios;
    }

    public List<Prestamo> getListaDePrestamos() {
        return listaDePrestamos;
    }

    /*En la clase Biblioteca, crear un método que permita prestar un ejemplar del libro que el socio
      solicita. Este método no devuelve nada.*/
    public void prestar(Integer ISBN, Integer numeroDeIdentificacion) {
        Libro libroAPrestar = new Libro("", 0, "");
        Socio socioAPrestarClasico = new SocioClasico("", "", 0);
        Socio socioAPrestarVip = new SocioVip("", "", 0, 0);

        Boolean tieneCupo = false;

        //busco libro y lo asigno a la variable
        if (existeLibro(ISBN) && !(libroEncontrado.getNombre().equals(""))) {
            libroAPrestar = libroEncontrado;
        } else System.out.println("El libro no se encuentra");

        //busco socio
        if (existeSocio(numeroDeIdentificacion) && !(socioEncontrado.getNombre().equals(""))) {
            if (socioEncontrado instanceof SocioVip) {
                socioAPrestarVip = socioEncontrado;
                tieneCupo = socioAPrestarVip.tieneCupoDisponible((SocioVip) socioAPrestarVip);
            } else {
                socioAPrestarClasico = socioEncontrado;
                tieneCupo = socioAPrestarClasico.tieneCupoDisponible((SocioClasico) socioAPrestarClasico);
            }
        } else System.out.println("El socio no se encuentra");


        if (tieneCupo && libroAPrestar.tieneEjemplaresDisponibles(libroAPrestar)) {
            Ejemplar elEjemplar = libroAPrestar.prestarEjemplar(libroAPrestar);
            socioEncontrado.tomarPrestadoUnEjemplar(elEjemplar);
            Prestamo unPrestamo = new Prestamo(elEjemplar, socioEncontrado);
            System.out.println("Se ha concretado el prestamo del ejemplar " + elEjemplar.getUnLibro().getNombre() + ", al socio " + socioEncontrado.getNumeroDeID());
            listaDePrestamos.add(unPrestamo);
        }
    }

    /*Crear un método que permita registrar la devolución de una lista de ejemplares. Este método no devuelve nada.*/

    //REVISAR

    public void devolver(List<Ejemplar> ejemplares, Integer unNumeroDeIdentificacion) {
        List<Ejemplar> listaADevolver = new ArrayList<>();
        if (existeSocio(unNumeroDeIdentificacion)) {
            for (Ejemplar unEjemplar : ejemplares) {
                listaADevolver.add(unEjemplar);
            }
            for (Ejemplar ejemplarADevolver : listaADevolver) {
                socioEncontrado.devolverUnEjemplar(ejemplarADevolver);
            }
            System.out.println("Ejemplar devuelto");
        } else System.out.println("Socio no encontrado");
    }


    public Boolean existeLibro(Integer codigo) {
        Boolean existe = false;
        for (Libro otroLibro : listaDeLibros) {
            if (otroLibro.getCodigoISBN().equals(codigo)) {
                existe = true;
                libroEncontrado = otroLibro;
                break;
            }
        }
        return existe;
    }


    public Boolean existeSocio(Integer id) {
        Boolean existe = false;
        for (Socio otroSocio : listaDeSocios) {
            if (otroSocio.getNumeroDeID().equals(id)) {
                existe = true;
                socioEncontrado = otroSocio;
                break;
            }
        }
        return existe;
    }


}




