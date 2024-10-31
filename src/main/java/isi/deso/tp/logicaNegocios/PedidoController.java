package isi.deso.tp.logicaNegocios;


import isi.deso.tp.persistencia.ClienteMemory;
import isi.deso.tp.persistencia.PedidoDao;
import isi.deso.tp.persistencia.VendedorMemory;
import isi.deso.tp.persistencia.PedidoMemory;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    public void pesoTotal(){

    }
    
     public void crearPedido(String emailCliente, String nombreVendedor){
        VendedorMemory vendedorMemory = new VendedorMemory();
        Vendedor vendedor = vendedorMemory.getVendedorByNombre(nombreVendedor);
        ClienteMemory clienteMemory = new ClienteMemory();
        Cliente cliente = clienteMemory.buscarClienteByEmail(emailCliente);
        
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        pedidoDao.addPedido(cliente, vendedor);  
    }
    
    public List<Pedido> mostrarListaPedidos(){
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        List<Pedido> pedidos = pedidoDao.getPedidos(); 
        return pedidos;
    }
    
    public Pedido buscarPedido(int id){
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        Pedido pedido = pedidoDao.getPedido(id); 
        return pedido;
    }
    
    public void eliminarPedido(int id){
        PedidoDao pedidoDao = new PedidoMemory(); //despues va a ser PedidoBDD
        pedidoDao.deletePedido(id);
    }
    
    //modificarPedido tiene sentido?
    

   




}
