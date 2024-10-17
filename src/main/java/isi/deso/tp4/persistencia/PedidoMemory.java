package isi.deso.tp4.persistencia;


import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.excepciones.PedidoNoEncontradoException;

import isi.deso.tp4.logicaNegocios.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoMemory implements PedidoDao{
    private List<Pedido> pedidos;
    public PedidoMemory() {this.Pedidos = new ArrayList<Pedido>();}
    public PedidoMemory(List<Pedido> pedidos) {this.Pedidos = pedidos;}
    public List<Pedido> getPedidos() {return this.Pedidos;}
    public void setPedidos(List<Pedido> pedidos) {this.Pedidos = pedidos;}


    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException {
        List<Pedido> pedidosPorRestaurante = this.pedidos.stream()
                .filter(pedido -> getMiVendedor().getID() == idRest)
                .collect(Collectors.toList());

        return pedidosPorRestaurante;
    }

}
