/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package isi.deso.tp4;
import isi.deso.tp4.excepciones.ItemNoEncontradoException;
import isi.deso.tp4.logicaNegocios.*;
import isi.deso.tp4.persistencia.PedidoMemory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;


public class Tp4{

    public static void main(String[] args) {

        //test1();
        
        //test2();
        
        //test3();
        
        //test4();

        test5();

    }
    
    public static void test1(){
        Vendedor v1 = new Vendedor(1, "Pedro", "Av. de las Americas 1000", new Coordenada(-31.746894632549242, -60.52480784560017));
        Vendedor v2 = new Vendedor(2, "Lucas", "Bv. Galvez 1200", new Coordenada(-31.638385317681948, -60.68820680511817));
        Vendedor v3 = new Vendedor(3, "Mariano", "Cordoba 700", new Coordenada(-31.720648806383995, -60.52989301773252));
        
        Scanner ingresoTeclado = new Scanner(System.in);
        
        ArrayList<Vendedor> vendedores = new ArrayList<>(Arrays.asList(v1,v2,v3));
        
        System.out.println("Ingrese el ID del vendedor que desea buscar: ");
        int idABuscar = ingresoTeclado.nextInt();
        
        buscarVendedoresPorId(vendedores,idABuscar);
        
        System.out.println("Ingrese el nombre del vendedor que desea buscar: ");
        
        String nombre = ingresoTeclado.next();
        
        buscarVendedoresPorNombre(vendedores, nombre);
        
        System.out.println("Ingrese el ID del vendedor que desea borrar: ");
        
        int idABorrarV = ingresoTeclado.nextInt();
        
        eliminarVendedor(vendedores,idABorrarV);
        
        mostrarVendedores(vendedores);
        
        //ahora con clientes
        System.out.println();
        System.out.println();
        
        Cliente c1 = new Cliente(1, "20-34567892-4", "pedrosanches@gmail.com", "Las Heras 6664", new Coordenada(-31.607585631151917, -60.688909841851526));
        Cliente c2 = new Cliente(2, "27-45678901-6", "maria123@gmail.com", "Castelli 1399", new Coordenada(-31.65805720316965, -60.76379753347072));
        Cliente c3 = new Cliente(3, "30-78901234-5", "corralonpepe@gmail.com", "Saavedra 4599", (new Coordenada(-31.690958263178747, -60.77288831761002)));
        
        ArrayList<Cliente> clientes = new ArrayList<>(Arrays.asList(c1,c2,c3));
        
        System.out.println("Ingrese el ID del cliente que desea buscar: ");
        
        int idABuscar2 = ingresoTeclado.nextInt();
        
        buscarClientesPorId(clientes,idABuscar2);
        
        System.out.println("Ingrese el ID del cliente que desea borrar: ");
        int idABorrarC = ingresoTeclado.nextInt();
        
        eliminarCliente(clientes,idABorrarC);
        
        //Puede cambiarse para probar diferentes distancias
        System.out.println("La distancia entre el vendedor 3 y el cliente 3 es: " + v3.distancia(c3) + " kilometros");
    }
    
