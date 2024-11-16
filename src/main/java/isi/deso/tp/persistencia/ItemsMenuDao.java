package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.Bebida;
import isi.deso.tp.logicaNegocios.ItemMenu;
import isi.deso.tp.logicaNegocios.Plato;

import java.util.List;

public interface ItemsMenuDao {
    public void crearPlato(Plato plato);
    public void crearBebida(Bebida bebida);
    public void modificarPlato(String nombreViejo, Plato plato) throws ItemNoEncontradoException;
    public void modificarBebida(String nombreViejo, Bebida bebida) throws ItemNoEncontradoException;
    public List<ItemMenu> getItemsMenu();
    public List<ItemMenu> buscarItemMenuPorNombre(String nombreMenu);
    public void eliminarItemMenu(String nombreVendedor, String nombre) throws ItemNoEncontradoException;
    public ItemMenu buscarPorVendedorYNombre(String vendedor, String nombre) throws ItemNoEncontradoException;
    public ItemMenu getItemMenuByID(int id) throws ItemNoEncontradoException;
    public List<ItemMenu> itemsPorVendedor (int id) throws ItemNoEncontradoException;

}
