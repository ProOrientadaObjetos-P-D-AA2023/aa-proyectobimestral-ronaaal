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
public class Departamento implements Serializable{
    Propietario propietario;
    private double precioMetroCuadrado,  valorAlicuotaMensual, costoFinal, numeroMetrosCuadrados;
    private int numeroCuartos;
    Barrio barrio;
    Ciudad ciudad;
    private String nombreEdificio, ubicacionEnEdificio;
    Constructora constructora;

    public Departamento(Propietario propietario, double precioMetroCuadrado, double valorAlicuotaMensual, int numeroCuartos, Barrio barrio, Ciudad ciudad, String nombreEdificio, String ubicacionEnEdificio, Constructora constructora, double numeroMetrosCuadrados) {
        this.propietario = propietario;
        this.precioMetroCuadrado = precioMetroCuadrado;
        this.valorAlicuotaMensual = valorAlicuotaMensual;
        this.numeroCuartos = numeroCuartos;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.nombreEdificio = nombreEdificio;
        this.ubicacionEnEdificio = ubicacionEnEdificio;
        this.constructora = constructora;
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public double getValoraAicuataMensua() {
        return valorAlicuotaMensual;
    }

    public void setValoraAicuataMensua(double valorAlicuotaMensual) {
        this.valorAlicuotaMensual = valorAlicuotaMensual;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public String getUbicacionEnEdificio() {
        return ubicacionEnEdificio;
    }

    public void setUbicacionEnEdificio(String ubicacionEnEdificio) {
        this.ubicacionEnEdificio = ubicacionEnEdificio;
    }

    public Constructora getConstructora() {
        return constructora;
    }

    public void setConstructora(Constructora constructora) {
        this.constructora = constructora;
    }

    public double getNumeroMetrosCuadrados() {
        return numeroMetrosCuadrados;
    }

    public void setNumeroMetrosCuadrados(double numeroMetrosCuadrados) {
        this.numeroMetrosCuadrados = numeroMetrosCuadrados;
    }

    public void calcularCostoFinal(){
        this.costoFinal = (numeroMetrosCuadrados * precioMetroCuadrado) + (valorAlicuotaMensual * 12);
    }
}