    private static void test2(){
        
        Vendedor v1 = new Vendedor(1, "Pedro", "Av. de las Americas 1000", new Coordenada(-31.746894632549242, -60.52480784560017));
        Vendedor v2 = new Vendedor(2, "Lucas", "Bv. Galvez 1200", new Coordenada(-31.638385317681948, -60.68820680511817));
        Vendedor v3 = new Vendedor(3, "Mariano", "Cordoba 700", new Coordenada(-31.720648806383995, -60.52989301773252));
        
        Categoria cat1 = new Categoria(1,"desc1","comida");
        Categoria cat2 = new Categoria(2,"desc1","bebida");
        ItemMenu b1 = new Bebida( 1, "Agua", "", 3000, cat2, (float)0, 300, v1);
        ItemMenu b2 = new Bebida( 2, "Fernet", "", 10000, cat2, (float)0.35, 1000, v1);
        ItemMenu co1 = new Plato( 3, "Milanesa", "", 8000, cat1, 1500, false, false, (float) 300, v1);
        ItemMenu co2 = new Plato( 4, "Hamburguesa", "", 12000, cat1, 3500, false, false, (float) 500, v1);
        ItemMenu co3 = new Plato( 5, "Ensalada", "", 5000, cat1, 3500, true, true, (float) 500, v1);
        
        v1.agregarItem(b1);
        v1.agregarItem(b1);
        v1.agregarItem(b2);
        v1.agregarItem(co1);
        v1.agregarItem(co2);
        v1.agregarItem(co3);
        
        v2.agregarItem(b2);
        v2.agregarItem(b2);
        v2.agregarItem(co2);
        v2.agregarItem(co2);
        
        v3.agregarItem(b1);
        v3.agregarItem(co3);
        v3.agregarItem(co3);
        
        System.out.println("V1:");
        System.out.println("lista comidas:" + v1.getItemComidas());
        System.out.println("lista comidas veg: "+ v1.getItemComidasVeganas());
        System.out.println("lista bebidas:" + v1.getItemBebidas());
        System.out.println("lista bebidas sin alc:" + v1.getItemBebidasSinAlcohol());
        
        System.out.println("V2:");
        System.out.println("lista comidas:" + v2.getItemComidas());
        System.out.println("lista comidas veg: "+ v2.getItemComidasVeganas());
        System.out.println("lista bebidas:" +v2.getItemBebidas());
        System.out.println("lista bebidas sin alc:" + v2.getItemBebidasSinAlcohol());
        
        System.out.println("V3:");
        System.out.println("lista comidas:" + v3.getItemComidas());
        System.out.println("lista comidas veg: "+ v3.getItemComidasVeganas());
        System.out.println("lista bebidas:" +v3.getItemBebidas());
        System.out.println("lista bebidas sin alc:" + v3.getItemBebidasSinAlcohol());
        
    }
    
