/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Pedido;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IPedidoDAO {

    public void add(Pedido pedido);

    public List<Pedido> get();

    public Pedido getOne(int pk);

    public void update(Pedido pedido);

    public void delete(Pedido pedido);

}