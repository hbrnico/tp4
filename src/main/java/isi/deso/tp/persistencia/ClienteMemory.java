package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Cliente;
import java.util.List;

public class ClienteMemory implements ClienteDao{
    private List<Cliente> clientes;

    public ClienteMemory(){ this.clientes = BaseDeDatos.getClienteList();}

    public Cliente buscarClientePorEmail(String email){
        return clientes.stream()
                .filter(cliente -> cliente.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }
}
