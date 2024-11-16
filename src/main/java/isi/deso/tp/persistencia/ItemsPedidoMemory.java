/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.persistencia;

import isi.deso.tp.controllers.PedidoController;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.*;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItemsPedidoMemory implements ItemsPedidoDao {
    private List<ItemPedido> itemsPedidos;

    public ItemsPedidoMemory() {}

    public List<ItemPedido> getItemsPedidos() {
        //return itemsPedidos;
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<ItemPedido> itemsPedidos = new ArrayList<>();

        try {
            String query = "SELECT * FROM itempedido";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //Obtener la instancia de Pedido
                Conexion.desconectar();
                PedidoController pm = new PedidoController();
                Pedido p = pm.getPedidoById(rs.getInt("ID_Pedido"));
                ItemsMenuMemory imm = new ItemsMenuMemory();
                ItemMenu im = imm.getItemMenuByID(rs.getInt("ID_ItemMenu"));

                Conexion.conectar();
                ItemPedido ip = new ItemPedido(im,p,rs.getInt("Cantidad"));

                itemsPedidos.add(ip);

            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los ItemPedidos");
        } catch (ItemNoEncontradoException e) {
            throw new RuntimeException(e);
        }

        Conexion.desconectar();
        return itemsPedidos;


    }
    
    public void setItemsPedidos(List<ItemPedido> itemsPedidosNuevo){
        //this.itemsPedidos = itemsPedidosNuevo;

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            for(ItemPedido items:itemsPedidosNuevo) {

                String query = "INSERT INTO itempedido (ID_Pedido,ID_ItemMenu,Cantidad) VALUES (?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1,items.getItemMenu().getId());
                ps.setInt(2,items.getPedido().getID());
                ps.setInt(3,items.getCantidad());
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar los ItemPedidos");
        }

        Conexion.desconectar();
    }
    
    @Override
    public List<ItemPedido> buscarPorPedido(int id) throws ItemNoEncontradoException{
      /*  List<ItemPedido> itemsDelPedido = this.itemsPedidos.stream()
                .filter(itemPedido -> itemPedido.getPedido().getID() == id)
                .collect(Collectors.toList()); 
        if(itemsDelPedido.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos");
        
        return itemsDelPedido;*/
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<ItemPedido> itemsPedidos = new ArrayList<>();

        try {
            String query = "SELECT * FROM itempedido WHERE ID_Pedido = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //Obtener la instancia de Pedido
                Conexion.desconectar();
                PedidoMemory pm = new PedidoMemory();
                Pedido p = pm.getPedidoById(rs.getInt("ID_Pedido"));
                ItemsMenuMemory imm = new ItemsMenuMemory();
                ItemMenu im = imm.getItemMenuByID(rs.getInt("ID_ItemMenu"));

                Conexion.conectar();
                ItemPedido ip= new ItemPedido(im,p,rs.getInt("Cantidad"));

                itemsPedidos.add(ip);

            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los ItemPedidos");
        }

        Conexion.desconectar();
        return itemsPedidos;
    }
    
    public void eliminarItemPedido(int idPedido, int idItemMenu){ //eliminar el itemPedido del pedido, aunque cantidad sea mayor a 1
       /* List<ItemPedido> itemsPedido = this.itemsPedidos.stream()
            .filter(itPe -> itPe.getPedido().getID() == idPedido && itPe.getItemMenu().getId() == idItemMenu)
            .collect(Collectors.toList());

        if (!itemsPedido.isEmpty()) {
            ItemPedido itemPedido = itemsPedido.get(0);
            this.itemsPedidos.remove(itemPedido); 
        }*/
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "DELETE FROM itempedido WHERE ID_Pedido= ? AND ID_ItemMenu = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idPedido);
            ps.setInt(2, idItemMenu);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el itemPedido");
        }

        Conexion.desconectar();

    };

    /*public void disminuirItemPedido(int idPedido, int idItemMenu) {
        List<ItemPedido> itemsPedido = this.itemsPedidos.stream()
                .filter(itPe -> (itPe.getPedido().getID() == idPedido && itPe.getItemMenu().getId() == idItemMenu) )
                .collect(Collectors.toList());
        
        if (!itemsPedido.isEmpty()) {
            ItemPedido itemPedido = itemsPedido.get(0);
            int cantidad = itemPedido.disminuirCantidad();
            if(cantidad == 0) this.itemsPedidos.remove(itemPedido); 
        }
    }; */
    /*
    public void agregarItemPedido(int idPedido, int idItemMenu) throws ItemNoEncontradoException{
    // Buscar el ItemPedido existente
    /*List<ItemPedido> itemsPedido = this.itemsPedidos.stream()
            .filter(itPe -> itPe.getPedido().getID() == idPedido && itPe.getItemMenu().getId() == idItemMenu)
            .collect(Collectors.toList());

    if (!itemsPedido.isEmpty()) { //si existe hace cantidad++, sino lo crea
        ItemPedido itemPedido = itemsPedido.get(0);
        itemPedido.incrementarCantidad(); 
    } else {
        PedidoMemory pedidoDao = new PedidoMemory();
        Pedido pedido = pedidoDao.getPedidoById(idPedido);
        ItemsMenuMemory itemMenuDao = new ItemsMenuMemory();
        ItemMenu itemMenu = itemMenuDao.getItemMenu(idItemMenu);
        ItemPedido nuevoItemPedido = new ItemPedido(itemMenu, pedido);
        this.itemsPedidos.add(nuevoItemPedido); 
    }}*/



     

  /*  public List<ItemPedido> buscarPorRestaurante(int idRest) throws ItemNoEncontradoException {
        
        List<ItemPedido> itemsComunes = this.itemsPedidos.stream()
            .filter(itemPedido -> itemPedido.getItemMenu().getVendedor().getID() == idRest)  
            .collect(Collectors.toList()); 
        
        if(itemsComunes.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos del vendedor " + idRest);
        
        return itemsComunes;
    };
*/

