package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.*;
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
    public void eliminarPedido(int posicion) {

        int id = this.pedidos.get(posicion).getID();

        BaseDeDatos.eliminarPedido(id);
    }

    @Override
    public void asignar(Pedido pedido, List<ItemMenuDTO> items) throws ItemNoEncontradoException {
        ItemsMenuMemory bdd = new ItemsMenuMemory();
        for(ItemMenuDTO item : items){
            ItemPedido ip = new ItemPedido(bdd.buscarPorVendedorYNombre(item.getVendedor(),item.getNombre()), pedido);
            ip.setCantidad(item.getCantidad());
            BaseDeDatos.addItemPedido(ip);
        }
    }

    @Override
    public void addPedido(Cliente cliente,Vendedor vendedor, List<ItemMenuDTO> items)throws ItemNoEncontradoException {
        int id = BaseDeDatos.getIDPedido();
        BaseDeDatos.aumentarIDPedido();
        Pedido p = new Pedido(cliente, vendedor,id);
        BaseDeDatos.addPedido(p);
        asignar(p,items);
    }
    
    @Override
     public void addPedido(Pedido p) {BaseDeDatos.addPedido(p);}

    @Override
    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException {
        List<Pedido> pedidosPorRestaurante = this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID() == idRest)
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        return pedidosPorRestaurante;
    }

    @Override
    public List<Pedido> buscarPorCliente(int idCliente) throws PedidoNoEncontradoException {
        List<Pedido> pedidosPorCliente = this.pedidos.stream()
                .filter(pedido -> pedido.getMiCliente().getID()==idCliente)
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        return pedidosPorCliente;
    }

    @Override
    public List<Pedido> buscarPorRestauranteYEstado(int idRest, ESTADO estado) throws PedidoNoEncontradoException {
        List<Pedido> pedidos=this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID()==idRest)
                .filter(pedido -> pedido.getEstado().equals(estado))
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        return pedidos;
    }

    public List<Pedido> getPedidoPorVendedor(String nombreVendedor) throws PedidoNoEncontradoException{
        List<Pedido> pedidos=this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getNombre().equals(nombreVendedor))
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        //actualmente solo matchea por nombre exacto. A la hora de reemplazarlo por una base de datos
        //se agregara la funcion de poder matchear por prefijos
        return pedidos;
    }
}
