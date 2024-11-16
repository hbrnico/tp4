package isi.deso.tp.controllers;

import isi.deso.tp.excepciones.ClienteNoEncontradoException;
import isi.deso.tp.logicaNegocios.Cliente;
import isi.deso.tp.logicaNegocios.Coordenada;
import isi.deso.tp.persistencia.ClienteMemory;

import java.util.List;

public class ClienteController {

    public static void crearCliente(String nombre, String cuit, String email,  String direccion, double latidud, double longitud){
        Coordenada c = new Coordenada(latidud, longitud);
        Cliente client = new Cliente(cuit, nombre, email,direccion, c);
        ClienteMemory bdd = new ClienteMemory();
        bdd.crearCliente(client);
    }


    public static List<Cliente> listarClientes(){
        ClienteMemory m = new ClienteMemory();
        List<Cliente> clienteList = m.getClientes();
        return clienteList;
    }

    public static List<Cliente> buscarCliente(String nombre) throws ClienteNoEncontradoException {
        ClienteMemory m = new ClienteMemory();
        List<Cliente> c = m.buscarCliente(nombre);
        return c;
    }

    public static Cliente buscarClientePorEmail(String email) throws ClienteNoEncontradoException {
        ClienteMemory m = new ClienteMemory();
        Cliente c = m.buscarClientePorEmail(email);
        return c;
    }

    public static void eliminarCliente(String email) throws ClienteNoEncontradoException {
        ClienteMemory m = new ClienteMemory();
        Cliente c=m.buscarClientePorEmail(email);
        m.eliminarCliente(c.getID());
    }

    public static void modificarCliente(String oldEmail, String nombre, String cuit, String email, String direccion, double latidud, double longitud) throws ClienteNoEncontradoException {
        ClienteMemory m= new ClienteMemory();
        Coordenada c = new Coordenada(latidud, longitud);
        Cliente client = m.buscarClientePorEmail(oldEmail);
        Cliente cliente = new Cliente(cuit, nombre, email, direccion, c);
        m.modificarCliente(client.getID(),cliente);
    }

}
