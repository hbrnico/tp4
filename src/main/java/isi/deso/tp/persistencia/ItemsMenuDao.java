package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemMenu;
import org.w3c.dom.ls.LSException;

import java.util.List;

public interface ItemsMenuDao {
    public void addPlato(String nombre, String descripcion, double precio,  String tipoCategoria, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor);
    public void addBebida( String nombre, String descripcion, double precio, String tipoCategoria, float graduacionAlcoholica, int tamanio, String nombreVendedor);
    public void modificarPlato(String nombreViejo, String nombre, String descripcion, double precio, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor) throws ItemNoEncontradoException;
    public void modificarBebida( String nombreViejo, String nombre, String descripcion, double precio, float graduacionAlcoholica, int tamanio, String nombreVendedor) throws ItemNoEncontradoException;
    public List<ItemMenu> getItemsMenu();
    public List<ItemMenu> buscarItemMenuPorNombre(String nombreMenu);
    public void eliminarItemMenu(String nombreVendedor, String nombre) throws ItemNoEncontradoException;
    public ItemMenu buscarPorVendedorYNombre(String vendedor, String nombre) throws ItemNoEncontradoException;
    public void deleteItemMenu(int itemId) throws ItemNoEncontradoException;
    public ItemMenu getItemMenu(int id) throws ItemNoEncontradoException;
    public List<ItemMenu> itemsPorVendedor (int id) throws ItemNoEncontradoException;

    List<ItemMenu> buscarItemMenuPorVendedor(String nombre);

}