    public static void test3(){
        Vendedor v1 = new Vendedor(1, "Pedro", "Av. de las Americas 1000", new Coordenada(-31.746894632549242, -60.52480784560017));
        Vendedor v2 = new Vendedor(2, "Lucas", "Bv. Galvez 1200", new Coordenada(-31.638385317681948, -60.68820680511817));
        Vendedor v3 = new Vendedor(3, "Mariano", "Cordoba 700", new Coordenada(-31.720648806383995, -60.52989301773252));
        
        Cliente c1 = new Cliente(1, "20-34567892-4", "pedrosanches@gmail.com", "Las Heras 6664", new Coordenada(-31.607585631151917, -60.688909841851526));
        //Cliente c2 = new Cliente(2, "27-45678901-6", "maria123@gmail.com", "Castelli 1399", new Coordenada(-31.65805720316965, -60.76379753347072));
        //Cliente c3 = new Cliente(3, "30-78901234-5", "corralonpepe@gmail.com", "Saavedra 4599", (new Coordenada(-31.690958263178747, -60.77288831761002)));
        
        //Las variables son simplemente para probar los metodos que desarrollamos en la etapa 3
        
        Categoria cat1 = new Categoria(1, "Categoria de prueba", "x");

        ItemMenu m1 = new Bebida(1, "Coca-Cola", "Gaseosa de cola", 1000.0, cat1, 0.0f, 500, v1);
        ItemMenu m2 = new Bebida(2, "Fanta", "Gaseosa de Naranja", 2000.0, cat1, 0.0f, 600, v1);
        ItemMenu m3 = new Bebida(3, "Cepita de Naranja", "Jugo", 3000.0, cat1, 0.0f, 700, v1);
        ItemMenu m4 = new Bebida(4, "Jugo de Tomate", "Jugo", 4000.0, cat1, 0.0f, 1000, v2);
        ItemMenu m5 = new Bebida(5, "Vino", "Extracto de uvas", 10000.0, cat1, 14.6f, 1000, v2);
        ItemMenu m6 = new Bebida(6, "Jugo de limon", "Jugo", 150.0, cat1, 0.0f, 300, v2);
        ItemMenu m7 = new Bebida(7, "Pepsi", "Gaseosa de cola", 1000.0, cat1, 0.0f, 500, v1);
        ItemMenu m8 = new Bebida(8, "Licuado de banana", "Banana licuada con leche", 400.0, cat1, 0.0f, 300, v3);
        ItemMenu m9 = new Bebida(9, "Licuado de frutilla", "Frutilla licuada con leche", 400.0, cat1, 0.0f, 300, v3);
        ItemMenu m10 = new Bebida(10, "Licuado de arandanos", "Arandanos licuado con leche", 400.0, cat1, 0.0f, 300, v3);
        Plato p11 = new Plato(11, "Suprema", "Pechuga de pollo rebosada", 5000.00, cat1, 600, false, false, 300.00f, v1);
        Plato p12 = new Plato(12, "Suprema", "Pechuga de pollo rebosada", 5500.00, cat1, 650, false, false, 320.00f, v2);
        Plato p13 = new Plato(13, "Milanesa", "Bife de nalga rebosado", 6500.00, cat1, 800, false, false, 310.00f,v1); 
        Plato p14 = new Plato(14, "Milanesa", "Bife de lomo rebosado", 7200.00, cat1, 785, false, false, 350.00f,v3); 
        Plato p15 = new Plato(15, "Papas fritas", "Porción de papas fritas para dos personas", 8000.00, cat1, 1000, true, true, 500.00f,v1); 
        Plato p16 = new Plato(16, "Papas fritas", "Porción de papas fritas para dos personas", 8200.00, cat1, 900, true, true, 450.00f,v2); 
        Plato p17 = new Plato(17, "Empanadas de carne", "Media docena de empanadas de carne", 4500.00, cat1, 1020, false, false, 700.00f,v1);
        Plato p18 = new Plato(18, "Empanadas de carne", "Media docena de empanadas de carne", 4700.00, cat1, 1200, false, false, 750.00f,v3);
        Plato p19 = new Plato(19, "Empanadas de verdura", "Media docena de empanadas de verdura", 4000.00, cat1, 920, false, true, 700.00f,v2);
        Plato p20 = new Plato(20, "Empanadas de verdura", "Media docena de empanadas de verdura", 4500.00, cat1, 880, false, true, 750.00f,v3);

        Pedido ped1 = new Pedido(c1);

        ItemPedido ip1 = new ItemPedido(m1, ped1);
        ItemPedido ip2 = new ItemPedido(m2, ped1);
        ItemPedido ip3 = new ItemPedido(m3, ped1);
        ItemPedido ip4 = new ItemPedido(m4, ped1);
        ItemPedido ip5 = new ItemPedido(m5, ped1);
        ItemPedido ip6 = new ItemPedido(m6, ped1);
        ItemPedido ip7 = new ItemPedido(m7, ped1);
        ItemPedido ip8 = new ItemPedido(m8, ped1);
        ItemPedido ip9 = new ItemPedido(m9, ped1);
        ItemPedido ip10 = new ItemPedido(m10, ped1);
        ItemPedido ip11 = new ItemPedido(p11,ped1);
        ItemPedido ip12 = new ItemPedido(p12,ped1);
        ItemPedido ip13 = new ItemPedido(p13,ped1);
        ItemPedido ip14 = new ItemPedido(p14,ped1);
        ItemPedido ip15 = new ItemPedido(p15,ped1);
        ItemPedido ip16 = new ItemPedido(p16,ped1);
        ItemPedido ip17 = new ItemPedido(p17,ped1);
        ItemPedido ip18 = new ItemPedido(p18,ped1);
        ItemPedido ip19 = new ItemPedido(p19,ped1);
        ItemPedido ip20 = new ItemPedido(p20,ped1);

        ArrayList<ItemPedido> listaItemsPedido = new ArrayList<>(Arrays.asList(ip1,ip2,ip3,ip4,ip5,ip6,ip7,ip8,ip9,ip10,ip11,ip12,ip13,ip14,ip15,ip16,ip17,ip18,ip19,ip20));

        
        ped1.getItemsPedidoMemory().setItemsPedidos(listaItemsPedido);

        //Recomendamos comentar los metodos para probarlos de a 1 y ver mejor los resultados
        
        //Probamos buscarPorRestaurante
        try{
            List<ItemPedido> aux = ped1.getItemsPedidoMemory().buscarPorRestaurante(1);
            aux.forEach(n -> System.out.println(n.getItemMenu().getNombre()));
        } catch(ItemNoEncontradoException x1){
            System.out.println(x1);
        }
        
        //Probamos buscarPorRantoPrecio
        try{
            List<ItemPedido> aux = ped1.getItemsPedidoMemory().buscarPorRangoPrecio(500.0f, 7000.0f);
            aux.forEach(n -> System.out.println(n.getItemMenu().getNombre()));
        } catch(ItemNoEncontradoException x1){
            System.out.println(x1);
        }
        
        //Probamos filtrado
        //Este filtrado utiliza una funcion lambda que se puede intercambiar de acuerdo a
        //el filtro que se desee en el momento. En este caso filtramos aquellos itemPedido
        //asociados al vendedor 1
        try{
            List<ItemPedido> aux = ped1.getItemsPedidoMemory().filtrado(n -> n.getItemMenu().getVendedor().getID() == 1);
            aux.forEach(n -> System.out.println(n.getItemMenu().getNombre()));
        } catch(ItemNoEncontradoException x1){
            System.out.println(x1);
        }
        
        //Probamos ordenarPor
        //Similar al caso de 'filtrado()'. Se puede cambiar el criterio de ordenamiento ajustando
        //el comparator 'comp'. En este caso ordenamos alfabeticamente por el nombre de los itemMenu
        try{
            Comparator<ItemPedido> comp = (a, b) -> a.getItemMenu().getNombre().compareTo(b.getItemMenu().getNombre());
            List<ItemPedido> aux = ped1.getItemsPedidoMemory().ordenarPor(comp);
            aux.forEach(n -> System.out.println(n.getItemMenu().getNombre()));
        } catch(ItemNoEncontradoException x1){
            System.out.println(x1);
        }
    }
    
