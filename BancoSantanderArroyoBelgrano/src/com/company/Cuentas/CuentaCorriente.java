package com.company.Cuentas;

import com.company.Cliente;
import com.company.Cuentas.Cuenta;

public class CuentaCorriente extends Cuenta {
    private Double saldoCC=0.0;
    private Double montoAutorizado=100.0;

    public CuentaCorriente(Cliente unCliente) {
        super(unCliente);

    }

    public Double extraerCC(Double unSaldo){
        if (unSaldo>getSaldo()){
            System.out.println("Saldo insuficiente, extrae "+montoAutorizado+" (Su monto autorizado para girar al descubierto.");
            }else {
              saldoCC-=unSaldo;}
              return saldoCC;
        }
    }


