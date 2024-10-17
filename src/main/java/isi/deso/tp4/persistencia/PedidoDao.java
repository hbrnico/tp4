package isi.deso.tp4.persistencia;

import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.excepciones.PedidoNoEncontradoException;
import isi.deso.tp4.logicaNegocios.ItemPedido;
import isi.deso.tp4.logicaNegocios.Pedido;

import java.util.List;

public interface PedidoDao {
    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException;
}
