package isi.deso.tp.persistencia;

import isi.deso.tp.controllers.CategoriaController;
import isi.deso.tp.controllers.ItemMenuController;
import isi.deso.tp.controllers.VendedorController;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemsMenuMemory implements ItemsMenuDao {
    List<ItemMenu> itemsMenu;

    public ItemsMenuMemory(){
        this.itemsMenu = BaseDeDatos.getItemMenuList();
    }

    public void crearPlato(Plato plato){
/*
        int id = BaseDeDatos.getIDItemMenu();
        BaseDeDatos.aumentarIDItemMenu();
        CategoriaMemory categoriaMemory = new CategoriaMemory();
        Categoria categoria = categoriaMemory.getCategoriaByTipo(tipoCategoria);
        VendedorMemory vendedorMemory = new VendedorMemory();
        Vendedor vendedor = vendedorMemory.getVendedorByNombre(nombreVendedor);
        ItemMenu itemMenu = new Plato(id, nombre, descripcion, precio, categoria, calorias, aptoCeliaco, aptoVegano, peso, vendedor);
        BaseDeDatos.addItemMenu(itemMenu);
 */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "INSERT INTO itemmenu (Nombre, Descripcion, Precio, ID_Categoria, ID_Vendedor, Calorias, AptoCeliaco, AptoVegetariano, Peso, Eliminado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, plato.getNombre());
            ps.setString(2, plato.getDescripcion());
            ps.setDouble(3, plato.getPrecio());
            ps.setInt(4, plato.getCategoria().getId());
            ps.setInt(5, plato.getVendedor().getID());
            ps.setInt(6, plato.getCalorias());
            ps.setBoolean(7, plato.esAptoCeliaco());
            ps.setBoolean(8, plato.esAptoVegano());
            ps.setFloat(9, plato.peso());
            ps.setBoolean(10, false);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al crear el plato: "+e.getMessage());
        }

        Conexion.desconectar();
    }


    public void crearBebida(Bebida bebida){
        /*
        int id = BaseDeDatos.getIDItemMenu();
        BaseDeDatos.aumentarIDItemMenu();
        CategoriaMemory categoriaMemory = new CategoriaMemory();
        Categoria categoria = categoriaMemory.getCategoriaByTipo(tipoCategoria);
        VendedorMemory vendedorMemory = new VendedorMemory();
        Vendedor vendedor = vendedorMemory.getVendedorByNombre(nombreVendedor);
        ItemMenu itemMenu = new Bebida(id, nombre, descripcion, precio, categoria, graduacionAlcoholica, tamanio,  vendedor);
        BaseDeDatos.addItemMenu(itemMenu);
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "INSERT INTO itemmenu (Nombre, Descripcion, Precio, ID_Categoria, ID_Vendedor," +
                    "GraduacionAlcoholica, Tamanio, Eliminado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bebida.getNombre());
            ps.setString(2, bebida.getDescripcion());
            ps.setDouble(3, bebida.getPrecio());
            ps.setInt(4, bebida.getCategoria().getId());
            ps.setInt(5, bebida.getVendedor().getID());
            ps.setFloat(6, bebida.getGraduacionAlcoholica());
            ps.setInt(7, bebida.getTamanio());
            ps.setBoolean(8, false);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al crear la bebida: "+e.getMessage());
        }

        Conexion.desconectar();
    }

    public List<ItemMenu> getItemsMenu(){
        //return this.itemsMenu;

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<ItemMenu> itemsMenus = new ArrayList<ItemMenu>();

        try {
            String query = "SELECT * FROM itemmenu WHERE Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ItemMenu item;

                Categoria categoria = CategoriaController.getCategoriaByID(rs.getInt("ID_Categoria"));
                Vendedor vendedor = VendedorController.getVendedorByID(rs.getInt("ID_Vendedor"));

                if(rs.getInt("Calorias") != 0){

                    item = new Plato(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                            rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                            rs.getInt("Calorias"), rs.getBoolean("AptoCeliaco"),
                            rs.getBoolean("AptoVegetariano"), rs.getFloat("Peso"), vendedor);
                }
                else{
                    item = new Bebida(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                            rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                            rs.getFloat("GraduacionAlcoholica"), rs.getInt("Tamanio"), vendedor);
                }
                itemsMenus.add(item);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los itemMenus");
        }

        Conexion.desconectar();
        return itemsMenus;
    }

    public void eliminarItemMenu(String nombreVendedor, String nombre) throws ItemNoEncontradoException{
        /*
        boolean itemEliminado = this.itemsMenu.removeIf(item ->
                item.getVendedor().getNombre().equals(nombreVendedor) && item.getNombre().equals(nombre)
        );

        if (!itemEliminado) {
            throw new ItemNoEncontradoException("El ítem con nombre " + nombre + " del vendedor " + nombreVendedor + " no fue encontrado.");
        }
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        int idVendedor = VendedorController.buscarVendedor(nombreVendedor).getID();

        try {
            String query = "UPDATE itemmenu SET Eliminado = 1 WHERE ID_Vendedor = ? AND Nombre = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idVendedor);
            ps.setString(2, nombre);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el itemMenu");
        }

        Conexion.desconectar();
    }

    public ItemMenu buscarPorVendedorYNombre(String nombreVendedor, String nombre ) throws ItemNoEncontradoException {
        /*
        List<ItemMenu> items= this.itemsMenu;

        List<ItemMenu> item=items.stream()
                .filter(it -> it.getVendedor().getNombre().equals(vendedor))
                .filter(it -> it.getNombre().equals(nombre))
                .collect(Collectors.toList());
        if(item.isEmpty()) throw new ItemNoEncontradoException("No el item del vendedor " + vendedor + " llamado " + nombre);
        return item.get(0);
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        int idVendedor = VendedorController.buscarVendedor(nombreVendedor).getID();
        ItemMenu item = null;

        try {
            String query = "SELECT FROM itemmenu WHERE ID_Vendedor = ? AND Nombre = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idVendedor);
            ps.setString(2, nombre);
            ResultSet rs = ps.executeQuery();

            Categoria categoria = CategoriaController.getCategoriaByID(rs.getInt("ID_Categoria"));
            Vendedor vendedor = VendedorController.getVendedorByID(rs.getInt("ID_Vendedor"));
            
            if(rs.getInt("Calorias") != 0){
                item = new Plato(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                        rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                        rs.getInt("Calorias"), rs.getBoolean("AptoCeliaco"),
                        rs.getBoolean("AptoVegetariano"), rs.getFloat("Peso"), vendedor);
            }
            else{
                item = new Bebida(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                        rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                        rs.getFloat("GraduacionAlcoholica"), rs.getInt("Tamanio"), vendedor);
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar el itemMenu por vendedor");
        }

        Conexion.desconectar();
        return item;
    }

    @Override
    public ItemMenu getItemMenuByID(int id) throws ItemNoEncontradoException {
        /*
        List<ItemMenu> items = this.itemsMenu.stream()
                .filter(itemMenu -> itemMenu.getId() == id)
                .collect(Collectors.toList());
        
        if(items.isEmpty()) throw new ItemNoEncontradoException("No existe este item" + id);
        ItemMenu item = items.get(0);
        return item;
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        ItemMenu item = null;

        try {
            String query = "SELECT FROM itemmenu WHERE ID_ItemMenu AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            Categoria categoria = CategoriaController.getCategoriaByID(rs.getInt("ID_Categoria"));
            Vendedor vendedor = VendedorController.getVendedorByID(rs.getInt("ID_Vendedor"));

            if(rs.getInt("Calorias") != 0){
                item = new Plato(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                        rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                        rs.getInt("Calorias"), rs.getBoolean("AptoCeliaco"),
                        rs.getBoolean("AptoVegetariano"), rs.getFloat("Peso"), vendedor);
            }
            else{
                item = new Bebida(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                        rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                        rs.getFloat("GraduacionAlcoholica"), rs.getInt("Tamanio"), vendedor);
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar el itemMenu por ID");
        }

        Conexion.desconectar();
        return item;
    }
    
    @Override
    public List<ItemMenu> itemsPorVendedor(int idVendedor) throws ItemNoEncontradoException {
        /*
        List<ItemMenu> itemsDeVendedor = this.itemsMenu.stream()
                .filter(itemPedido -> itemPedido.getVendedor().getID() == idVendedor)
                .collect(Collectors.toList());

        if(itemsDeVendedor.isEmpty()) throw new ItemNoEncontradoException("El vendedor no tiene ningun item" + id);

        return itemsDeVendedor;
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<ItemMenu> itemsMenus = new ArrayList<ItemMenu>();

        try {
            String query = "SELECT * FROM itemmenu WHERE ID_Vendedor = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idVendedor);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ItemMenu item;

                Categoria categoria = CategoriaController.getCategoriaByID(rs.getInt("ID_Categoria"));
                Vendedor vendedor = VendedorController.getVendedorByID(rs.getInt("ID_Vendedor"));

                if(rs.getInt("Calorias") != 0){

                    item = new Plato(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                            rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                            rs.getInt("Calorias"), rs.getBoolean("AptoCeliaco"),
                            rs.getBoolean("AptoVegetariano"), rs.getFloat("Peso"), vendedor);
                }
                else{
                    item = new Bebida(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                            rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                            rs.getFloat("GraduacionAlcoholica"), rs.getInt("Tamanio"), vendedor);
                }
                itemsMenus.add(item);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los itemMenus por vendedor");
        }

        Conexion.desconectar();
        return itemsMenus;
    }

    public List<ItemMenu> buscarItemMenuPorNombre(String nombreMenu){
        /*
        List<ItemMenu> listaIM = BaseDeDatos.getItemMenuList();

        List<ItemMenu> itemsNombre = listaIM.stream()
                .filter(itemMenu -> itemMenu.getNombre().equals(nombreMenu))
                .collect(Collectors.toList());

        return itemsNombre;
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<ItemMenu> itemsMenus = new ArrayList<ItemMenu>();

        try {
            String query = "SELECT * FROM itemmenu WHERE Nombre = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombreMenu);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ItemMenu item;

                Categoria categoria = CategoriaController.getCategoriaByID(rs.getInt("ID_Categoria"));
                Vendedor vendedor = VendedorController.getVendedorByID(rs.getInt("ID_Vendedor"));

                if(rs.getInt("Calorias") != 0){

                    item = new Plato(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                            rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                            rs.getInt("Calorias"), rs.getBoolean("AptoCeliaco"),
                            rs.getBoolean("AptoVegetariano"), rs.getFloat("Peso"), vendedor);
                }
                else{
                    item = new Bebida(rs.getInt("ID_ItemMenu"), rs.getString("Nombre"),
                            rs.getString("Descripcion"), rs.getDouble("Precio"), categoria,
                            rs.getFloat("GraduacionAlcoholica"), rs.getInt("Tamanio"), vendedor);
                }
                itemsMenus.add(item);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar los itemMenus por nombre");
        }

        Conexion.desconectar();
        return itemsMenus;
    }

    public void modificarPlato(String nombreViejo, Plato plato) throws ItemNoEncontradoException{
        /*
        ItemMenu m = buscarPorVendedorYNombre(nombreVendedor,nombreViejo);
        VendedorMemory bdd = new VendedorMemory();
        Vendedor v = bdd.getVendedorByNombre(nombreVendedor);
        BaseDeDatos.modificarPlato(m.getId(),nombre,descripcion,precio,calorias,aptoCeliaco,aptoVegano,peso,v);
         */

        Plato platoViejo = (Plato)ItemMenuController.buscarPorVendedorYNombre(plato.getVendedor().getNombre(), nombreViejo);

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try{
            String query = "UPDATE itemmenu SET Nombre = ?, Descripcion = ?, Precio = ?, ID_Categoria = ?, Calorias = ?, AptoCeliaco = ?, AptoVegetariano = ?, Peso = ? WHERE Nombre = ? AND ID_Vendedor = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, plato.getNombre());
            ps.setString(2, plato.getDescripcion());
            ps.setDouble(3, plato.getPrecio());
            ps.setInt(4, plato.getCategoria().getId());
            ps.setInt(5, plato.getCalorias());
            ps.setBoolean(6, plato.esAptoCeliaco());
            ps.setBoolean(7, plato.esAptoVegano());
            ps.setFloat(8, plato.peso());
            ps.setString(9, nombreViejo);
            ps.setInt(10, plato.getVendedor().getID());
            ResultSet rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al modificar el plato");
        }


    }

    public void modificarBebida(String nombreViejo, Bebida bebida) throws ItemNoEncontradoException{
        /*
        ItemMenu m = buscarPorVendedorYNombre(nombreVendedor,nombreViejo);
        VendedorMemory bdd = new VendedorMemory();
        Vendedor v = bdd.getVendedorByNombre(nombreVendedor);
        BaseDeDatos.modificarBebida(m.getId(),nombre,descripcion,precio,graduacionAlcoholica,tamanio,v);
         */

        Bebida bebidaVieja = (Bebida)ItemMenuController.buscarPorVendedorYNombre(bebida.getVendedor().getNombre(), nombreViejo);

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try{
            String query = "UPDATE itemmenu SET Nombre = ?, Descripcion = ?, Precio = ?, GraduacionAlcoholica = ?, Tamanio = ? WHERE Nombre = ? AND ID_Vendedor = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bebida.getNombre());
            ps.setString(2, bebida.getDescripcion());
            ps.setDouble(3, bebida.getPrecio());
            ps.setDouble(4, bebida.getGraduacionAlcoholica());
            ps.setInt(5, bebida.getTamanio());
            ps.setString(6, nombreViejo);
            ps.setInt(7, bebida.getVendedor().getID());
            ResultSet rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al modificar la bebida");
        }
    }

}


