/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.logicaNegocios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private int id;
    private String cuit;
    private String email;
    private String direccion;
    private Coordenada coordenadas;
    private EstrategiaPago estrategiaDePago;

    public Cliente(int id, String cuit, String email, String direccion, Coordenada coordenadas) {
        this.id = id;
        this.cuit = cuit;
        this.email = email;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
        this.estrategiaDePago = null;
    }

    public int getID() {
        return this.id;
    }

    public String getCuit() {
        return this.cuit;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public Coordenada getCoordenadas() {
        return this.coordenadas;
    }
    
    public Pedido comprar(List<Vendedor> vendedores){
        Pedido p = new Pedido(this);
        //mostra todos los vendedores
        System.out.println("Elija el restaurante en el que desea ordenar");
        vendedores.forEach(n -> System.out.println(n.getNombre()));
        
        // seleccionar un vendedor
        Scanner scanner = new Scanner(System.in);
        String vendedorNombre = scanner.nextLine();
        int vendedorSeleccionado=-1;
        Vendedor vendInstance=null;
        for(Vendedor vend : vendedores) {
            if (vend.getNombre().equals(vendedorNombre)) {
                vendInstance = vend;
                break;
            }
        }

        p.setVendedor(vendInstance);

        System.out.println("Productos del restaurante "+vendInstance.getNombre());
        List<ItemMenu> aux = vendInstance.getItems();
        aux.forEach(n -> System.out.println(n.getNombre()));
        Boolean agregarAlgo;//cin algo;
        String producto;
        System.out.println("¿Desea agregar un producto al pedido? true/false");
        Scanner scannerAlgo = new Scanner(System.in);
        agregarAlgo = scannerAlgo.nextBoolean();

        if(!agregarAlgo){
            return p;
        }

        while(agregarAlgo == true){
            System.out.println("Ingrese el nombre del producto a agregar ");
            producto = scanner.nextLine();
            //selecciono producto (cin del producto)
            p.agregarProducto(vendInstance, producto);
            System.out.println("¿Desea agregar otro producto al pedido? true/false");   
            agregarAlgo = scannerAlgo.nextBoolean();   
        }

        //pedido ya con todos los items
        //cuanto duele la jodita?
        //¿cerramos numeros maestro?
        //*gesto de escribir con la mano* (marca patentada de mi viejo)
        
        //ingrese metodo de pago
        System.out.println("Ingrese metodo de pago: MP / TF ");
        while (estrategiaDePago==null) {  
        String metodo=scanner.nextLine();
        switch (metodo) {
            case "MP":
                pagarPorMercadoPago(p);
                break;
            case "TF":
                pagarPorTransferencia(p);
                break;
            default:
                System.out.println("Metodo de pago desconocido, vuelva a ingresar");
                System.out.println("Ingrese metodo de pago: MP / TF ");
                break;
            
        }
        }
        if(estrategiaDePago.pagar()){
            System.out.println("Pago realizado con exito");
            //cambiar estado del pedido
            p.setEstado(ESTADO.PAGADO);
        }else{
            System.out.println("Pago fallido");
        }
        estrategiaDePago=null;

        return p;
    }

    public void pagarPorMercadoPago(Pedido carrito) {
        estrategiaDePago = new PagarPorMercadoPago(carrito);
    }

    public void pagarPorTransferencia(Pedido carrito) {
        estrategiaDePago = new PagarPorTransferencia(carrito);
    }

    public boolean pagar() {
        if(estrategiaDePago == null){
            System.out.println("Primero debe seleccionar una estrategia de pago valida.");
            return false;
        }
        
        return estrategiaDePago.pagar();
    }

    public void update(ESTADO e) {
        
    }
}
