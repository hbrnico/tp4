package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemMenu;
import isi.deso.tp.logicaNegocios.ItemPedido;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemsMenuMemory implements ItemsMenuDao {
    List<ItemMenu> itemsMenu;

    public ItemsMenuMemory(){
        List<ItemMenu> itemsMenu = BaseDeDatos.getItemMenuList();
    }

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
}


