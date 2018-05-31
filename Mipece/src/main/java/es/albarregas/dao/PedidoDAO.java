/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.LineaPedido;
import es.albarregas.beans.Pedido;
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
public class PedidoDAO implements IPedidoDAO {

    @Override
    public void add(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedido> get() {
        String sql = "SELECT * from pedidos";
        ResultSet resultado = null;
        ArrayList<Pedido> pedidos = null;

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            pedidos = new ArrayList<Pedido>();
            while (resultado.next()) {
                pedidos.add(new Pedido(resultado.getInt(1), resultado.getDate(2), resultado.getString(3).charAt(0), resultado.getInt(4), resultado.getDouble(5),
                        resultado.getDouble(6), resultado.getDouble(7), (ArrayList<LineaPedido>) resultado.getArray(8)));
            }
        } catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }
        return pedidos;
    }

    @Override
    public Pedido getOne(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pedido pedido) {
        String sql = "delete from pedidos where idPedido = " + pedido.getIdPedido();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }

}
