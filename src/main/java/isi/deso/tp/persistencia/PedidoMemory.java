package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.ESTADO;
import isi.deso.tp.logicaNegocios.Pedido;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoMemory implements PedidoDao{
    private List<Pedido> pedidos;

    public PedidoMemory() {
        this.pedidos = BaseDeDatos.getPedidoList();
    }

    public List<Pedido> getPedidos() {return this.pedidos;}

    public void addPedido(Pedido pedido) {
        BaseDeDatos.addPedido(pedido);
    }

    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException {
        List<Pedido> pedidosPorRestaurante = this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID() == idRest)
                .collect(Collectors.toList());

        return pedidosPorRestaurante;
    }

    public List<Pedido> buscarPorCliente(int idCliente) throws PedidoNoEncontradoException {
        List<Pedido> pedidosPorCliente = this.pedidos.stream()
                .filter(pedido -> pedido.getMiCliente().getID()==idCliente)
                .collect(Collectors.toList());
        return pedidosPorCliente;
    }

    public List<Pedido> buscarPorRestauranteYEstado(int idRest, ESTADO estado) throws PedidoNoEncontradoException {
        List<Pedido> pedidos=this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID()==idRest)
                .filter(pedido -> pedido.getEstado().equals(estado))
                .collect(Collectors.toList());
        return pedidos;
    }
}
