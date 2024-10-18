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
        boolean continuarPago;

        while(auxiliar){
           String regex = "^([a-zA-Z]+[a-zA-Z0-9]*|[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*)$";
            System.out.println("Ingrese el alias ");
            //ingreso de los datos del alias
            this.alias = ingresoDatos.next();
            if(alias.length() >= 6 && alias.length() <= 20 && (alias.matches(regex))){
                auxiliar=false;
            }else{
                System.out.println("Alias erroneo, vuelva a ingresar");
            }
        }
        //calcular precio +4%
        double precioAPagar = carrito.getPrecio() * 1.04;

        //preguntar si desea pagar
        System.out.println("El precio a pagar es: " + precioAPagar + ", ¿Desea terminar el pago? true/false");
        continuarPago=ingresoDatos.nextBoolean();
        
        if(continuarPago){
        estaPago = true;
        }
        
        return estaPago;
    }

}