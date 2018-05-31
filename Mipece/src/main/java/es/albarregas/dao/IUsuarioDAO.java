/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Usuario;
import java.util.List;

/**
 *
 * @author Alex
 */
public interface IUsuarioDAO {

    public void add(Usuario usuario);

    public List<Usuario> get();

    public Usuario getOne(int pk);

    public void update(Usuario usuario);

    public void delete(Usuario usuario);

}
