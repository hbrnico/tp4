package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Categoria;

public interface CategoriaDao {
    public Categoria getCategoriaByID(int id);
    public Categoria getCategoriaByTipo(String tipo);
}
