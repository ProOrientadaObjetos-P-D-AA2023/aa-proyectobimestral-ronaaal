/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Barrio implements Serializable{
    private String nombreBarrio, referencia;

    public Barrio(String nombreBarrio, String referencia) {
        this.nombreBarrio = nombreBarrio;
        this.referencia = referencia;
    }

    // Getters y setters
    public String getNombre() {
        return nombreBarrio;
    }

    public void setNombre(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}

