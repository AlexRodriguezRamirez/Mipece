/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Imagen;
import es.albarregas.beans.Producto;
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
public class ProductoDAO implements IProductoDAO {

    @Override
    public void add(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> get() {
        String sql = "SELECT * from productos";
        ResultSet resultado = null;
        ArrayList<Producto> productos = null;

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            productos = new ArrayList<Producto>();
            while (resultado.next()) {
                productos.add(new Producto(resultado.getInt(1), resultado.getInt(2), resultado.getInt(3), resultado.getString(4), resultado.getString(5), 
                        resultado.getDouble(6), resultado.getInt(7), resultado.getInt(8), resultado.getDate(9), resultado.getString(10).charAt(0), 
                        resultado.getString(11).charAt(0), (ArrayList<Imagen>) resultado.getArray(12)));
            }
        } catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }
        return productos;
    }

    @Override
    public Producto getOne(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Producto producto) {
        String sql = "delete from productos where idProducto = " + producto.getIdProducto();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
    
}
