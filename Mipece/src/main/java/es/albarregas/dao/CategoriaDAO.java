/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Categoria;
import es.albarregas.connections.MySQLConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class CategoriaDAO implements ICategoriaDAO {

    @Override
    public void add(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> get() {
        String sql = "SELECT * from categorias";
        ResultSet resultado = null;
        ArrayList<Categoria> categorias = null;

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            categorias = new ArrayList<Categoria>();
            while (resultado.next()) {
                categorias.add(new Categoria(resultado.getInt(1), resultado.getString(2)));
            }
        } catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }
        return categorias;
    }

    @Override
    public Categoria getOne(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Categoria categoria) {
        String sql = "delete from categorias where idCategoria = " + categoria.getIdCategoria();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
    
}
