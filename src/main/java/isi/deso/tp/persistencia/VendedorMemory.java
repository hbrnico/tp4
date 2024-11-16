
package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.VendedorNoEncontradoExeption;
import isi.deso.tp.logicaNegocios.Coordenada;
import isi.deso.tp.logicaNegocios.Vendedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VendedorMemory implements VendedorDao {
    private List<Vendedor> vendedores;

    public VendedorMemory() {
        this.vendedores = BaseDeDatos.getVendedorList();
    }

    public Vendedor getVendedorByID(int id) {
        // Optional<Vendedor> vendedorEncontrado = this.vendedores.stream()
        //   .filter(v -> v.getID() == id)
        // .findFirst();
        //return vendedorEncontrado.orElse(null);
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        Vendedor vendedor = null;

        try {
            String query = "SELECT * FROM vendedor WHERE ID_Vendedor = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Coordenada coordenada = new Coordenada(rs.getDouble("CoordenadaLat"), rs.getDouble("CoordenadaLng"));
                vendedor = new Vendedor(rs.getInt("ID_Vendedor"), rs.getString("Nombre"), rs.getString("Direccion"), coordenada);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar el vendedor");
        }

        //Conexion.desconectar();
        return vendedor;
    }

    public Vendedor getVendedorByNombre(String nombre) throws VendedorNoEncontradoExeption {
/*
        List<Vendedor> vl=BaseDeDatos.getVendedorList();


        List<Vendedor> vendedorEncontrado = vl.stream()
                .filter(v -> v.getNombre().equals(nombre))
                .collect(Collectors.toList());

        if(vendedorEncontrado.isEmpty())throw  new VendedorNoEncontradoExeption("No existen vendedores con ese nombre");

        return vendedorEncontrado.get(0);
  */
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        Vendedor vendedor = null;

        try {
            String query = "SELECT * FROM vendedor WHERE nombre = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Coordenada coordenada = new Coordenada(rs.getDouble("CoordenadaLat"), rs.getDouble("CoordenadaLng"));
                vendedor = new Vendedor(rs.getInt("ID_Vendedor"), rs.getString("Nombre"), rs.getString("Direccion"), coordenada);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar el vendedor");
        }

        Conexion.desconectar();
        return vendedor;
    }

    public void crearVendedor(Vendedor vendedor) {
        /*int id = BaseDeDatos.getIDCliente();
        vendedor.setID(id);
        BaseDeDatos.aumentarIDCliente();
        BaseDeDatos.addVendedor(vendedor);*/

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        String nombre = vendedor.getNombre();
        String direccion = vendedor.getDireccion();
        Coordenada coordenadas = vendedor.getCoordenadas();
        Double cordlat = coordenadas.getLat();
        Double cordlng = coordenadas.getLng();


        try {
            String query = "INSERT INTO Vendedor (Nombre, Direccion, CoordenadaLat, CoordenadaLng, Eliminado) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setDouble(3, cordlat);
            ps.setDouble(4, cordlng);
            ps.setBoolean(5, false);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al crear el vendedor: "+e.getMessage());
        }

        Conexion.desconectar();

    }

    public List<Vendedor> getVendedores() {
       /* List<Vendedor> vendedores = BaseDeDatos.getVendedorList();

        return vendedores;*/
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<Vendedor> vendedores = new ArrayList<Vendedor>();

        try {
            String query = "SELECT * FROM vendedor WHERE Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Coordenada coordenada = new Coordenada(rs.getDouble("CoordenadaLat"), rs.getDouble("CoordenadaLng"));
                Vendedor vendedor = new Vendedor(rs.getInt("ID_Vendedor"), rs.getString("Nombre"), rs.getString("Direccion"), coordenada);
                vendedores.add(vendedor);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los vendedores");
        }

        Conexion.desconectar();
        return vendedores;
    }

    public void eliminarVendedor(int id) {
        //BaseDeDatos.eliminarVendedor(id);
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        System.out.println(id);

        try {
            String query = "UPDATE vendedor SET Eliminado = 1 WHERE ID_Vendedor = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el vendedor");
        }

        Conexion.desconectar();

    }

    public void modificarVendedorPorID(int id, Vendedor v) {
        //BaseDeDatos.modificarVendedorPorID(id, v);
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        String nombre = v.getNombre();
        String direccion = v.getDireccion();
        Coordenada coordenadas = v.getCoordenadas();
        Double cordlat = coordenadas.getLat();
        Double cordlng = coordenadas.getLng();

        try {
            String query = "UPDATE vendedor SET Nombre = ?, Direccion = ?,CoordenadaLat = ?,CoordenadaLng =? WHERE ID_Vendedor = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setDouble(3, cordlat);
            ps.setDouble(4, cordlng);
            ps.setInt(5, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al Modificar el vendedor");
        }

        Conexion.desconectar();

    }
}