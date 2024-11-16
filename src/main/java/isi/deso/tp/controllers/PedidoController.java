package isi.deso.tp.controllers;


import isi.deso.tp.excepciones.ClienteNoEncontradoException;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.*;
import isi.deso.tp.persistencia.ClienteMemory;
import isi.deso.tp.persistencia.PedidoDao;
import isi.deso.tp.persistencia.VendedorMemory;
import isi.deso.tp.persistencia.PedidoMemory;

import java.util.List;

public class PedidoController {

    public void pesoTotal(){

    }
    
     public static void crearPedido(int idCliente, String nombreVendedor, List<ItemMenuDTO> items) throws ItemNoEncontradoException, ClienteNoEncontradoException {
        Vendedor vendedor = VendedorController.buscarVendedor(nombreVendedor);
        ClienteMemory clienteMemory = new ClienteMemory();
        Cliente cliente = clienteMemory.buscarClientePorID(idCliente);

        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
         Pedido p = new Pedido(cliente, vendedor);
         pedidoDao.crearPedido(p);
         pedidoDao.asignar(p,items);
    }

    public static List<Pedido> listarPedidos(){
        PedidoDao pedidoDao = new PedidoMemory();
        List<Pedido> pedidos = pedidoDao.getPedidos(); 
        return pedidos;
    }

    public static Pedido getPedidoById(int id){
        PedidoDao pedidoDao = new PedidoMemory();
        return pedidoDao.getPedidoById(id);
    }

    public static List<Pedido> buscarPedido(String nombreVendedor) throws PedidoNoEncontradoException {
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        List<Pedido> pedido = pedidoDao.getPedidoPorVendedor(nombreVendedor);
        return pedido;
    }
    
    public static void eliminarPedido(int id){
        PedidoDao pedidoDao = new PedidoMemory();
        pedidoDao.eliminarPedido(id);
    }

    public static void asignar(Pedido pedido, List<ItemMenuDTO> items) throws ItemNoEncontradoException{
        PedidoDao pedidoDao = new PedidoMemory();
        pedidoDao.asignar(pedido,items);
    }

    public static void actualizarEstadoPedido(int id, ESTADO estado){
        PedidoDao pedidoDao = new PedidoMemory();
        pedidoDao.actualizarEstadoPedido(id, estado);
    }
}