    public static void test4(){
        Cliente C = new Cliente(1, "20-34567892-4", "pedrosanches@gmail.com", "Las Heras 6664", new Coordenada(-31.607585631151917, -60.688909841851526));
        Vendedor v1 = new Vendedor(1, "Pedro's", "Av. de las Americas 1000", new Coordenada(-31.746894632549242, -60.52480784560017));
        Vendedor v2 = new Vendedor(2, "Lucas'", "Bv. Galvez 1200", new Coordenada(-31.638385317681948, -60.68820680511817));
        Vendedor v3 = new Vendedor(3, "Mariano's", "Cordoba 700", new Coordenada(-31.720648806383995, -60.52989301773252));

        List<Vendedor> vendedores = new ArrayList<>(Arrays.asList(v1,v2,v3));

        Categoria cat1 = new Categoria(1, "Categoria de prueba", "x");

        Bebida m1 = new Bebida(1, "Coca-Cola", "Gaseosa de cola", 1000.0, cat1, 0.0f, 500, v1);
        Bebida m2 = new Bebida(2, "Fanta", "Gaseosa de Naranja", 2000.0, cat1, 0.0f, 600, v1);
        Bebida m3 = new Bebida(3, "Cepita de Naranja", "Jugo", 3000.0, cat1, 0.0f, 700, v1);
        Bebida m4 = new Bebida(4, "Jugo de Tomate", "Jugo", 4000.0, cat1, 0.0f, 1000, v2);
        Bebida m5 = new Bebida(5, "Vino", "Extracto de uvas", 10000.0, cat1, 14.6f, 1000, v2);
        Bebida m6 = new Bebida(6, "Jugo de limon", "Jugo", 150.0, cat1, 0.0f, 300, v2);
        Bebida m7 = new Bebida(7, "Pepsi", "Gaseosa de cola", 1000.0, cat1, 0.0f, 500, v1);
        Bebida m8 = new Bebida(8, "Licuado de banana", "Banana licuada con leche", 400.0, cat1, 0.0f, 300, v3);
        Bebida m9 = new Bebida(9, "Licuado de frutilla", "Frutilla licuada con leche", 400.0, cat1, 0.0f, 300, v3);
        Plato p11 = new Plato(11, "Suprema", "Pechuga de pollo rebosada", 5000.00, cat1, 600, false, false, 300.00f, v1);
        Plato p12 = new Plato(12, "Suprema", "Pechuga de pollo rebosada", 5500.00, cat1, 650, false, false, 320.00f, v2);
        Plato p13 = new Plato(13, "Milanesa", "Bife de nalga rebosado", 6500.00, cat1, 800, false, false, 310.00f,v1);
        Plato p14 = new Plato(14, "Milanesa", "Bife de lomo rebosado", 7200.00, cat1, 785, false, false, 350.00f,v3);
        Plato p15 = new Plato(15, "Papas fritas", "Porción de papas fritas para dos personas", 8000.00, cat1, 1000, true, true, 500.00f,v1);
        Plato p16 = new Plato(16, "Papas fritas", "Porción de papas fritas para dos personas", 8200.00, cat1, 900, true, true, 450.00f,v2);
        Plato p17 = new Plato(17, "Empanadas de carne", "Media docena de empanadas de carne", 4500.00, cat1, 1020, false, false, 700.00f,v1);
        Plato p18 = new Plato(18, "Empanadas de carne", "Media docena de empanadas de carne", 4700.00, cat1, 1200, false, false, 750.00f,v3);
        Plato p19 = new Plato(19, "Empanadas de verdura", "Media docena de empanadas de verdura", 4000.00, cat1, 920, false, true, 700.00f,v2);
        Plato p20 = new Plato(20, "Empanadas de verdura", "Media docena de empanadas de verdura", 4500.00, cat1, 880, false, true, 750.00f,v3);

        v1.agregarItem(p20);
        v1.agregarItem(p18);
        v1.agregarItem(p16);
        v1.agregarItem(m1);
        v1.agregarItem(m2);
        v1.agregarItem(m3);

        v2.agregarItem(p14);
        v2.agregarItem(p12);
        v2.agregarItem(m4);
        v2.agregarItem(m5);
        v2.agregarItem(m6);

        v3.agregarItem(p11);
        v3.agregarItem(p13);
        v3.agregarItem(p15);
        v3.agregarItem(p17);
        v3.agregarItem(p19);
        v3.agregarItem(m7);
        v3.agregarItem(m8);
        v3.agregarItem(m9);

        Pedido p = C.comprar(vendedores);

    }
    
