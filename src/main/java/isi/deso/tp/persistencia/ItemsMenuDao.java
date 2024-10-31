package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemMenu;

import java.util.List;

public interface ItemsMenuDao {
    public ItemMenu getItemMenu(int id) throws ItemNoEncontradoException;
    public List<ItemMenu> itemsPorVendedor (int id) throws ItemNoEncontradoException;
}
