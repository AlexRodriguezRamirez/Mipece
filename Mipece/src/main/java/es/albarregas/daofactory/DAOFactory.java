/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.daofactory;

import es.albarregas.dao.ICategoriaDAO;
import es.albarregas.dao.IClienteDAO;
import es.albarregas.dao.IImagenDAO;
import es.albarregas.dao.ILineaPedidoDAO;
import es.albarregas.dao.IMarcaDAO;
import es.albarregas.dao.IPedidoDAO;
import es.albarregas.dao.IProductoDAO;
import es.albarregas.dao.IUsuarioDAO;

/**
 *
 * @author Alex
 */
public abstract class DAOFactory {

    public abstract ICategoriaDAO getCategoriaDAO();

    public abstract IClienteDAO getClienteDAO();

    public abstract IImagenDAO getImagenDAO();

    public abstract ILineaPedidoDAO getLineaPedidoDAO();

    public abstract IMarcaDAO getMarcaDAO();

    public abstract IPedidoDAO getPedidoDAO();

    public abstract IProductoDAO getProductoDAO();

    public abstract IUsuarioDAO getUsuarioDAO();

    public static DAOFactory getDAOFactory() {

        DAOFactory daof = null;
        daof = new MySQLDAOFactory();
        return daof;
    }
}
