package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Categoria;

import java.util.ArrayList;

public interface CategoriaDao {
    public Categoria getCategoriaByID(int id);
    public Categoria getCategoriaByTipo(String tipo);
    public ArrayList<Categoria> getCategorias();
}
