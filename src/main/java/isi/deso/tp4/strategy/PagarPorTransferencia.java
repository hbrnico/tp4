package isi.deso.tp4.strategy;

import isi.deso.tp4.logicaNegocios.Pedido;

import java.util.Scanner;

public class PagarPorTransferencia extends EstrategiaPago {
    private String cuit;
    private String cvu;
    public PagarPorTransferencia(Pedido carrito) {
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

            //ingreso de los datos
            System.out.println("Ingrese CVU");
            this.cvu = ingresoDatos.nextLine();
            System.out.println("Ingrese CUIT");
            this.cuit = ingresoDatos.nextLine();

            if(cuit.matches("\\d{2}-?\\d{8}-?\\d") && cuit.length() == 13 && (cvu.matches("\\d{22}"))){
                auxiliar=false;
            }else{
                System.out.println("CUIT o CVU erroneos, vuelva a ingresar");
            }

        }
        //calcular precio +2%
        double precioAPagar = carrito.getPrecio() * 1.02;

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