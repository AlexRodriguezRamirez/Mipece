/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Pedido implements Serializable {

    private int idPedido;
    private Date fecha;
    private char estado;
    private int idCliente;
    private double baseImponible;
    private double gastosEnvio;
    private double iva;

    private ArrayList<LineaPedido> lineasPedido;

    public Pedido() {
    }

    public Pedido(int idPedido, Date fecha, char estado, int idCliente, double baseImponible, double gastosEnvio, double iva, ArrayList<LineaPedido> lineasPedido) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.idCliente = idCliente;
        this.baseImponible = baseImponible;
        this.gastosEnvio = gastosEnvio;
        this.iva = iva;
        this.lineasPedido = lineasPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public ArrayList<LineaPedido> getLineasPedido() {
        return lineasPedido;
    }

    public void setLineasPedido(ArrayList<LineaPedido> lineasPedido) {
        this.lineasPedido = lineasPedido;
    }

}
