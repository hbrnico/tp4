package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ClienteNoEncontradoExeption;
import isi.deso.tp.logicaNegocios.Cliente;
import isi.deso.tp.logicaNegocios.Coordenada;

import java.util.List;

public interface ClienteDao {
    public Cliente buscarClientePorEmail(String email)  throws ClienteNoEncontradoExeption;
    public List<Cliente> buscarCliente(String nombre)  throws ClienteNoEncontradoExeption;
    public void crearCliente(Cliente cliente);
    public List<Cliente> getClientes();
    public void eliminarCliente(int id);
    public void modificarCliente(int id,String nombre,String cuit,String email,String direccion,Coordenada c);
}
