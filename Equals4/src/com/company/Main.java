package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Empleado> listaDeEmpleados = new ArrayList<>();

        Empleado empleado1 = new Empleado("Juan", 1);
        Empleado empleado2 = new Empleado("Jose", 2);
        Empleado empleado3 = new Empleado("Tito", 3);
        Empleado empleado4 = new Empleado("Miguel", 4);

        listaDeEmpleados.addAll(Arrays.asList(empleado1,empleado2,empleado3,empleado4));
        Empleado empleado5 = new Empleado("Sonic",4);

        System.out.println(listaDeEmpleados.contains(empleado5));

        

    }
}
