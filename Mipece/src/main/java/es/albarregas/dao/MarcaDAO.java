/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Marca;
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
public class MarcaDAO implements IMarcaDAO {

    @Override
    public void add(Marca marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Marca> get() {
        String sql = "SELECT * from marcas";
        ResultSet resultado = null;
        ArrayList<Marca> marcas = null;

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            marcas = new ArrayList<Marca>();
            while (resultado.next()) {
                marcas.add(new Marca(resultado.getInt(1), resultado.getString(2)));
            }
        } catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }
        return marcas;
    }

    @Override
    public Marca getOne(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Marca marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Marca marca) {
        String sql = "delete from marcas where idMarca = " + marca.getIdMarca();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
    
}
