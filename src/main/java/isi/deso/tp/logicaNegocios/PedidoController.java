package isi.deso.tp.logicaNegocios;

import isi.deso.tp.persistencia.BaseDeDatos;
import isi.deso.tp.persistencia.ClienteMemory;
import isi.deso.tp.persistencia.VendedorMemory;

public class PedidoController {
    public void pesoTotal(){

    }

    public void crearPedido(String emailCliente, String nombreVendedor){
        VendedorMemory vendedorMemory = new VendedorMemory();
        Vendedor vendedor = vendedorMemory.getVendedorByNombre(nombreVendedor);
        ClienteMemory clienteMemory = new ClienteMemory();
        Cliente cliente = clienteMemory.buscarClientePorEmail(emailCliente);


        int id = BaseDeDatos.getIDPedido();
        BaseDeDatos.aumentarIDPedido();
        Pedido p = new Pedido(cliente, vendedor,id);
        BaseDeDatos.addPedido(p);
    }




}
