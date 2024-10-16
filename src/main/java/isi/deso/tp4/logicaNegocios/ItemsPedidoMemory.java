/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.logicaNegocios;

import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.persistencia.ItemsPedidoDao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItemsPedidoMemory implements ItemsPedidoDao {
    private List<ItemPedido> itemsPedidos;

    public ItemsPedidoMemory() {
            this.itemsPedidos = new ArrayList<>();
    }
    
    //constructor solo para las pruebas
    public ItemsPedidoMemory(List<ItemPedido> items) {
            this.itemsPedidos = items;
    }

    public void setItemsPedidos(List<ItemPedido> items){
        this.itemsPedidos = items;
    }

    @Override
    public List<ItemPedido> buscarPorRestaurante(int idRest) throws ItemNoEncontradoException {
        
        List<ItemPedido> itemsComunes = this.itemsPedidos.stream()
            .filter(itemPedido -> itemPedido.getItemMenu().getVendedor().getID() == idRest)  
            .collect(Collectors.toList()); 
        
        if(itemsComunes.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos del vendedor " + idRest);
        
        return itemsComunes;
    };

    
    @Override
    public List<ItemPedido> buscarPorRangoPrecio(double min, double max) throws ItemNoEncontradoException{
        List<ItemPedido> res = itemsPedidos.stream()
                .filter(itemPedido -> itemPedido.getItemMenu().getPrecio() >= min && itemPedido.getItemMenu().getPrecio() <= max)
                .collect(Collectors.toList());
        
        if(res.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos con valor mayor a " + min + " y menor a " + max);
        
        return res;
    };
    
    @Override
    public List<ItemPedido> filtrado(Function<ItemPedido, Boolean> funcion) throws ItemNoEncontradoException{
        List<ItemPedido> res = new ArrayList<>();
        this.itemsPedidos.forEach(n -> {
            if (funcion.apply(n) == true) res.add(n);
        });
        
        if(res.isEmpty()) throw new ItemNoEncontradoException("No se encontraron items pedidos segun el filtrado especificado");
        
        return res;
    };

    @Override
    public List<ItemPedido> ordenarPor(Comparator<ItemPedido> comp) throws ItemNoEncontradoException{
        
        List<ItemPedido> res = itemsPedidos;
        res.sort(comp);
        
        return res;
    };

    public void agrearAItemsPedidos(ItemPedido IPAAgregar){
        this.itemsPedidos.add(IPAAgregar);
    };

}
