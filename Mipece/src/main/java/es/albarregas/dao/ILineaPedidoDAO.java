/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.LineaPedido;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface ILineaPedidoDAO {

    public void add(LineaPedido lineaPedido);

    public List<LineaPedido> get();

    public LineaPedido getOne(int pk);

    public void update(LineaPedido lineaPedido);

    public void delete(LineaPedido lineaPedido);
    
}
