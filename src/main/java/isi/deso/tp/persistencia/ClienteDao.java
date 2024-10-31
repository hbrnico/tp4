package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Cliente;

public interface ClienteDao {
    public Cliente buscarClientePorEmail(String email);
    public void crearCliente(Cliente cliente);
}
