package com.company.Cuentas;

public class Cheque {
    private Double monto=0.0;
    private String banco="";
    private String fecha="";

    public Double informarMonto(){
      return monto;
  }
  public  String informarBanco(){
        return banco;
  }
  public String informarFecha(){
        return fecha;
  }
}
