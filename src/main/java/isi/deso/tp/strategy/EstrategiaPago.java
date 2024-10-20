package isi.deso.tp.strategy;

import isi.deso.tp.logicaNegocios.Pedido;

public abstract class EstrategiaPago{
    Pedido carrito;
    
    public EstrategiaPago(Pedido carrito2){
        this.carrito = carrito2;
    }

    public abstract boolean pagar();
}