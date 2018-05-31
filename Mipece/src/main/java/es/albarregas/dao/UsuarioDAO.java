/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Cliente;
import es.albarregas.beans.Usuario;
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
public class UsuarioDAO implements IUsuarioDAO {

    @Override
    public void add(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> get() {
        String sql = "SELECT * from usuarios";
        ResultSet resultado = null;
        ArrayList<Usuario> usuarios = null;

        try {
            PreparedStatement preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            resultado = preparada.executeQuery(sql);
            usuarios = new ArrayList<Usuario>();
            while (resultado.next()) {
                usuarios.add(new Usuario(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getDate(4), resultado.getString(5).charAt(0), 
                        resultado.getString(6).charAt(0), (Cliente) resultado.getObject(7)));
            }
        } catch (SQLException ex) {
            new es.albarregas.utils.MyLogger().doLog(ex, this.getClass(), "error");
            ex.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public Usuario getOne(int pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario usuario) {
        String sql = "delete from usuarios where idUsuario = " + usuario.getIdUsuario();
        PreparedStatement preparada;
        try {
            preparada = MySQLConnection.getConnectionMySQL().prepareStatement(sql);
            preparada.execute();

        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
    
}
