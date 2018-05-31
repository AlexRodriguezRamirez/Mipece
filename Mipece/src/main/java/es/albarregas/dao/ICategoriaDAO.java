/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Categoria;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface ICategoriaDAO {

    public void add(Categoria categoria);

    public List<Categoria> get();

    public Categoria getOne(int pk);

    public void update(Categoria categoria);

    public void delete(Categoria categoria);
    
}
