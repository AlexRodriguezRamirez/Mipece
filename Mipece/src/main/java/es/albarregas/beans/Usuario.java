/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Usuario implements Serializable {

    private int idUsuario;
    private String email;
    private String clave;
    private Date ultimoAcceso;
    private char tipo;
    private char bloqueado;
    private Cliente cliente;

    public Usuario() {
    }

    public Usuario(int idUsuario, String email, String clave, Date ultimoAcceso, char tipo, char bloqueado, Cliente cliente) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.clave = clave;
        this.ultimoAcceso = ultimoAcceso;
        this.tipo = tipo;
        this.bloqueado = bloqueado;
        this.cliente = cliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(char bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
