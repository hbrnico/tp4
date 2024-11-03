package isi.deso.tp.controllers;


import isi.deso.tp.excepciones.ClienteNoEncontradoExeption;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.Cliente;
import isi.deso.tp.logicaNegocios.ItemMenuDTO;
import isi.deso.tp.logicaNegocios.Pedido;
import isi.deso.tp.logicaNegocios.Vendedor;
import isi.deso.tp.persistencia.ClienteMemory;
import isi.deso.tp.persistencia.PedidoDao;
import isi.deso.tp.persistencia.VendedorMemory;
import isi.deso.tp.persistencia.PedidoMemory;

import java.util.List;

public class PedidoController {
    public void pesoTotal(){

    }
    
     public static void crearPedido(String emailCliente, String nombreVendedor, List<ItemMenuDTO> items) throws ItemNoEncontradoException, ClienteNoEncontradoExeption {
        VendedorMemory vendedorMemory = new VendedorMemory();
        Vendedor vendedor = vendedorMemory.getVendedorByNombre(nombreVendedor);
        ClienteMemory clienteMemory = new ClienteMemory();
        Cliente cliente = clienteMemory.buscarClientePorEmail(emailCliente);

        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        pedidoDao.addPedido(cliente, vendedor, items);
    }

    public static List<Pedido> listarPedidos(){
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        List<Pedido> pedidos = pedidoDao.getPedidos(); 
        return pedidos;
    }
    
    public static List<Pedido> buscarPedido(String nombreVendedor) throws PedidoNoEncontradoException {
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        List<Pedido> pedido = pedidoDao.getPedidoPorVendedor(nombreVendedor);
        return pedido;
    }
    
    public static void eliminarPedido(int posicion){
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        //recupero la posicion relativa en la lista de este pedido,
        //luego recupero el id del pedido en dicha posicion y elimino a ese
        pedidoDao.eliminarPedido(posicion);
    }


   




}