    public static void test5(){
        Cliente C = new Cliente(1, "20-34567892-4", "pedrosanches@gmail.com", "Las Heras 6664", new Coordenada(-31.607585631151917, -60.688909841851526));
        Vendedor v1 = new Vendedor(1, "Pedro's", "Av. de las Americas 1000", new Coordenada(-31.746894632549242, -60.52480784560017));
        Vendedor v2 = new Vendedor(2, "Lucas'", "Bv. Galvez 1200", new Coordenada(-31.638385317681948, -60.68820680511817));
        Vendedor v3 = new Vendedor(3, "Mariano's", "Cordoba 700", new Coordenada(-31.720648806383995, -60.52989301773252));

        List<Vendedor> vendedores = new ArrayList<>(Arrays.asList(v1,v2,v3));

        Categoria cat1 = new Categoria(1, "Categoria de prueba", "x");

        Bebida m1 = new Bebida(1, "Coca-Cola", "Gaseosa de cola", 1000.0, cat1, 0.0f, 500, v1);
        Bebida m2 = new Bebida(2, "Fanta", "Gaseosa de Naranja", 2000.0, cat1, 0.0f, 600, v1);
        Bebida m3 = new Bebida(3, "Cepita de Naranja", "Jugo", 3000.0, cat1, 0.0f, 700, v1);
        Bebida m4 = new Bebida(4, "Jugo de Tomate", "Jugo", 4000.0, cat1, 0.0f, 1000, v2);
        Bebida m5 = new Bebida(5, "Vino", "Extracto de uvas", 10000.0, cat1, 14.6f, 1000, v2);
        Bebida m6 = new Bebida(6, "Jugo de limon", "Jugo", 150.0, cat1, 0.0f, 300, v2);
        Bebida m7 = new Bebida(7, "Pepsi", "Gaseosa de cola", 1000.0, cat1, 0.0f, 500, v1);
        Bebida m8 = new Bebida(8, "Licuado de banana", "Banana licuada con leche", 400.0, cat1, 0.0f, 300, v3);
        Bebida m9 = new Bebida(9, "Licuado de frutilla", "Frutilla licuada con leche", 400.0, cat1, 0.0f, 300, v3);
        Plato p11 = new Plato(11, "Suprema", "Pechuga de pollo rebosada", 5000.00, cat1, 600, false, false, 300.00f, v1);
        Plato p12 = new Plato(12, "Suprema", "Pechuga de pollo rebosada", 5500.00, cat1, 650, false, false, 320.00f, v2);
        Plato p13 = new Plato(13, "Milanesa", "Bife de nalga rebosado", 6500.00, cat1, 800, false, false, 310.00f,v1);
        Plato p14 = new Plato(14, "Milanesa", "Bife de lomo rebosado", 7200.00, cat1, 785, false, false, 350.00f,v3);
        Plato p15 = new Plato(15, "Papas fritas", "Porción de papas fritas para dos personas", 8000.00, cat1, 1000, true, true, 500.00f,v1);
        Plato p16 = new Plato(16, "Papas fritas", "Porción de papas fritas para dos personas", 8200.00, cat1, 900, true, true, 450.00f,v2);
        Plato p17 = new Plato(17, "Empanadas de carne", "Media docena de empanadas de carne", 4500.00, cat1, 1020, false, false, 700.00f,v1);
        Plato p18 = new Plato(18, "Empanadas de carne", "Media docena de empanadas de carne", 4700.00, cat1, 1200, false, false, 750.00f,v3);
        Plato p19 = new Plato(19, "Empanadas de verdura", "Media docena de empanadas de verdura", 4000.00, cat1, 920, false, true, 700.00f,v2);
        Plato p20 = new Plato(20, "Empanadas de verdura", "Media docena de empanadas de verdura", 4500.00, cat1, 880, false, true, 750.00f,v3);

        v1.agregarItem(p20);
        v1.agregarItem(p18);
        v1.agregarItem(p16);
        v1.agregarItem(m1);
        v1.agregarItem(m2);
        v1.agregarItem(m3);

        v2.agregarItem(p14);
        v2.agregarItem(p12);
        v2.agregarItem(m4);
        v2.agregarItem(m5);
        v2.agregarItem(m6);

        v3.agregarItem(p11);
        v3.agregarItem(p13);
        v3.agregarItem(p15);
        v3.agregarItem(p17);
        v3.agregarItem(p19);
        v3.agregarItem(m7);
        v3.agregarItem(m8);
        v3.agregarItem(m9);

        PedidoMemory pedMem = new PedidoMemory();

        Pedido p1 = C.comprar(vendedores);

        pedMem.addPedido(p1);

        System.out.println(p1.getEstado());

        List<Pedido> pedidosPagadosv1 = v1.obtenerPedidosPorEstado(ESTADO.RECIBIDO);

        //Pedido pedidoActualizado.seleccionarPedido(pedidosPagadosv1);

        System.out.println(pedidosPagadosv1.toString());
    }

