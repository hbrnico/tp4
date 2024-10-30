package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Cliente;

public interface ClienteDao {
    public Cliente buscarClientePorEmail(String email);
}
