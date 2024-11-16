package isi.deso.tp.controllers;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemMenu;
import isi.deso.tp.logicaNegocios.Plato;
import isi.deso.tp.logicaNegocios.Bebida;
import isi.deso.tp.logicaNegocios.Vendedor;
import isi.deso.tp.logicaNegocios.Categoria;
import isi.deso.tp.persistencia.ItemsMenuDao;
import isi.deso.tp.persistencia.ItemsMenuMemory;

import java.util.List;

public class ItemMenuController {

    public static void crearPlato(String nombre, String descripcion, double precio,  String tipoCategoria, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor) {
        ItemsMenuDao itemMenuDao = new ItemsMenuMemory();
        Vendedor vendedor = VendedorController.buscarVendedor(nombreVendedor);
        Categoria categoria = CategoriaController.getCategoriaByTipo(tipoCategoria);
        Plato plato = new Plato(nombre, descripcion, precio, categoria, calorias, aptoCeliaco, aptoVegano, peso, vendedor);
        itemMenuDao.crearPlato(plato);
    }

    public static void crearBebida(String nombre, String descripcion, double precio, String tipoCategoria, float graduacionAlcoholica, int tamanio, String nombreVendedor) {
        ItemsMenuDao itemMenuDao = new ItemsMenuMemory();
        Categoria categoria = CategoriaController.getCategoriaByTipo(tipoCategoria);
        Vendedor vendedor = VendedorController.buscarVendedor(nombreVendedor);

        Bebida bebida = new Bebida(nombre, descripcion, precio, categoria, graduacionAlcoholica, tamanio, vendedor);
        itemMenuDao.crearBebida(bebida);
    }

    public static List<ItemMenu> buscarListaItemsMenu(){
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        return itemsMenuDao.getItemsMenu();
    }

    public static ItemMenu buscarItemMenu(String nombreVendedor, String nombre) throws ItemNoEncontradoException {
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        ItemMenu itemMenu = itemsMenuDao.buscarPorVendedorYNombre(nombreVendedor, nombre);
        return itemMenu;
    }

    public static List<ItemMenu> itemsPorVendedor(int idVendedor) throws ItemNoEncontradoException{
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        return itemsMenuDao.itemsPorVendedor(idVendedor);
    }

    public static void eliminarItemMenu(String nombreVendedor, String nombre) throws ItemNoEncontradoException {
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        itemsMenuDao.eliminarItemMenu(nombreVendedor, nombre);
    }

    public static void modificarPlato(String nombreViejo,String nombre, String descripcion, double precio, String tipoCategoria, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor) throws ItemNoEncontradoException{
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();

        Categoria categoria = CategoriaController.getCategoriaByTipo(tipoCategoria);
        Vendedor vendedor = VendedorController.buscarVendedor(nombreVendedor);

        Plato plato = new Plato(nombre, descripcion, precio, categoria, calorias, aptoCeliaco, aptoVegano, peso, vendedor);

        itemsMenuDao.modificarPlato(nombreViejo, plato);

    }

    public static void modificarBebida(String nombreViejo, String nombre, String descripcion, double precio, String tipoCategoria, float graduacionAlcoholica, int tamanio, String nombreVendedor) throws ItemNoEncontradoException {
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();

        Categoria categoria = CategoriaController.getCategoriaByTipo(tipoCategoria);
        Vendedor vendedor = VendedorController.buscarVendedor(nombreVendedor);

        Bebida bebida = new Bebida(nombre, descripcion, precio, categoria, graduacionAlcoholica, tamanio, vendedor);

        itemsMenuDao.modificarBebida(nombreViejo, bebida);
    }

    public static List<ItemMenu> buscarItemMenuPorNombre(String nombreMenu){
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        List<ItemMenu> lim = itemsMenuDao.buscarItemMenuPorNombre(nombreMenu);
        return lim;
    }

    public static ItemMenu buscarPorVendedorYNombre(String nombreVendedor, String nombre ) throws ItemNoEncontradoException{
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        return itemsMenuDao.buscarPorVendedorYNombre(nombreVendedor, nombre);
    }
}
