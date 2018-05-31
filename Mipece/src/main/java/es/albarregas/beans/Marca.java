/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author Alex
 */
public class Marca implements Serializable {

    private int idMarca;
    private String denominacion;

    public Marca() {
    }

    public Marca(int idMarca, String denominacion) {
        this.idMarca = idMarca;
        this.denominacion = denominacion;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

}