    //public static Pedido seleccionarPedido(List<Pedido> pedidosLista){
        //Mostrar los pedidos
        //System.out.println("Seleccione un Pedido: ");

//        for (Pedido pedido : pedidosLista) {
  //          System.out.println();
      //      System.out.println(pedido.getFechaHoraPedido());
    //        System.out.println(pedido.getEstado());
            //System.out.println(pedido.getItemsPedidoMemory());
        //}



    //}

    public static void buscarVendedoresPorId(ArrayList<Vendedor> vendedores, int ID){
        boolean encontrado = false;
        Iterator iterador = vendedores.iterator();
        while(encontrado == false && iterador.hasNext()){
            Vendedor v = (Vendedor)iterador.next();
            if(v.getID()==ID){
                encontrado = true;
                System.out.println("Datos almacenados de " + v.getNombre());
                System.out.println("ID: " + v.getID());
                System.out.println("Direccion: " + v.getDireccion());
                System.out.println("Coordenadas: " + v.getCoordenadas().getLat() + " " + v.getCoordenadas().getLng());
            }
        }
        if(encontrado == false){
            System.out.println("No se ha encontrado un vendedor con ese ID.");
        }
    }
    
    public static void buscarVendedoresPorNombre(ArrayList<Vendedor> vendedores, String name){
        boolean encontrado = false;
        Iterator iterador = vendedores.iterator();
        while(iterador.hasNext() == true){
            Vendedor v = (Vendedor)iterador.next();
            if(v.getNombre().equals(name)){
                encontrado = true;
                System.out.println("Datos almacenados de " + v.getNombre());
                System.out.println("ID: " + v.getID());
                System.out.println("Direccion: " + v.getDireccion());
                System.out.println("Coordenadas: " + v.getCoordenadas().getLat() + " " + v.getCoordenadas().getLng());
            }
        }
        if(encontrado == false){
            System.out.println("No se ha encontrado un vendedor con ese nombre.");
        }    
    }
    
