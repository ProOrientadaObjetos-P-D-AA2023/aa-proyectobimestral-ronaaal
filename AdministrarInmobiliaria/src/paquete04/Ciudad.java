/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Ciudad implements Serializable{
    private String nombreCiudad, nombreProvincia;

    public Ciudad(String nombreCiudad, String nombreProvincia) {
        this.nombreCiudad = nombreCiudad;
        this.nombreProvincia = nombreProvincia;
    }

    // Getters y setters
    public String getNombre() {
        return nombreCiudad;
    }

    public void setNombre(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getProvincia() {
        return nombreProvincia;
    }

    public void setProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
}
