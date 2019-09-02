package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Alumno>listaDeAlumnos=new ArrayList<>();

        Alumno alumno1=new Alumno("Pepe", 1);
        Alumno alumno2=new Alumno("Jose",2);
        Alumno alumno3=new Alumno("Raul",3);
        Alumno alumno4=new Alumno("Juan",3);

        listaDeAlumnos.addAll(Arrays.asList(alumno1,alumno2,alumno3));

        System.out.println(listaDeAlumnos.contains(alumno4));
    }
}
