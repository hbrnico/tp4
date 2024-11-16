package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ClienteNoEncontradoException;
import isi.deso.tp.logicaNegocios.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import isi.deso.tp.logicaNegocios.Coordenada;


public class ClienteMemory implements ClienteDao{
    private List<Cliente> clientes;

    public ClienteMemory(){ this.clientes = BaseDeDatos.getClienteList();}

    public List<Cliente> buscarCliente(String nombre) throws ClienteNoEncontradoException {
        /*
        List<Cliente> c = this.clientes.stream()
                .filter(cliente -> cliente.getNombre().equals(nombre))
                .collect(Collectors.toList());

        if(c.isEmpty()) throw new ClienteNoEncontradoException("No existe el cliente con nombre " + nombre);
        return c;
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String query = "SELECT * FROM cliente WHERE Nombre = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Coordenada coordenada = new Coordenada(rs.getDouble("CoordenadaLat"), rs.getDouble("CoordenadaLng"));
                Cliente cliente = new Cliente(rs.getInt("ID_Cliente"), rs.getString("CUIT"),
                        rs.getString("Email"), rs.getString("Direccion"), coordenada,
                        rs.getString("Nombre"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar un cliente con el nombre " + nombre);
        }

        Conexion.desconectar();
        return clientes;
    }

    public Cliente buscarClientePorEmail(String email) throws ClienteNoEncontradoException {
        /*
        List<Cliente> c = this.clientes.stream()
                .filter(cliente -> cliente.getEmail().equals(email))
                .collect(Collectors.toList());

        if(c.isEmpty()) throw new ClienteNoEncontradoExeption("No existe el cliente con email: " + email);
        return c.get(0);
         */
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        Cliente cliente = null;

        try {
            String query = "SELECT * FROM cliente WHERE Email = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Coordenada coordenada = new Coordenada(rs.getDouble("CoordenadaLat"), rs.getDouble("CoordenadaLng"));
                cliente = new Cliente(rs.getInt("ID_Cliente"), rs.getString("CUIT"),
                        rs.getString("Email"), rs.getString("Direccion"),
                        coordenada, rs.getString("Nombre")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el cliente por email");
        }

        Conexion.desconectar();
        return cliente;
    }

    public Cliente buscarClientePorID(int ID) throws ClienteNoEncontradoException {
        /*List<Cliente> c = this.clientes.stream()
                .filter(cliente -> cliente.getID()==/*id)
                .collect(Collectors./*toList());

        if(c.isEmpty()) throw new ClienteNoEncontradoExeption("No existe el cliente con id: " + id);
        return c.get(0);
         */
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        Cliente cliente = null;

        try {
            String query = "SELECT * FROM cliente WHERE ID_Cliente = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                Coordenada coordenada = new Coordenada(rs.getDouble("CoordenadaLat"), rs.getDouble("CoordenadaLng"));
                cliente = new Cliente(rs.getInt("ID_Cliente"), rs.getString("CUIT"),
                        rs.getString("Email"), rs.getString("Direccion"),
                        coordenada, rs.getString("Nombre")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el cliente");
        }

        Conexion.desconectar();
        return cliente;
    }

    @Override
    public void crearCliente(Cliente cliente){
        /*
        int id = BaseDeDatos.getIDCliente();
        cliente.setId(id);
        BaseDeDatos.aumentarIDCliente();
        BaseDeDatos.addCliente(cliente);
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "INSERT INTO cliente(Nombre, CUIT, Email, Direccion, CoordenadaLat, CoordenadaLng, Eliminado) VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getCuit());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getDireccion());
            ps.setDouble(5, cliente.getCoordenadas().getLat());
            ps.setDouble(6, cliente.getCoordenadas().getLng());
            ps.setBoolean(7, false);

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al crear el cliente");
        }

        Conexion.desconectar();
    }

    @Override
    public List<Cliente> getClientes(){
        //return clientes;

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String query = "SELECT * FROM cliente WHERE Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Coordenada coordenada = new Coordenada(rs.getDouble("CoordenadaLat"), rs.getDouble("CoordenadaLng"));
                Cliente cliente = new Cliente(rs.getInt("ID_Cliente"), rs.getString("CUIT"),
                        rs.getString("Email"), rs.getString("Direccion"), coordenada,
                        rs.getString("Nombre"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los clientes");
        }

        Conexion.desconectar();
        return clientes;
    }

    @Override
    public void eliminarCliente(int id){
        //BaseDeDatos.eliminarCliente(id);

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "UPDATE cliente SET Eliminado = 1 WHERE ID_Cliente = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar el cliente");
        }

        Conexion.desconectar();
    }

    public void modificarCliente(int id, Cliente cliente){
        //BaseDeDatos.modificarCliente(id,nombre,cuit,email,direccion,c);

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            String query = "UPDATE vendedor SET Nombre= ?, Direccion = ?, CoordenadaLat=?, CoordenadaLng=?, Email = ?, CUIT = ? WHERE ID_Cliente = ? AND Eliminado = 0";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDireccion());
            ps.setDouble(3, cliente.getCoordenadas().getLat());
            ps.setDouble(4, cliente.getCoordenadas().getLng());
            ps.setInt(5, id);
            ps.setString(6, cliente.getEmail());
            ps.setString(7, cliente.getCuit());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al modificar el cliente");
        }

        Conexion.desconectar();

    }
}
