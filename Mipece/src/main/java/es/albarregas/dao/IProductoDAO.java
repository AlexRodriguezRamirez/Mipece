/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Producto;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IProductoDAO {

    public void add(Producto producto);

    public List<Producto> get();

    public Producto getOne(int pk);

    public void update(Producto producto);

    public void delete(Producto producto);

}