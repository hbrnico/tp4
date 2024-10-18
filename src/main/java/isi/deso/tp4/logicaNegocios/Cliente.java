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
import isi.deso.tp4.logicaNegocios.ESTADO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.ElementType;
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
        Boolean agregarAlgo = null;
        String producto;
        //Scanner scannerAlgo = new Scanner(System.in);
       // while(agregarAlgo){
            System.out.println("¿Desea agregar un producto al pedido? true/false");
            agregarAlgo = Boolean.valueOf(b.readLine());
       // }

        while(agregarAlgo){
            System.out.println("Ingrese el nombre del producto a agregar ");
            producto = scanner.nextLine();
            //selecciono producto (cin del producto)
            p.agregarProducto(producto);
            //while(agregarAlgo != true && agregarAlgo != false){
                System.out.println("¿Desea agregar un producto al pedido? true/false");
                agregarAlgo = Boolean.valueOf(b.readLine());
            //}
        }

        if(p.getItemsDelPedido().isEmpty()){
            return 0;
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

    public boolean pagar() {
        if(estrategiaDePago == null){
            System.out.println("Primero debe seleccionar una estrategia de pago valida.");
            return false;
        }
        
        return estrategiaDePago.pagar();
    }

    public void update(ESTADO estado) {
        if(estado == ESTADO.EN_ENVIO){
            //LOGICA QUE GENERA PAGO
        }
    }
}
