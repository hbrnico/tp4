/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.logicaNegocios;

import isi.deso.tp4.observer.Observable;
import isi.deso.tp4.observer.Observer;
import isi.deso.tp4.persistencia.PedidoMemory;
import isi.deso.tp4.strategy.EstrategiaPago;
import isi.deso.tp4.strategy.PagarPorMercadoPago;
import isi.deso.tp4.strategy.PagarPorTransferencia;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Cliente implements Observer {
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

    public void comprar(List<Vendedor> vendedores) throws IOException {
        Pedido p = new Pedido(this);
        p.addObserver(this);
        System.out.println("Elija el restaurante en el que desea ordenar");
        vendedores.forEach(n -> System.out.println(n.getNombre()));

        //INPUTs
        //FileReader f = new FileReader("src/main/java/isi/deso/tp4/archivoPrueba");// INGRESO POR TECLADO
        //BufferedReader b = new BufferedReader(f);// INGRESO POR TECLADO
        Scanner scanner = new Scanner(System.in);
        Scanner scannerAlgo = new Scanner(System.in);

        // seleccionar un vendedor
        Vendedor vendInstance=null;
        int vendedorSeleccionado=-1;
        while(vendInstance == null) {
            //String vendedorNombre = b.readLine(); // ARCHIVO
            String vendedorNombre = scanner.nextLine(); // INGRESO POR TECLADO

            for (Vendedor vend : vendedores) {
                if (vend.getNombre().equals(vendedorNombre)) {
                    vendInstance = vend;
                    break;
                }
            }
            if (vendInstance == null) {
                System.out.println("El vendedor ingresado no existe. Ingrese los datos nuevamente.");
            }
        }
        p.setVendedor(vendInstance);

        System.out.println("Productos del restaurante "+vendInstance.getNombre());
        List<ItemMenu> aux = vendInstance.getItems();
        aux.forEach(n -> System.out.println(n.getNombre()));
        Boolean agregarAlgo = false, valorValido = false;
        String producto;
        System.out.println("¿Desea agregar un producto al pedido? true/false");
        // agregarAlgo = Boolean.valueOf(b.readLine()); // ARCHIVO

        while(!valorValido) {
            try {
                agregarAlgo = scannerAlgo.nextBoolean(); // INGRESO POR TECLADO
                valorValido = true;
            } catch (Exception e) {
                System.out.println("Error: Debes ingresar 'true' o 'false'. Por favor, reingresa el valor.");
                scannerAlgo.next();
            }
        }

        valorValido = false;

        while(agregarAlgo){
            System.out.println("Ingrese el nombre del producto a agregar ");
            // producto = b.readLine(); // ARCHIVO
            producto = scanner.nextLine(); // INGRESO POR TECLADO
            p.agregarProducto(producto);
                System.out.println("¿Desea agregar un producto al pedido? true/false");
                // agregarAlgo = Boolean.valueOf(b.readLine()); // ARCHIVO
            while(!valorValido) {
                try {
                    agregarAlgo = scannerAlgo.nextBoolean(); // INGRESO POR TECLADO
                    valorValido = true;
                } catch (Exception e) {
                    System.out.println("Error: Debes ingresar 'true' o 'false'. Por favor, reingresa el valor.");
                    scannerAlgo.next();
                }
            }
        }

        if(p.getItemsDelPedido().isEmpty()){
            return ;
        }

        PedidoMemory ped = new PedidoMemory();
        ped.addPedido(p);
    }

    public void pagarPorMercadoPago(Pedido carrito) {
        estrategiaDePago = new PagarPorMercadoPago(carrito);
    }

    public void pagarPorTransferencia(Pedido carrito) {
        estrategiaDePago = new PagarPorTransferencia(carrito);
    }

    public void update(Observable obs) {
        Pedido p = (Pedido) obs;

        switch(p.getEstado()){
            case ESTADO.EN_ENVIO:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese metodo de pago: MP / TF ");
                while (estrategiaDePago==null) {
                    String metodo=scanner.nextLine();
                    switch (metodo){
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
                    p.setEstado(ESTADO.RECIBIDO);
                }
                else System.out.println("Pago fallido");

                estrategiaDePago=null;
                break;

            case ESTADO.RECHAZADO:
                System.out.println("Pedido rechazado.");
                break;

            case ESTADO.EN_ESPERA:
                System.out.println("Su pedido llego al vendedor, ahora se encuentra en espera de confirmacion.");
                break;

            case ESTADO.ENTREGADO:
                System.out.println("Su pedido fue entregado con exito. Esperamos que lo distrufe.");
                break;

            case ESTADO.RECIBIDO:
                System.out.println("Su pedido fue recibido con exito por el restaurante. Se le notificara cuando se acepte o rechace el mismo.");
                break;
        }

    }
}
