/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Marca;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IMarcaDAO {

    public void add(Marca marca);

    public List<Marca> get();

    public Marca getOne(int pk);

    public void update(Marca marca);

    public void delete(Marca marca);

}