    public static void eliminarVendedor(ArrayList<Vendedor> vendedores, int ID){
        boolean encontrado = false;
        for (int i = vendedores.size() - 1; i >= 0; i--) {
            if (vendedores.get(i).getID() == ID) {
                encontrado = true;
                vendedores.remove(i);
                System.out.println("Vendedor borrado con exito.");
            }
        }
        if(encontrado == false){
            System.out.println("No se ha encontrado un vendedor con ese ID.");
        }
    }
    
    public static void mostrarVendedores(ArrayList<Vendedor> vendedores){
        for(Vendedor v: vendedores){
                System.out.println("Datos almacenados de " + v.getNombre());
                System.out.println("ID: " + v.getID());
                System.out.println("Direccion: " + v.getDireccion());
                System.out.println("Coordenadas: " + v.getCoordenadas().getLat() + " " + v.getCoordenadas().getLng());
        }
    }
    
    public static void buscarClientesPorId(ArrayList<Cliente> clientes, int ID){
        boolean encontrado = false;
        Iterator iterador = clientes.iterator();
        while(encontrado == false && iterador.hasNext()){
            Cliente c = (Cliente)iterador.next();
            if(c.getID()==ID){
                encontrado = true;
                System.out.println("Datos almacenados del cliente con ID " + c.getID());
                System.out.println("Cuit: " + c.getCuit());
                System.out.println("Email: " + c.getEmail());
                System.out.println("Direccion: " + c.getDireccion());
            }

        }
        if(encontrado == false){
            System.out.println("No se ha encontrado un cliente con ese ID");
        }
    }
    
    public static void eliminarCliente(ArrayList<Cliente> clientes, int ID){
        boolean encontrado = false;
        for (int i = clientes.size() - 1; i >= 0; i--) {
            if (clientes.get(i).getID() == ID) {
                encontrado = true;
                System.out.println("Se eliminara al cliente con ID " + clientes.get(i).getID());
                clientes.remove(i);
                System.out.println("Cliente borrado con exito.");
            }
        }
        if(encontrado == false){
            System.out.println("No se ha encontrado un cliente con ese ID.");
        }
    } 
    
    public static void mostrarClientes(ArrayList<Cliente> clientes){
        for(Cliente c: clientes){
                System.out.println("Datos almacenados del cliente " +  c.getID());
                System.out.println("Cuit: " + c.getCuit());
                System.out.println("Email: " + c.getEmail());
                System.out.println("Direccion: " + c.getDireccion());
                System.out.println("Coordenadas: " + c.getCoordenadas().getLat() + " " + c.getCoordenadas().getLng());
        }
    }
    
}