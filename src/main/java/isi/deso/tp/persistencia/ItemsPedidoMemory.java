/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemMenu;
import isi.deso.tp.logicaNegocios.ItemPedido;
import isi.deso.tp.logicaNegocios.Pedido;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItemsPedidoMemory implements ItemsPedidoDao {
    private List<ItemPedido> itemsPedidos;

    public ItemsPedidoMemory() {
            this.itemsPedidos = BaseDeDatos.getItemPedidoList();
    }

    public List<ItemPedido> getItemsPedidos() {
        return itemsPedidos;
    }
    
    public void setItemsPedidos(List<ItemPedido> itemsPedidosNuevo){
        this.itemsPedidos = itemsPedidosNuevo;
    }
    
    @Override
    public List<ItemPedido> buscarPorPedido(int id) throws ItemNoEncontradoException{
        List<ItemPedido> itemsDelPedido = this.itemsPedidos.stream()
                .filter(itemPedido -> itemPedido.getPedido().getID() == id)
                .collect(Collectors.toList()); 
        if(itemsDelPedido.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos");
        
        return itemsDelPedido;
    }
    
    public void eliminarItemPedido(int idPedido, int idItemMenu){ //eliminar el itemPedido del pedido, aunque cantidad sea mayor a 1
        List<ItemPedido> itemsPedido = this.itemsPedidos.stream()
            .filter(itPe -> itPe.getPedido().getID() == idPedido && itPe.getItemMenu().getId() == idItemMenu)
            .collect(Collectors.toList());

        if (!itemsPedido.isEmpty()) {
            ItemPedido itemPedido = itemsPedido.get(0);
            this.itemsPedidos.remove(itemPedido); 
        }
    };
    public void disminuirItemPedido(int idPedido, int idItemMenu) {
        List<ItemPedido> itemsPedido = this.itemsPedidos.stream()
                .filter(itPe -> (itPe.getPedido().getID() == idPedido && itPe.getItemMenu().getId() == idItemMenu) )
                .collect(Collectors.toList());
        
        if (!itemsPedido.isEmpty()) {
            ItemPedido itemPedido = itemsPedido.get(0);
            int cantidad = itemPedido.disminuirCantidad();
            if(cantidad == 0) this.itemsPedidos.remove(itemPedido); 
        }
    }; 
    
    public void agregarItemPedido(int idPedido, int idItemMenu) throws ItemNoEncontradoException{
    // Buscar el ItemPedido existente
    List<ItemPedido> itemsPedido = this.itemsPedidos.stream()
            .filter(itPe -> itPe.getPedido().getID() == idPedido && itPe.getItemMenu().getId() == idItemMenu)
            .collect(Collectors.toList());

    if (!itemsPedido.isEmpty()) { //si existe hace cantidad++, sino lo crea
        ItemPedido itemPedido = itemsPedido.get(0);
        itemPedido.incrementarCantidad(); 
    } else {
        PedidoMemory pedidoDao = new PedidoMemory();
        Pedido pedido = pedidoDao.getPedido(idPedido);
        ItemsMenuMemory itemMenuDao = new ItemsMenuMemory();
        ItemMenu itemMenu = itemMenuDao.getItemMenu(idItemMenu);
        ItemPedido nuevoItemPedido = new ItemPedido(itemMenu, pedido);
        this.itemsPedidos.add(nuevoItemPedido); 
    }
} 
     

    public List<ItemPedido> buscarPorRestaurante(int idRest) throws ItemNoEncontradoException {
        
        List<ItemPedido> itemsComunes = this.itemsPedidos.stream()
            .filter(itemPedido -> itemPedido.getItemMenu().getVendedor().getID() == idRest)  
            .collect(Collectors.toList()); 
        
        if(itemsComunes.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos del vendedor " + idRest);
        
        return itemsComunes;
    };


    public List<ItemPedido> buscarPorRangoPrecio(double min, double max) throws ItemNoEncontradoException{
        List<ItemPedido> res = this.itemsPedidos.stream()
                .filter(itemPedido -> itemPedido.getItemMenu().getPrecio() >= min && itemPedido.getItemMenu().getPrecio() <= max)
                .collect(Collectors.toList());
        
        if(res.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos con valor mayor a " + min + " y menor a " + max);
        
        return res;
    };

    public List<ItemPedido> filtrado(Function<ItemPedido, Boolean> funcion) throws ItemNoEncontradoException{
        List<ItemPedido> res = new ArrayList<>();
        this.itemsPedidos.forEach(n -> {
            if (funcion.apply(n)) res.add(n);
        });
        
        if(res.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos segun el filtrado especificado");
        
        return res;
    };

    public List<ItemPedido> ordenarPor(Comparator<ItemPedido> comp) throws ItemNoEncontradoException{
        
        List<ItemPedido> res = itemsPedidos;
        res.sort(comp);
        
        return res;
    };

    public void agrearAItemsPedidos(ItemPedido IPAgregar){
        BaseDeDatos.addItemPedido(IPAgregar);
    };

}
