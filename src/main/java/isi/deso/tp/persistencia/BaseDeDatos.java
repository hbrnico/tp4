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
    //private static int IDItemPedido = 0;
    private static List<ItemMenu> itemMenuList = new ArrayList<>();
    private static int IDItemMenu = 0;
    private static List<Cliente> clienteList = new ArrayList<>();
    private static int IDCliente = 0;
    private static List<Categoria> categoriaList = new ArrayList<>();
    private static int IDCategoria = 0;

    public BaseDeDatos() {}

    public static List<ItemPedido> getItemPedidoList() {
        return itemPedidoList;
    }
    public static void setItemPedidoList(List<ItemPedido> itemPedidoList) { BaseDeDatos.itemPedidoList = itemPedidoList; }
    public static void addItemPedido(ItemPedido itemPedido) {
        BaseDeDatos.itemPedidoList.add(itemPedido);
    }
   // public static int getIDItemPedido() {return IDItemPedido;}
   //public static void aumentarIDItemPedido() {IDItemPedido++;}



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
    public static void eliminarPedido(int id){pedidoList.removeIf(p ->p.getID() == id);}


    public static List<Vendedor> getVendedorList() {
        return vendedorList;
    }
    public static void setVendedorList(List<Vendedor> vendedorList) {
        BaseDeDatos.vendedorList = vendedorList;
    }
    public static void addVendedor(Vendedor vendedor) {BaseDeDatos.vendedorList.add(vendedor);}
    public static int getIDVendedor() {return IDVendedor;}
    public static void aumentarIDVendedor() {IDVendedor++;}
    public static void eliminarVendedor(int id){
        vendedorList.removeIf(v ->v.getID() == id);
    }
    public static void modificarVendedorPorID(int id, Vendedor vendedor){
        for(Vendedor v :vendedorList){
            if(v.getID()==id){
                v.setNombre(vendedor.getNombre());
                v.setDireccion(vendedor.getDireccion());
                v.setCoordenadas(vendedor.getCoordenadas());
            }
        }
    }


    public static List<ItemMenu> getItemMenuList() {return itemMenuList;}
    public static void setItemMenuList(List<ItemMenu> itemMenuList) {BaseDeDatos.itemMenuList = itemMenuList;}
    public static void addItemMenu(ItemMenu itemMenu) {BaseDeDatos.itemMenuList.add(itemMenu);}
    public static int getIDItemMenu() {return IDItemMenu;}
    public static void aumentarIDItemMenu() {IDItemMenu++;}
    public static void eliminarItemMenu(int id){itemMenuList.removeIf(p -> p.getId() == id);}
    public static void modificarBebida(int id, String nombre, String descripcion, double precio, float graduacionAlcoholica, int tamanio, Vendedor v){
        for(ItemMenu item : itemMenuList){
            if((item instanceof Bebida) && (item.getId()==id)){
                item.setNombre(nombre);
                item.setDescripcion(descripcion);
                item.setPrecio(precio);
                ((Bebida) item).setGraduacionAlcoholica(graduacionAlcoholica);
                ((Bebida) item).setTamanio(tamanio);
                item.setVendedor(v);
            }
        }
    }
    public static void modificarPlato(int id, String nombre, String descripcion, double precio, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, Vendedor v){
        for(ItemMenu item : itemMenuList){
            if((item instanceof Plato) && (item.getId()==id)){
                item.setNombre(nombre);
                item.setDescripcion(descripcion);
                item.setPrecio(precio);
                ((Plato) item).setCalorias(calorias);
                ((Plato) item).setAptoCeliaco(aptoCeliaco);
                ((Plato) item).setAptoVegano(aptoVegano);
                ((Plato) item).setPeso(peso);
                item.setVendedor(v);
            }
        }
    }


    public static List<Cliente> getClienteList() { return clienteList;}
    public static void setClienteList(List<Cliente> clienteList) {BaseDeDatos.clienteList = clienteList;}
    public static void addCliente(Cliente cliente) {BaseDeDatos.clienteList.add(cliente);}
    public static int getIDCliente() {return IDCliente;}
    public static void aumentarIDCliente() {IDCliente++;}
    public static void eliminarCliente(int id){clienteList.removeIf(p -> p.getID() == id);}
    public static void modificarCliente(int id,String nombre,String cuit,String email,String direccion,Coordenada cor){
        for(Cliente c :clienteList){
            if(c.getID()==id){
                c.setNombre(nombre);
                c.setCuit(cuit);
                c.setEmail(email);
                c.setDireccion(direccion);
                c.setCoordenadas(cor);
            }
        }
    }


    public static List<Categoria> getCategoriaList(){return categoriaList;};

}
