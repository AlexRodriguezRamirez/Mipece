/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.LineaPedido;
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
public class LineaPedidoDAO implements ILineaPedidoDAO {

    @Override
    public void add(LineaPedido lineaPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LineaPedido> get() {
        String sql = "SELECT * from lineasPedidos";
        ResultSet resultado = null;
        ArrayList<LineaPedido> lineaspedidos = null;

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            lineaspedidos = new ArrayList<LineaPedido>();
            while (resultado.next()) {
                lineaspedidos.add(new LineaPedido(resultado.getInt(1), resultado.getInt(2), resultado.getInt(3), resultado.getInt(4), resultado.getDouble(5)));
            }
        } catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }
        return lineaspedidos;
    }

    @Override
    public LineaPedido getOne(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(LineaPedido lineaPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(LineaPedido lineaPedido) {
        String sql = "delete from lineasPedidos where idPedido = " + lineaPedido.getIdPedido() + " and idProducto = " + lineaPedido.getIdProducto();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
    
}
