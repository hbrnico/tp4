package isi.deso.tp.controllers;

import isi.deso.tp.logicaNegocios.Categoria;
import isi.deso.tp.persistencia.CategoriaDao;
import isi.deso.tp.persistencia.CategoriaMemory;

import java.util.ArrayList;

public class CategoriaController {

    public static Categoria getCategoriaByID(int ID){
        CategoriaDao categoriaDao = new CategoriaMemory();
        Categoria categoria = categoriaDao.getCategoriaByID(ID);
        return categoria;
    }

    public static Categoria getCategoriaByTipo(String tipo){
        CategoriaDao categoriaDao = new CategoriaMemory();
        Categoria categoria = categoriaDao.getCategoriaByTipo(tipo);
        return categoria;
    }

    public static ArrayList<Categoria> getCategorias(){
        CategoriaDao categoriaDao = new CategoriaMemory();
        ArrayList<Categoria> categorias = categoriaDao.getCategorias();
        return categorias;
    }
}
