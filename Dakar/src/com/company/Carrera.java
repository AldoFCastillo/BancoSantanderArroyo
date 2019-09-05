package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    //TODO falta agregar cupo y filtrar repetidos

    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    List<Vehiculo> listaDeVehiculos;

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        listaDeVehiculos = new ArrayList<>();
    }

    public Double getDistancia() {
        return distancia;
    }

    public Double getPremioEnDolares() {
        return premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        Vehiculo unAuto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        listaDeVehiculos.add(unAuto);
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        Vehiculo unaMoto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        listaDeVehiculos.add(unaMoto);
    }

    public void eliminarVehiculo(Vehiculo unVehículo) {

        for (Vehiculo otroVehiculo : listaDeVehiculos) {
            if (otroVehiculo.equals(unVehículo)) {
                listaDeVehiculos.remove(unVehículo);
                System.out.println("Se ha eliminado el vehiculo");
            } else System.out.println("Vehiculo no encontrado");

        }
    }


    public void eliminarVehiculoConPatente(String unaPatente) {
        for (Vehiculo unVehiculo : listaDeVehiculos) {
            if (unVehiculo.getPatente().equals(unaPatente)) {
                listaDeVehiculos.remove(unVehiculo);
                System.out.println("Se ha eliminado el vehiculo");
            } else System.out.println("Vehiculo no encontrado");

        }


    }

    public void ganadorDeLaCarrera() {
        Double ganador = 0.0;
        String patenteGanador = "";
        for (Vehiculo unVehiculo : listaDeVehiculos) {

            Double cuentaDeGanador = (unVehiculo.getVelocidad() * (unVehiculo.getAceleracion() / 2) / (unVehiculo.getAnguloDeGiro() * (unVehiculo.getPeso() - unVehiculo.getRuedas() * 100)));
            if (cuentaDeGanador > ganador) {
                ganador = cuentaDeGanador;
                patenteGanador = unVehiculo.getPatente();
            }
        }
        System.out.println("El ganador es " + patenteGanador);
    }


}