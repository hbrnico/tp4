/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.logicaNegocios;

import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.observer.Observable;
import isi.deso.tp4.observer.Observer;
import isi.deso.tp4.persistencia.ItemsPedidoMemory;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class Pedido implements Observable {
    private Cliente miCliente;
    private Vendedor miVendedor;
    private LocalDateTime fechaHoraPedido;
    private double precio;
    private ESTADO estado;
    private List<Observer> suscriptores;
    private int ID;
    static int contador = 0;
    
    public Pedido(Cliente miCliente){
        this.miCliente = miCliente;
        this.fechaHoraPedido = LocalDateTime.now();
        this.precio = 0;
        this.estado = ESTADO.EN_ESPERA;
        this.suscriptores = new ArrayList<>();
        this.ID=contador++;
    }

    public void setVendedor(Vendedor v){ this.miVendedor = v; }

    public Vendedor getMiVendedor() {
        return miVendedor;
    }

    public Cliente getMiCliente() {
        return miCliente;
    }

    public double getPrecio(){
        return this.precio;
    }

    public ESTADO getEstado(){ return this.estado; }

    public int getID(){ return this.ID; }

    public LocalDateTime getFechaHoraPedido(){ return this.fechaHoraPedido; }

    public void agregarProducto(String plato) {
        try {
            ItemMenu p = this.miVendedor.buscarProducto(plato);
            ItemPedido recup = new ItemPedido(p, this);
            ItemsPedidoMemory miItemsPedidoMemory = new ItemsPedidoMemory();
            miItemsPedidoMemory.agrearAItemsPedidos(recup);
            this.precio = this.precio + p.getPrecio();
        } catch (ItemNoEncontradoException x1) {
            System.out.println(x1);
        }
    }

    public void setEstado(ESTADO estadoCambio){
        this.estado=estadoCambio;
        notifyObservers();
    }

    public List<ItemMenu> getItemsDelPedido(){
        ItemsPedidoMemory miItemsPedidoMemory = new ItemsPedidoMemory();
        List<ItemPedido> aux = miItemsPedidoMemory.getItemsPedidos().stream()
                .filter(itemPedido -> itemPedido.getPedido().getID() == this.getID())
                .collect(Collectors.toList());

        List<ItemMenu> ret = new ArrayList<>();
        for (ItemPedido itemPedido : aux){
            ret.add(itemPedido.getItemMenu());
        }

        return ret;
    }

    public void addObserver(Observer o){
        this.suscriptores.add(o);
    }

    public void removeObserver(Observer o) {
        this.suscriptores.remove(o);
    }

    public void notifyObservers() {
        for (int i = 0; i < this.suscriptores.size(); i++){
            this.suscriptores.get(i).update(this);
        }
    }
}
