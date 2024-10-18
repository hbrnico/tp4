package isi.deso.tp4.logicaNegocios;

public abstract class EstrategiaPago{
    Pedido carrito;
    
    public EstrategiaPago(Pedido carrito2){
        this.carrito = carrito2;
    }

    public abstract boolean pagar();
}