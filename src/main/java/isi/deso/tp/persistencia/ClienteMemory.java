package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ClienteNoEncontradoExeption;
import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.Cliente;
import java.util.List;
import java.util.stream.Collectors;
import isi.deso.tp.logicaNegocios.Coordenada;


public class ClienteMemory implements ClienteDao{
    private List<Cliente> clientes;

    public ClienteMemory(){ this.clientes = BaseDeDatos.getClienteList();}

    public List<Cliente> buscarCliente(String nombre) throws ClienteNoEncontradoExeption {
        List<Cliente> c = this.clientes.stream()
                .filter(cliente -> cliente.getNombre().equals(nombre))
                .collect(Collectors.toList());

        if(c.isEmpty()) throw new ClienteNoEncontradoExeption("No existe el cliente con nombre " + nombre);
        return c;
    }

    public Cliente buscarClientePorEmail(String email) throws ClienteNoEncontradoExeption {
        List<Cliente> c = this.clientes.stream()
                .filter(cliente -> cliente.getEmail().equals(email))
                .collect(Collectors.toList());

        if(c.isEmpty()) throw new ClienteNoEncontradoExeption("No existe el cliente con email: " + email);
        return c.get(0);
    }

    public Cliente buscarClientePorID(int id) throws ClienteNoEncontradoExeption {
        List<Cliente> c = this.clientes.stream()
                .filter(cliente -> cliente.getID()==id)
                .collect(Collectors.toList());

        if(c.isEmpty()) throw new ClienteNoEncontradoExeption("No existe el cliente con id: " + id);
        return c.get(0);
    }

    @Override
    public void crearCliente(Cliente cliente){
        int id = BaseDeDatos.getIDCliente();
        cliente.setId(id);
        BaseDeDatos.aumentarIDCliente();
        BaseDeDatos.addCliente(cliente);
    }

    @Override
    public List<Cliente> getClientes(){
        return clientes;
    }

    @Override
    public void eliminarCliente(int id){
        BaseDeDatos.eliminarCliente(id);
    }

    public void modificarCliente(int id,String nombre,String cuit,String email,String direccion,Coordenada c){
        BaseDeDatos.modificarCliente(id,nombre,cuit,email,direccion,c);
    }
}
