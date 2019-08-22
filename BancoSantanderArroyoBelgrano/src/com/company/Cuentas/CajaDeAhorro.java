package com.company.Cuentas;

import com.company.Cliente;


public class CajaDeAhorro extends Cuenta {
    private Double tasaDeInteres=0.30;
    private Double saldoCA=0.0;

    public CajaDeAhorro (Cliente unCliente){
        super(unCliente);
    }

    public Double cobrarInteres(){
        setSaldo(getSaldo()*tasaDeInteres);
        return getSaldo();

     /* TODO (OTRO METODO)
       public void cobrarInteres(){
        depositar(getSaldo()*tasaDeInteres);*/
    }
}


