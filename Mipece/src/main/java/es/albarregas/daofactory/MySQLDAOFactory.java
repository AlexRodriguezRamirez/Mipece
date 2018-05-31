/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.daofactory;

import es.albarregas.dao.CategoriaDAO;
import es.albarregas.dao.ClienteDAO;
import es.albarregas.dao.ICategoriaDAO;
import es.albarregas.dao.IClienteDAO;
import es.albarregas.dao.IImagenDAO;
import es.albarregas.dao.ILineaPedidoDAO;
import es.albarregas.dao.IMarcaDAO;
import es.albarregas.dao.IPedidoDAO;
import es.albarregas.dao.IProductoDAO;
import es.albarregas.dao.IUsuarioDAO;
import es.albarregas.dao.ImagenDAO;
import es.albarregas.dao.LineaPedidoDAO;
import es.albarregas.dao.MarcaDAO;
import es.albarregas.dao.PedidoDAO;
import es.albarregas.dao.ProductoDAO;
import es.albarregas.dao.UsuarioDAO;

/**
 *
 * @author Alex
 */
public class MySQLDAOFactory extends DAOFactory {

    @Override
    public ICategoriaDAO getCategoriaDAO() {
        return new CategoriaDAO();
    }

    @Override
    public IClienteDAO getClienteDAO() {
        return new ClienteDAO();
    }

    @Override
    public IImagenDAO getImagenDAO() {
        return new ImagenDAO();
    }

    @Override
    public ILineaPedidoDAO getLineaPedidoDAO() {
        return new LineaPedidoDAO();
    }

    @Override
    public IMarcaDAO getMarcaDAO() {
        return new MarcaDAO();
    }

    @Override
    public IPedidoDAO getPedidoDAO() {
        return new PedidoDAO();
    }

    @Override
    public IProductoDAO getProductoDAO() {
        return new ProductoDAO();
    }

    @Override
    public IUsuarioDAO getUsuarioDAO() {
        return new UsuarioDAO();
    }

}
