/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.logicaNegocios;

public class ItemPedido {
    private ItemMenu itemMenu;
    private Pedido pedido;

    public ItemPedido(ItemMenu itemMenu, Pedido pedido){
        this.itemMenu = itemMenu;
        this.pedido = pedido;
    }
    
    public ItemMenu getItemMenu() {
        return itemMenu;
    }

    public Pedido getPedido() {
        return pedido;
    }
   
}
