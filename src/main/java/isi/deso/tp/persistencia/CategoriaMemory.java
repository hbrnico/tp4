package isi.deso.tp.persistencia;


import isi.deso.tp.logicaNegocios.Categoria;

import java.util.List;
import java.util.Optional;

public class CategoriaMemory implements CategoriaDao {
    private List<Categoria> categorias;

    public CategoriaMemory() {this.categorias = BaseDeDatos.getCategoriaList();}

    @Override
    public Categoria getCategoriaByID(int id) {
        Optional<Categoria> categoria = this.categorias.stream()
                .filter(cat -> cat.getId() == id)
                .findFirst();
        return categoria.orElse(null);
    }

    @Override
    public Categoria getCategoriaByTipo(String tipo) {
        Optional<Categoria> categoria = this.categorias.stream()
                .filter(cat -> cat.getTipo_item().equals(tipo))
                .findFirst();
        return categoria.orElse(null);
    }
}
