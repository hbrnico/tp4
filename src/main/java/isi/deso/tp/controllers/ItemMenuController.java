package isi.deso.tp.controllers;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemMenu;
import isi.deso.tp.persistencia.ItemsMenuDao;
import isi.deso.tp.persistencia.ItemsMenuMemory;

import java.util.List;

public class ItemMenuController {

    public static void crearPlato(String nombre, String descripcion, double precio,  String tipoCategoria, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor) {
        ItemsMenuDao itemMenuDao = new ItemsMenuMemory();
        itemMenuDao.addPlato(nombre, descripcion, precio, tipoCategoria, calorias, aptoCeliaco, aptoVegano, peso, nombreVendedor);
    }

    public static void crearBebida( String nombre, String descripcion, double precio, String tipoCategoria, float graduacionAlcoholica, int tamanio, String nombreVendedor) {
        ItemsMenuDao itemMenuDao = new ItemsMenuMemory();
        itemMenuDao.addBebida(nombre, descripcion, precio, tipoCategoria, graduacionAlcoholica, tamanio, nombreVendedor);
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

    public static void eliminarItemMenu(String nombreVendedor, String nombre) throws ItemNoEncontradoException {
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        itemsMenuDao.eliminarItemMenu(nombreVendedor, nombre);
    }

    public static void modificarPlato(String nombreViejo,String nombre, String descripcion, double precio, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor) throws ItemNoEncontradoException{
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        itemsMenuDao.modificarPlato(nombreViejo, nombre, descripcion, precio,calorias, aptoCeliaco, aptoVegano, peso, nombreVendedor);
    }

    public static void modificarBebida(String nombreViejo,String nombre, String descripcion, double precio, float graduacionAlcoholica, int tamanio, String nombreVendedor) throws ItemNoEncontradoException {
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        itemsMenuDao.modificarBebida(nombreViejo, nombre, descripcion, precio, graduacionAlcoholica, tamanio, nombreVendedor);
    }

    public static List<ItemMenu> buscarItemMenuPorNombre(String nombreMenu){
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        List<ItemMenu> lim = itemsMenuDao.buscarItemMenuPorNombre(nombreMenu);
        return lim;
    }

    public static List<ItemMenu> buscarItemMenuPorVendedor(String nombre) {
        ItemsMenuDao itemsMenuDao = new ItemsMenuMemory();
        List<ItemMenu> lim = itemsMenuDao.buscarItemMenuPorVendedor(nombre);
        return lim;
    }
}
