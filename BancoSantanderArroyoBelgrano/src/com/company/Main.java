package com.company;

import com.company.Cuentas.CajaDeAhorro;
import com.company.Cuentas.Cuenta;
import com.company.Cuentas.CuentaCorriente;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Cliente otroCliente = new Cliente();
        Cliente unCliente = new Cliente("Pat","Ugarte",12344,3356432,"23-23234232-2");
        Cuenta miCuenta = new Cuenta(unCliente);
        CajaDeAhorro unaCajaCA= new CajaDeAhorro(unCliente);
        CuentaCorriente unaCajaCC=new CuentaCorriente(unCliente);

        System.out.println(miCuenta.getSaldo());

        miCuenta.depositar(2000.0);
        unaCajaCA.depositar(100.0);
        unaCajaCC.depositar(200.0);

        System.out.println(miCuenta.getSaldo());

        miCuenta.extraer(2500.0);
        miCuenta.extraer(1000.0);
        unaCajaCA.cobrarInteres();

        System.out.println(unaCajaCA.getSaldo());
    }
}