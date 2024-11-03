package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.Cliente;
import isi.deso.tp.logicaNegocios.ESTADO;
import isi.deso.tp.logicaNegocios.Pedido;
import isi.deso.tp.logicaNegocios.Vendedor;
import isi.deso.tp.logicaNegocios.ItemMenuDTO;

import java.util.List;

public interface PedidoDao {
    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException;
    public List<Pedido> buscarPorCliente(int idCliente) throws PedidoNoEncontradoException;
    public List<Pedido> buscarPorRestauranteYEstado(int idRest, ESTADO estado) throws PedidoNoEncontradoException;
    public List<Pedido> getPedidos();
    public Pedido getPedido(int id);
    public void addPedido(Cliente cliente,Vendedor vendedor, List<ItemMenuDTO> items) throws ItemNoEncontradoException;
    public void addPedido(Pedido p);
    public void eliminarPedido(int id);
    public List<Pedido> getPedidoPorVendedor(String nombreVendedor) throws PedidoNoEncontradoException;
    public void asignar(Pedido pedido, List<ItemMenuDTO> items)  throws ItemNoEncontradoException ;
}
