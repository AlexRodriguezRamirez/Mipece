/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Cliente;
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
public class ClienteDAO implements IClienteDAO {

    @Override
    public void add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> get() {
        String sql = "SELECT * from clientes";
        ResultSet resultado = null;
        ArrayList<Cliente> clientes = null;
                
        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            clientes = new ArrayList<Cliente>();
            while (resultado.next()) {
                clientes.add(new Cliente(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), 
                        resultado.getString(7), resultado.getString(8), resultado.getString(9), resultado.getDate(10), resultado.getDate(11), resultado.getString(12)));
            }
        }
        catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex,this.getClass(),"error");
            ex.printStackTrace();
        }
        return clientes;
    }

    @Override
    public Cliente getOne(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Cliente cliente) {
        String sql = "delete from clientes where idCliente = " + cliente.getIdCliente();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
    
}
