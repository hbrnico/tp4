package isi.deso.tp4.strategy;

import isi.deso.tp4.logicaNegocios.Pedido;

import java.util.Scanner;

public class PagarPorMercadoPago extends EstrategiaPago {

    private String alias;

    public PagarPorMercadoPago(Pedido carrito) {
        super(carrito);
    }

    @Override
    public boolean pagar() {
        Scanner ingresoDatos = new Scanner(System.in);
        boolean estaPago = false;
        boolean auxiliar =true;
        boolean continuarPago = false;
        boolean valorValido = false;

        while(auxiliar){
           String regex = "^([a-zA-Z]+[a-zA-Z0-9]*|[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*)$";
            System.out.println("Ingrese el alias ");
            //ingreso de los datos del alias
            this.alias = ingresoDatos.next();
            if(alias.length() >= 6 && alias.length() <= 20 && (alias.matches(regex))){
                auxiliar=false;
            }
            else{
                System.out.println("Alias erroneo, vuelva a ingresar");
            }
        }
        double precioAPagar = carrito.getPrecio() * 1.04;

        while(!valorValido) {
            try {
                System.out.println("El precio a pagar es: " + precioAPagar + ", ¿Desea terminar el pago? true/false");
                continuarPago = ingresoDatos.nextBoolean();
                valorValido = true;
            } catch (Exception e) {
                System.out.println("Error: Debes ingresar 'true' o 'false'. Por favor, reingresa el valor.");
                ingresoDatos.next();
            }
        }
        
        if(continuarPago){
            estaPago = true;
        }
        
        return estaPago;
    }

}