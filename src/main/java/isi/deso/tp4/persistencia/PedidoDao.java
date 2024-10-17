package isi.deso.tp4.persistencia;

import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.excepciones.PedidoNoEncontradoException;
import isi.deso.tp4.logicaNegocios.ItemPedido;
import isi.deso.tp4.logicaNegocios.Pedido;
import isi.deso.tp4.logicaNegocios.ESTADO;

import java.util.List;

public interface PedidoDao {
    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException;
}

// Es mejor usar buscarPorRestaurante cada vez que queremos obtener los pedidos de un vendedor o
// guardar una lista con sus pedidos cómo atributo del vendedor?