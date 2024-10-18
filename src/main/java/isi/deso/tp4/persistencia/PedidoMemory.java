package isi.deso.tp4.persistencia;

import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.excepciones.PedidoNoEncontradoException;
import isi.deso.tp4.logicaNegocios.ESTADO;
import isi.deso.tp4.logicaNegocios.Pedido;
import java.util.ArrayList;
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

}
