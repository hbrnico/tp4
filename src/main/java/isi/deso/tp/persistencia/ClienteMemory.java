package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Cliente;
import java.util.List;

public class ClienteMemory implements ClienteDao{
    private List<Cliente> clientes;

    public ClienteMemory(){ this.clientes = BaseDeDatos.getClienteList();}

    public Cliente buscarClienteByEmail(String email){
        return clientes.stream()
                .filter(cliente -> cliente.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void crearCliente(Cliente cliente){
        int id = BaseDeDatos.getIDCliente();
        cliente.setId(id);
        BaseDeDatos.aumentarIDCliente();
        BaseDeDatos.addCliente(cliente);
    }
}
