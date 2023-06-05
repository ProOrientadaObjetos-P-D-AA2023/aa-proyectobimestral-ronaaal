/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;



import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Casa implements Serializable{
    private int numeroCuartos;
    private double precioMetroCuadrado, metrosCuadarados, costoFinal;
    Propietario propietario;
    Ciudad ciudad;
    Constructora constructora;
    Barrio barrio;

    public Casa( Propietario propietario, Ciudad ciudad, Constructora constructora, Barrio barrio, int numeroCuartos, double metrosCuadarados, double precioMetroCuadrado) {
        this.numeroCuartos = numeroCuartos;
        this.metrosCuadarados = metrosCuadarados;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.propietario = propietario;
        this.ciudad = ciudad;
        this.constructora = constructora;
        this.barrio = barrio;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public double getMetrosCuadarados() {
        return metrosCuadarados;
    }

    public void setMetrosCuadarados(double metrosCuadarados) {
        this.metrosCuadarados = metrosCuadarados;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Constructora getConstructora() {
        return constructora;
    }

    public void setConstructora(Constructora constructora) {
        this.constructora = constructora;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public void calcularCostoFinal(){
        this.costoFinal = metrosCuadarados * precioMetroCuadrado;
    }
}
