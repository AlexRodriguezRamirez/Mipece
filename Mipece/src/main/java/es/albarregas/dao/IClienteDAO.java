/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Cliente;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IClienteDAO {

    public void add(Cliente cliente);

    public List<Cliente> get();

    public Cliente getOne(int pk);

    public void update(Cliente cliente);

    public void delete(Cliente cliente);
    
}
