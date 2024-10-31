package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.ESTADO;
import isi.deso.tp.logicaNegocios.Pedido;

import java.util.List;

public interface PedidoDao {
    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException;
    public List<Pedido> buscarPorCliente(int idCliente) throws PedidoNoEncontradoException;
    public List<Pedido> buscarPorRestauranteYEstado(int idRest, ESTADO estado) throws PedidoNoEncontradoException;
    public List<Pedido> getPedidos();
    public void addPedido(Pedido pedido);
}
