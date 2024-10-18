package isi.deso.tp4.persistencia;

import isi.deso.tp4.logicaNegocios.ItemPedido;
import isi.deso.tp4.logicaNegocios.Pedido;
import isi.deso.tp4.logicaNegocios.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private static List<Vendedor> vendedorList = new ArrayList<>();
    private static List<Pedido> pedidoList =  new ArrayList<>();
    private static List<ItemPedido> itemPedidoList = new ArrayList<>();

    public BaseDeDatos() {}

    public static List<ItemPedido> getItemPedidoList() {
        return itemPedidoList;
    }

    public static void setItemPedidoList(List<ItemPedido> itemPedidoList) {
        BaseDeDatos.itemPedidoList = itemPedidoList;
    }

    public static void addItemPedido(ItemPedido itemPedido) {
        BaseDeDatos.itemPedidoList.add(itemPedido);
    }

    public static List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public static void setPedidoList(List<Pedido> pedidoList) {
        BaseDeDatos.pedidoList = pedidoList;
    }
    public static void addPedido(Pedido pedido) {
        BaseDeDatos.pedidoList.add(pedido);
    }

    public static List<Vendedor> getVendedorList() {
        return vendedorList;
    }
    public static void setVendedorList(List<Vendedor> vendedorList) {
        BaseDeDatos.vendedorList = vendedorList;
    }
    public static void addVendedor(Vendedor vendedor) {
        BaseDeDatos.vendedorList.add(vendedor);
    }

}
