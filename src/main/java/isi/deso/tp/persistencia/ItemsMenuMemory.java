package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;

public class ItemsMenuMemory implements ItemsMenuDao {
    List<ItemMenu> itemsMenu;

    public ItemsMenuMemory(){
        List<ItemMenu> itemsMenu = BaseDeDatos.getItemMenuList();
    }

    public void addPlato(String nombre, String descripcion, double precio,  String tipoCategoria, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor){
        int id = BaseDeDatos.getIDItemMenu();
        BaseDeDatos.aumentarIDItemMenu();
        CategoriaMemory categoriaMemory = new CategoriaMemory();
        Categoria categoria = categoriaMemory.getCategoriaByTipo(tipoCategoria);
        VendedorMemory vendedorMemory = new VendedorMemory();
        Vendedor vendedor = vendedorMemory.getVendedorByNombre(nombreVendedor);
        ItemMenu itemMenu = new Plato(id, nombre, descripcion, precio, categoria, calorias, aptoCeliaco, aptoVegano, peso, vendedor);
        BaseDeDatos.addItemMenu(itemMenu);
    }

    public void addBebida( String nombre, String descripcion, double precio, String tipoCategoria, float graduacionAlcoholica, int tamanio, String nombreVendedor){
        int id = BaseDeDatos.getIDItemMenu();
        BaseDeDatos.aumentarIDItemMenu();
        CategoriaMemory categoriaMemory = new CategoriaMemory();
        Categoria categoria = categoriaMemory.getCategoriaByTipo(tipoCategoria);
        VendedorMemory vendedorMemory = new VendedorMemory();
        Vendedor vendedor = vendedorMemory.getVendedorByNombre(nombreVendedor);
        ItemMenu itemMenu = new Bebida(id, nombre, descripcion, precio, categoria, graduacionAlcoholica, tamanio,  vendedor);
        BaseDeDatos.addItemMenu(itemMenu);
    }

    public List<ItemMenu> getItemsMenu(){
        return this.itemsMenu;
    }

    public void eliminarItemMenu(String nombreVendedor, String nombre) throws ItemNoEncontradoException{
        boolean itemEliminado = this.itemsMenu.removeIf(item ->
                item.getVendedor().getNombre().equals(nombreVendedor) && item.getNombre().equals(nombre)
        );

        if (!itemEliminado) {
            throw new ItemNoEncontradoException("El ítem con nombre " + nombre + " del vendedor " + nombreVendedor + " no fue encontrado.");
        }
    }

    public ItemMenu buscarPorVendedorYNombre(String vendedor, String nombre ) throws ItemNoEncontradoException {
        List<ItemMenu> item=this.itemsMenu.stream()
                .filter(it -> it.getVendedor().getNombre().equals(vendedor))
                .filter(it -> it.getNombre().equals(nombre))
                .collect(Collectors.toList());
        if(item.isEmpty()) throw new ItemNoEncontradoException("No el item del vendedor " + vendedor + " llamado " + nombre);
        return item.get(0);
    }

    public void deleteItemMenu(int itemId) throws ItemNoEncontradoException{

    }

    @Override
    public ItemMenu getItemMenu(int id) throws ItemNoEncontradoException {
        List<ItemMenu> items = this.itemsMenu.stream()
                .filter(itemMenu -> itemMenu.getId() == id)
                .collect(Collectors.toList());
        
        if(items.isEmpty()) throw new ItemNoEncontradoException("No existe este item" + id);
        ItemMenu item = items.get(0);
        return item;
    }
    
    @Override
    public List<ItemMenu> itemsPorVendedor(int id) throws ItemNoEncontradoException {
        List<ItemMenu> itemsDeVendedor = this.itemsMenu.stream()
                .filter(itemPedido -> itemPedido.getVendedor().getID() == id)
                .collect(Collectors.toList());

        if(itemsDeVendedor.isEmpty()) throw new ItemNoEncontradoException("El vendedor no tiene ningun item" + id);

        return itemsDeVendedor;
    }


    public List<ItemMenu> buscarItemMenuPorVendedor(String nombre) {

        List<ItemMenu> listaIM = BaseDeDatos.getItemMenuList();

        List<ItemMenu> itemsDeVendedor = listaIM.stream()
                .filter(itemMenu -> itemMenu.getVendedor().getNombre().equals(nombre))
                .collect(Collectors.toList());

        return itemsDeVendedor;
    }

    public void modificarPlato(String nombre, String descripcion, double precio, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, String nombreVendedor) throws ItemNoEncontradoException{

        ItemMenu item = buscarPorVendedorYNombre(nombreVendedor, nombre);

        if (item instanceof Plato) {
            Plato plato = (Plato) item;
            plato.setDescripcion(descripcion);
            plato.setPrecio(precio);
            plato.setCalorias(calorias);
            plato.setAptoCeliaco(aptoCeliaco);
            plato.setAptoVegano(aptoVegano);
            plato.setPeso(peso);
        }


    }

    public void modificarBebida( String nombre, String descripcion, double precio, float graduacionAlcoholica, int tamanio, String nombreVendedor) throws ItemNoEncontradoException{
        ItemMenu item = buscarPorVendedorYNombre(nombreVendedor, nombre);

        if (item instanceof Bebida) {
            Bebida bebida = (Bebida) item;
            bebida.setDescripcion(descripcion);
            bebida.setPrecio(precio);
            bebida.setGraduacionAlcoholica(graduacionAlcoholica);
            bebida.setTamanio(tamanio);
        }
    }

}


