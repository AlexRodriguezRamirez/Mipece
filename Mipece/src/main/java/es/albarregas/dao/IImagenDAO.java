/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Imagen;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IImagenDAO {

    public void add(Imagen imagen);

    public List<Imagen> get();

    public Imagen getOne(int pk);

    public void update(Imagen imagen);

    public void delete(Imagen imagen);

}
