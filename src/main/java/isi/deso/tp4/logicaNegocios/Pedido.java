/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.logicaNegocios;

import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.persistencia.ItemsPedidoMemory;

public class Pedido implements Observable{
    private Cliente miCliente;
    private Vendedor miVendedor;
    private ItemsPedidoMemory miItemsPedidoMemory;
    private double precio;
    private ESTADO estado;
    
    public Pedido(Cliente miCliente){
        this.miCliente = miCliente;
        this.miItemsPedidoMemory = new ItemsPedidoMemory();
        this.precio = 0;
        this.estado = ESTADO.EN_ESPERA;
    }

    public Vendedor getMiVendedor() {
        return miVendedor;
    }

    public void setEstado(ESTADO estadoCambio){
        this.estado=estadoCambio;
    }

    public ItemsPedidoMemory getItemsPedidoMemory(){
        return this.miItemsPedidoMemory;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void agregarProducto(Vendedor v, String plato) {
        try{
            ItemMenu p = v.buscarProducto(plato);
            ItemPedido recup = new ItemPedido(p,this);
            this.miItemsPedidoMemory.agrearAItemsPedidos(recup);   
            this.precio = this.precio + p.getPrecio();
        }
        catch(ItemNoEncontradoException x1){
            System.out.println(x1);
        }
    };
}
