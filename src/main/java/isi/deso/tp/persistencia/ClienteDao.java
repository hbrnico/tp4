package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ClienteNoEncontradoException;
import isi.deso.tp.logicaNegocios.Cliente;

import java.util.List;

public interface ClienteDao {
    public Cliente buscarClientePorEmail(String email)  throws ClienteNoEncontradoException;
    public List<Cliente> buscarCliente(String nombre)  throws ClienteNoEncontradoException;
    public void crearCliente(Cliente cliente);
    public List<Cliente> getClientes();
    public void eliminarCliente(int id);
    public void modificarCliente(int id, Cliente cliente);
}