/*    public List<ItemPedido> buscarPorRangoPrecio(double min, double max) throws ItemNoEncontradoException{
        List<ItemPedido> res = this.itemsPedidos.stream()
                .filter(itemPedido -> itemPedido.getItemMenu().getPrecio() >= min && itemPedido.getItemMenu().getPrecio() <= max)
                .collect(Collectors.toList());
        
        if(res.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos con valor mayor a " + min + " y menor a " + max);
        
        return res;
    };
*/
  /*  public List<ItemPedido> filtrado(Function<ItemPedido, Boolean> funcion) throws ItemNoEncontradoException{
        List<ItemPedido> res = new ArrayList<>();
        this.itemsPedidos.forEach(n -> {
            if (funcion.apply(n)) res.add(n);
        });
        
        if(res.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos segun el filtrado especificado");
        
        return res;
    };*/

    /*public List<ItemPedido> ordenarPor(Comparator<ItemPedido> comp) throws ItemNoEncontradoException{
        
        List<ItemPedido> res = itemsPedidos;
        res.sort(comp);
        
        return res;
    };*/

    /*public void agrearAItemsPedidos(ItemPedido IPAgregar){
        BaseDeDatos.addItemPedido(IPAgregar);
    };*/

    public void crearItemPedido(ItemPedido item) {


        Conexion.conectar();
        Connection con = Conexion.getConnection();

        int ID_Pedido = item.getPedido().getID();
        int ID_ItemMenu=item.getItemMenu().getId();
        int cantidad=item.getCantidad();


        try {
            String query = "INSERT INTO itempedido (ID_Pedido,ID_ItemMenu,Cantidad) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,ID_Pedido);
            ps.setInt(2,ID_ItemMenu);
            ps.setInt(3,cantidad);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al crear el itempedido: "+e.getMessage());
        }

        Conexion.desconectar();

    }

}
