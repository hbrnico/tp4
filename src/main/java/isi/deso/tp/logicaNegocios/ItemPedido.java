/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.logicaNegocios;

public class ItemPedido {
    private ItemMenu itemMenu;
    private Pedido pedido;
    private int cantidad;

    public ItemPedido(ItemMenu itemMenu, Pedido pedido){
        this.itemMenu = itemMenu;
        this.pedido = pedido;
        this.cantidad=0;
    }
    public ItemPedido(ItemMenu itemMenu, Pedido pedido,int cantidad){
        this.itemMenu = itemMenu;
        this.pedido = pedido;
        this.cantidad=cantidad;
    }
    
    public int disminuirCantidad(){
        if(cantidad> 0) cantidad--;
        return this.cantidad;
    }
    
    public void incrementarCantidad(){
        cantidad++;
    }
    
    public ItemMenu getItemMenu() {
        return itemMenu;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public class getItemMenu {

        public getItemMenu() {
        }
    }
    
   
   
}
