package isi.deso.tp.persistencia;

import isi.deso.tp.controllers.ItemMenuController;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.excepciones.PedidoNoEncontradoException;
import isi.deso.tp.logicaNegocios.*;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoMemory implements PedidoDao{
    private List<Pedido> pedidos;

    public PedidoMemory() {
    }

    @Override
    public List<Pedido> getPedidos() {
    //    return this.pedidos;
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<Pedido> pedidos = new ArrayList<>();

        try {
            String query = "SELECT * FROM pedido WHERE Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //Obtener la instancia de vendedor del pedido

                String query2 = "SELECT * FROM vendedor WHERE ID_Vendedor = ?";
                PreparedStatement ps2 = con.prepareStatement(query2);
                ps2.setInt(1, rs.getInt("ID_Vendedor"));
                ResultSet rs2 = ps2.executeQuery();
                Vendedor vendedor=null;
                if(rs2.next()) {
                    Coordenada coordenada = new Coordenada(rs2.getDouble("CoordenadaLat"), rs2.getDouble("CoordenadaLng"));
                    vendedor = new Vendedor(rs2.getInt("ID_Vendedor"), rs2.getString("Nombre"), rs2.getString("Direccion"), coordenada);
                }
                rs2.close();
                ps2.close();

                //Obtener la instancia de cliente del pedido //reusar para cliente ibtener por id

                String query3 = "SELECT * FROM cliente WHERE ID_Cliente = ?";
                PreparedStatement ps3 = con.prepareStatement(query3);
                ps3.setInt(1, rs.getInt("ID_Cliente"));
                ResultSet rs3 = ps3.executeQuery();
                Cliente cliente=null;
                if(rs3.next()) {
                    Coordenada coordenada2 = new Coordenada(rs3.getDouble("CoordenadaLat"), rs3.getDouble("CoordenadaLng"));
                    cliente = new Cliente(rs3.getInt("ID_CLiente"), rs3.getString("CUIT"),rs3.getString("Email"),rs3.getString("Direccion"),coordenada2, rs3.getString("Nombre") );

                }
                rs3.close();
                ps3.close();

                Date fechaSql = rs.getDate("Fecha_Pedido"); // Tipo DATE en MySQL
                Time horaSql = rs.getTime("Hora_Pedido");   // Tipo TIME en MySQL

                // Convertir a LocalDate y LocalTime
                LocalDate fecha = ((java.sql.Date) fechaSql).toLocalDate();
                LocalTime hora = horaSql.toLocalTime();

                // Combinar en LocalDateTime
                LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

                isi.deso.tp.logicaNegocios.ESTADO estado = ESTADO.valueOf(rs.getString("Estado"));

                Pedido pedido =new Pedido(cliente,vendedor,rs.getInt("ID_Pedido"),fechaHora,rs.getDouble("Precio"),estado);

                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los pedidos: "+e.getMessage());
        }

        Conexion.desconectar();
        return pedidos;

    }
    
    public Pedido getPedidoById(int id){
        /*Pedido pedido = this.pedidos.stream()
                .filter(p -> p.getID() == id)
                .findFirst()
                .orElse(null);
        return pedido;*/
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        Pedido pedido= null;

        try {
            String query = "SELECT * FROM pedido WHERE ID_Pedido = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                //Obtener la instancia de vendedor del pedido

                String query2 = "SELECT * FROM vendedor WHERE ID_Vendedor = ?";
                PreparedStatement ps2 = con.prepareStatement(query2);
                ps2.setInt(1, rs.getInt("ID_Vendedor"));
                ResultSet rs2 = ps2.executeQuery();
                Vendedor vendedor=null;
                if(rs2.next()) {
                    Coordenada coordenada = new Coordenada(rs2.getDouble("CoordenadaLat"), rs2.getDouble("CoordenadaLng"));
                    vendedor = new Vendedor(rs2.getInt("ID_Vendedor"), rs2.getString("Nombre"), rs2.getString("Direccion"), coordenada);
                }

                //Obtener la instancia de cliente del pedido //reusar para cliente ibtener por id

                String query3 = "SELECT * FROM cliente WHERE ID_Cliente = ?";
                PreparedStatement ps3 = con.prepareStatement(query3);
                ps3.setInt(1, rs.getInt("ID_Cliente"));
                ResultSet rs3 = ps3.executeQuery();
                Cliente cliente=null;
                if(rs3.next()) {
                    Coordenada coordenada2 = new Coordenada(rs3.getDouble("CoordenadaLat"), rs3.getDouble("CoordenadaLng"));
                    cliente = new Cliente(rs3.getInt("ID_CLiente"), rs3.getString("CUIT"),rs3.getString("Email"),rs3.getString("Direccion"),coordenada2, rs3.getString("Nombre") );

                }

                Date fechaSql = rs.getDate("Fecha_Pedido"); // Tipo DATE en MySQL
                Time horaSql = rs.getTime("Hora_Pedido");   // Tipo TIME en MySQL

                // Convertir a LocalDate y LocalTime
                LocalDate fecha = ((java.sql.Date) fechaSql).toLocalDate();
                LocalTime hora = horaSql.toLocalTime();

                // Combinar en LocalDateTime
                LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

                isi.deso.tp.logicaNegocios.ESTADO estado = ESTADO.valueOf(rs.getString("Estado"));

                pedido =new Pedido(cliente,vendedor,rs.getInt("ID_Cliente"),fechaHora,rs.getDouble("Precio"),estado);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar el pedido");
        }

        Conexion.desconectar();
        return pedido;
    }
    
    @Override
    public void eliminarPedido(int id) {

        //BaseDeDatos.eliminarPedido(id);

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "UPDATE Pedido SET Eliminado = 1 WHERE ID_Pedido = ?";
            System.out.println(id);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el pedido");
        }

        Conexion.desconectar();
    }

    @Override
    public void asignar(Pedido pedido, List<ItemMenuDTO> items) throws ItemNoEncontradoException {
/*        ItemsMenuMemory bdd = new ItemsMenuMemory();
        for(ItemMenuDTO item : items){
            ItemPedido ip = new ItemPedido(bdd.buscarPorVendedorYNombre(item.getVendedor(),item.getNombre()), pedido);
            ip.setCantidad(item.getCantidad());
            BaseDeDatos.addItemPedido(ip);
        }*/
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        for(ItemMenuDTO item : items){
            //por daca ItemMenu, tengo que crear un ItemPedido con el ID del pedido, el id del ItemMenu, y la cantidad

            ItemsPedidoMemory IPM = new ItemsPedidoMemory();
            //crear la instancia de item pedido, hay q recuperar las instancias

            ItemMenu itemmenu = ItemMenuController.buscarPorVendedorYNombre(item.getVendedor(),item.getNombre());

            ItemPedido itempedido =new ItemPedido(itemmenu,pedido,item.getCantidad());
            IPM.crearItemPedido(itempedido);

        }
        Conexion.desconectar();

    }

   /* public void addPedido(Cliente cliente,Vendedor vendedor, List<ItemMenuDTO> items)throws ItemNoEncontradoException {
        int id = BaseDeDatos.getIDPedido();
        BaseDeDatos.aumentarIDPedido();
        Pedido p = new Pedido(cliente, vendedor,id);
        BaseDeDatos.addPedido(p);
        asignar(p,items);
    }*/
    
    @Override
     public void crearPedido(Pedido p) {

    //    BaseDeDatos.addPedido(p);
        int ID_Cliente=p.getMiCliente().getID();
        int ID_Vendedor=p.getMiVendedor().getID();
        LocalDateTime fechayhora = p.getFechaHoraPedido();
        // Obtener la fecha como String
        String fecha = fechayhora.toLocalDate().toString(); // Formato ISO (AAAA-MM-DD)

        // Obtener la hora como String
        String hora = fechayhora.toLocalTime().toString(); // Formato ISO (HH:MM:SS)

        double precio=p.getPrecio();
        ESTADO estado=p.getEstado();

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "INSERT INTO pedido (ID_Cliente, ID_Vendedor, Fecha_Pedido, Hora_Pedido, Precio, Estado, Eliminado)  VALUES (?, ?, ?, ?, ?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, ID_Cliente);
            ps.setInt(2, ID_Vendedor);
            ps.setString(3, fecha);
            ps.setString(4, hora);
            ps.setDouble(5, precio);
            ps.setString(6, estado.name());
            ps.setBoolean(7, false);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al crear el pedido: "+e.getMessage());
        }

        Conexion.desconectar();

    }

    @Override
    public List<Pedido> buscarPorRestaurante(int idRest) throws PedidoNoEncontradoException {
        /*List<Pedido> pedidosPorRestaurante = this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID() == idRest)
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        return pedidosPorRestaurante;*/

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<Pedido> pedidos = new ArrayList<>();

        try {
            String query = "SELECT * FROM pedido WHERE ID_Vendedor = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,idRest);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //Obtener la instancia de vendedor del pedido

                String query2 = "SELECT * FROM vendedor WHERE ID_Vendedor = ?";
                PreparedStatement ps2 = con.prepareStatement(query2);
                ps2.setInt(1, rs.getInt("ID_Vendedor"));
                ResultSet rs2 = ps2.executeQuery();
                Vendedor vendedor=null;
                if(rs2.next()) {
                    Coordenada coordenada = new Coordenada(rs2.getDouble("CoordenadaLat"), rs2.getDouble("CoordenadaLng"));
                    vendedor = new Vendedor(rs2.getInt("ID_Vendedor"), rs2.getString("Nombre"), rs2.getString("Direccion"), coordenada);
                }

                //Obtener la instancia de cliente del pedido //reusar para cliente ibtener por id

                String query3 = "SELECT * FROM cliente WHERE ID_Cliente = ?";
                PreparedStatement ps3 = con.prepareStatement(query3);
                ps3.setInt(1, rs.getInt("ID_Cliente"));
                ResultSet rs3 = ps3.executeQuery();
                Cliente cliente=null;
                if(rs3.next()) {
                    Coordenada coordenada2 = new Coordenada(rs3.getDouble("CoordenadaLat"), rs3.getDouble("CoordenadaLng"));
                    cliente = new Cliente(rs3.getInt("ID_CLiente"), rs3.getString("CUIT"),rs3.getString("Email"),rs3.getString("Direccion"),coordenada2, rs3.getString("Nombre") );

                }

                Date fechaSql = rs.getDate("Fecha_Pedido"); // Tipo DATE en MySQL
                Time horaSql = rs.getTime("Hora_Pedido");   // Tipo TIME en MySQL

                // Convertir a LocalDate y LocalTime
                LocalDate fecha = ((java.sql.Date) fechaSql).toLocalDate();
                LocalTime hora = horaSql.toLocalTime();

                // Combinar en LocalDateTime
                LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

                isi.deso.tp.logicaNegocios.ESTADO estado = ESTADO.valueOf(rs.getString("Estado"));

                Pedido pedido =new Pedido(cliente,vendedor,rs.getInt("ID_Cliente"),fechaHora,rs.getDouble("Precio"),estado);

                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los pedidos");
        }

        Conexion.desconectar();
        return pedidos;

    }


    @Override
    public List<Pedido> buscarPorCliente(int idCliente) throws PedidoNoEncontradoException {
       /* List<Pedido> pedidosPorCliente = this.pedidos.stream()
                .filter(pedido -> pedido.getMiCliente().getID()==idCliente)
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        return pedidosPorCliente;
    */
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<Pedido> pedidos = new ArrayList<>();

        try {
            String query = "SELECT * FROM pedido WHERE ID_Cliente=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,idCliente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //Obtener la instancia de vendedor del pedido

                String query2 = "SELECT * FROM vendedor WHERE  ID_Vendedor= ?";
                PreparedStatement ps2 = con.prepareStatement(query2);
                ps2.setInt(1, rs.getInt("ID_Vendedor"));
                ResultSet rs2 = ps2.executeQuery();
                Vendedor vendedor=null;
                if(rs2.next()) {
                    Coordenada coordenada = new Coordenada(rs2.getDouble("CoordenadaLat"), rs2.getDouble("CoordenadaLng"));
                    vendedor = new Vendedor(rs2.getInt("ID_Vendedor"), rs2.getString("Nombre"), rs2.getString("Direccion"), coordenada);
                }

                //Obtener la instancia de cliente del pedido //reusar para cliente ibtener por id

                String query3 = "SELECT * FROM cliente WHERE ID_Cliente = ?";
                PreparedStatement ps3 = con.prepareStatement(query3);
                ps3.setInt(1, rs.getInt("ID_Cliente"));
                ResultSet rs3 = ps3.executeQuery();
                Cliente cliente=null;
                if(rs3.next()) {
                    Coordenada coordenada2 = new Coordenada(rs3.getDouble("CoordenadaLat"), rs3.getDouble("CoordenadaLng"));
                    cliente = new Cliente(rs3.getInt("ID_CLiente"), rs3.getString("CUIT"),rs3.getString("Email"),rs3.getString("Direccion"),coordenada2, rs3.getString("Nombre") );

                }

                Date fechaSql = rs.getDate("Fecha_Pedido"); // Tipo DATE en MySQL
                Time horaSql = rs.getTime("Hora_Pedido");   // Tipo TIME en MySQL

                // Convertir a LocalDate y LocalTime
                LocalDate fecha = ((java.sql.Date) fechaSql).toLocalDate();
                LocalTime hora = horaSql.toLocalTime();

                // Combinar en LocalDateTime
                LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

                isi.deso.tp.logicaNegocios.ESTADO estado = ESTADO.valueOf(rs.getString("Estado"));

                Pedido pedido =new Pedido(cliente,vendedor,rs.getInt("ID_Cliente"),fechaHora,rs.getDouble("Precio"),estado);

                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los pedidos");
        }

        Conexion.desconectar();
        return pedidos;

    }



    @Override
    public List<Pedido> buscarPorRestauranteYEstado(int idRest, ESTADO estado2) throws PedidoNoEncontradoException {
        /*List<Pedido> pedidos=this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getID()==idRest)
                .filter(pedido -> pedido.getEstado().equals(estado))
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        return pedidos;*/
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<Pedido> pedidos = new ArrayList<>();

        try {
            String query = "SELECT * FROM pedido WHERE ID_Vendedor=? and Estado=? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,idRest);
            ps.setString(2,estado2.name());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                //Obtener la instancia de vendedor del pedido

                String query2 = "SELECT * FROM vendedor WHERE ID_Vendedor = ?";
                PreparedStatement ps2 = con.prepareStatement(query2);
                ps2.setInt(1, rs.getInt("ID_Vendedor"));
                ResultSet rs2 = ps2.executeQuery();
                Vendedor vendedor=null;
                if(rs2.next()) {
                    Coordenada coordenada = new Coordenada(rs2.getDouble("CoordenadaLat"), rs2.getDouble("CoordenadaLng"));
                    vendedor = new Vendedor(rs2.getInt("ID_Vendedor"), rs2.getString("Nombre"), rs2.getString("Direccion"), coordenada);
                }

                //Obtener la instancia de cliente del pedido //reusar para cliente ibtener por id

                String query3 = "SELECT * FROM cliente WHERE ID_Cliente= ?";
                PreparedStatement ps3 = con.prepareStatement(query3);
                ps3.setInt(1, rs.getInt("ID_Cliente"));
                ResultSet rs3 = ps3.executeQuery();
                Cliente cliente=null;
                if(rs3.next()) {
                    Coordenada coordenada2 = new Coordenada(rs3.getDouble("CoordenadaLat"), rs3.getDouble("CoordenadaLng"));
                    cliente = new Cliente(rs3.getInt("ID_CLiente"), rs3.getString("CUIT"),rs3.getString("Email"),rs3.getString("Direccion"),coordenada2, rs3.getString("Nombre") );

                }

                Date fechaSql = rs.getDate("Fecha_Pedido"); // Tipo DATE en MySQL
                Time horaSql = rs.getTime("Hora_Pedido");   // Tipo TIME en MySQL

                // Convertir a LocalDate y LocalTime
                LocalDate fecha = ((java.sql.Date) fechaSql).toLocalDate();
                LocalTime hora = horaSql.toLocalTime();

                // Combinar en LocalDateTime
                LocalDateTime fechaHora = LocalDateTime.of(fecha, hora);

                isi.deso.tp.logicaNegocios.ESTADO estado = ESTADO.valueOf(rs.getString("Estado"));

                Pedido pedido =new Pedido(cliente,vendedor,rs.getInt("ID_Cliente"),fechaHora,rs.getDouble("Precio"),estado);

                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los pedidos");
        }

        Conexion.desconectar();
        return pedidos;
    }

    public List<Pedido> getPedidoPorVendedor(String nombreVendedor) throws PedidoNoEncontradoException{
        /*List<Pedido> pedidos=this.pedidos.stream()
                .filter(pedido -> pedido.getMiVendedor().getNombre().equals(nombreVendedor))
                .collect(Collectors.toList());
        if (pedidos.isEmpty()) throw new PedidoNoEncontradoException("El pedido no existe");
        //actualmente solo matchea por nombre exacto. A la hora de reemplazarlo por una base de datos
        //se agregara la funcion de poder matchear por prefijos
        return pedidos;*/

        VendedorMemory vendedorMemory = new VendedorMemory();
        int ID_Vendedor=vendedorMemory.getVendedorByNombre(nombreVendedor).getID();

        return buscarPorRestaurante(ID_Vendedor);

    }

    public void actualizarEstadoPedido(int id, ESTADO estado) {

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "UPDATE Pedido SET Estado = ? WHERE ID_Pedido = ?";
            System.out.println(id);
            PreparedStatement ps = con.prepareStatement(query);
            System.out.println(estado.name());
            ps.setString(1, estado.name());
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al modificar el estado del pedido");
        }

        Conexion.desconectar();
    }
}
