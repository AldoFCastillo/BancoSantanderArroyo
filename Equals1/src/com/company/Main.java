package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Persona persona1 =new Persona("Aldo",30959119);
        Persona persona2=new Persona("FalsoAldo",30959119);

        System.out.println(persona1.equals(persona2));


    }
}
