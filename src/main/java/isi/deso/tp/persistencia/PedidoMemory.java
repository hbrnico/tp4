package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.Cliente;
import isi.deso.tp.logicaNegocios.ESTADO;
import isi.deso.tp.logicaNegocios.Pedido;
import isi.deso.tp.logicaNegocios.Vendedor;
import isi.deso.tp.persistencia.BaseDeDatos;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoMemory implements PedidoDao{
    private List<Pedido> pedidos;

    public PedidoMemory() {
        this.pedidos = BaseDeDatos.getPedidoList();
    }

    @Override
    public List<Pedido> getPedidos() {return this.pedidos;}
    
    public Pedido getPedido(int id){
        Pedido pedido = this.pedidos.stream()
                .filter(p -> p.getID() == id)
                .findFirst()
                .orElse(null);
        return pedido;
    }
    
    @Override
    public void deletePedido(int id) {
        this.pedidos.removeIf(p -> p.getID() == id);
    }

    @Override
    public void addPedido(Cliente cliente,Vendedor vendedor) {
        int id = BaseDeDatos.getIDPedido();
        BaseDeDatos.aumentarIDPedido();
        Pedido p = new Pedido(cliente, vendedor,id);
        BaseDeDatos.addPedido(p);
    }
    
    @Override
     public void addPedido(Pedido p) {
        BaseDeDatos.addPedido(p);
    }

    @Override
    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException {
        List<Pedido> pedidosPorRestaurante = this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID() == idRest)
                .collect(Collectors.toList());

        return pedidosPorRestaurante;
    }

    @Override
    public List<Pedido> buscarPorCliente(int idCliente) throws PedidoNoEncontradoException {
        List<Pedido> pedidosPorCliente = this.pedidos.stream()
                .filter(pedido -> pedido.getMiCliente().getID()==idCliente)
                .collect(Collectors.toList());
        return pedidosPorCliente;
    }

    @Override
    public List<Pedido> buscarPorRestauranteYEstado(int idRest, ESTADO estado) throws PedidoNoEncontradoException {
        List<Pedido> pedidos=this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID()==idRest)
                .filter(pedido -> pedido.getEstado().equals(estado))
                .collect(Collectors.toList());
        return pedidos;
    }
}
