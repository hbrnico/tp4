package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.*;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private static List<Vendedor> vendedorList = new ArrayList<>();
    private static int IDVendedor = 0;
    private static List<Pedido> pedidoList =  new ArrayList<>();
    private static int IDPedido = 0;
    private static List<ItemPedido> itemPedidoList = new ArrayList<>();
    private static int IDItemPedido = 0;
    private static List<ItemMenu> itemMenuList = new ArrayList<>();
    private static int IDItemMenu = 0;
    private static List<Cliente> clienteList = new ArrayList<>();
    private static int IDCliente = 0;

    public BaseDeDatos() {}

    public static List<ItemPedido> getItemPedidoList() {
        return itemPedidoList;
    }
    public static void setItemPedidoList(List<ItemPedido> itemPedidoList) { BaseDeDatos.itemPedidoList = itemPedidoList; }
    public static void addItemPedido(ItemPedido itemPedido) {
        BaseDeDatos.itemPedidoList.add(itemPedido);
    }
    public static int getIDItemPedido() {return IDItemPedido;}
    public static void aumentarIDItemPedido() {IDItemPedido++;}


    public static List<Pedido> getPedidoList() {
        return pedidoList;
    }
    public static void setPedidoList(List<Pedido> pedidoList) {
        BaseDeDatos.pedidoList = pedidoList;
    }
    public static void addPedido(Pedido pedido) {
        BaseDeDatos.pedidoList.add(pedido);
    }
    public static int getIDPedido() {return IDPedido;}
    public static void aumentarIDPedido() {IDPedido++;}


    public static List<Vendedor> getVendedorList() {
        return vendedorList;
    }
    public static void setVendedorList(List<Vendedor> vendedorList) {
        BaseDeDatos.vendedorList = vendedorList;
    }
    public static void addVendedor(Vendedor vendedor) {
        BaseDeDatos.vendedorList.add(vendedor);
    }
    public static int getIDVendedor() {return IDVendedor;}
    public static void aumentarIDVendedor() {IDVendedor++;}


    public static List<ItemMenu> getItemMenuList() {
        return itemMenuList;
    }
    public static void setItemMenuList(List<ItemMenu> itemMenuList) {
        BaseDeDatos.itemMenuList = itemMenuList;
    }
    public static void addItemMenu(ItemMenu itemMenu) {
        BaseDeDatos.itemMenuList.add(itemMenu);
    }
    public static int getIDItemMenu() {return IDItemMenu;}
    public static void aumentarIDItemMenu() {IDItemMenu++;}

    public static List<Cliente> getClienteList() { return clienteList;}
    public static void setClienteList(List<Cliente> clienteList) {BaseDeDatos.clienteList = clienteList;}
    public static void addCliente(Cliente cliente) {BaseDeDatos.clienteList.add(cliente);}
    public static int getIDCliente() {return IDCliente;}
    public static void aumentarIDCliente() {IDCliente++;}

}