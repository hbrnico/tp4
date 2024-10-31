package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Cliente;

public interface ClienteDao {
    public Cliente buscarClienteByEmail(String email);
    public void crearCliente(Cliente cliente);
}
