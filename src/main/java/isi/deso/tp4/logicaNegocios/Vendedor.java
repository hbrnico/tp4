/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package isi.deso.tp4.logicaNegocios;

import isi.deso.tp4.excepciones.ItemNoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vendedor {

    private int id;
    private String nombre;
    private String direccion;
    private Coordenada coordenadas;
    private List<ItemMenu> listaItems;
    
     public Vendedor(int id, String nombre, String direccion, Coordenada coordenadas){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
        this.listaItems = new ArrayList<>();
    }
    
    public Vendedor(int id, String nombre, String direccion, Coordenada coordenadas, List<ItemMenu> listaItems){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.coordenadas = coordenadas;
        this.listaItems = listaItems;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public Coordenada getCoordenadas(){
        return this.coordenadas;
    }
    
    private double haversine(double lat1, double lng1, double lat2, double lng2){
        final double R = 6371;

        lat1 = Math.toRadians(lat1);
        lng1 = Math.toRadians(lng1);
        lat2 = Math.toRadians(lat2);
        lng2 = Math.toRadians(lng2);
        
        double a = Math.pow((Math.sin((lat1-lat2)/2)), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow((Math.sin((lng1-lng2)/2)), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
        
    }
    
    public double distancia(Cliente cliente){
        Coordenada coorV = this.getCoordenadas();
        Coordenada coorC = cliente.getCoordenadas();
        return haversine(coorV.getLat(), coorV.getLng(), coorC.getLat(), coorC.getLng());
    }
    
    public void agregarItem(ItemMenu itemAAgregar){
        this.listaItems.add(itemAAgregar);
    }
    
    public List<ItemMenu> getItems(){
        return this.listaItems;
    }
    
    public List<Bebida> getItemBebidas(){
        List<Bebida> ret = new ArrayList<>();
        for(ItemMenu i: this.listaItems){
            if(i.esBebida()){
                ret.add((Bebida)i);
            }
        }
        return ret;
    }
    
    public List<Plato> getItemComidas(){
        List<Plato> ret = new ArrayList<>();
        for(ItemMenu i: this.listaItems){
            if(i.esComida()){
                ret.add((Plato)i);
            }
        }
        return ret;
    }
    
    public List<Plato> getItemComidasVeganas(){
        List<Plato> ret = new ArrayList<>();
        for(ItemMenu i: this.listaItems){
            if(i.esComida() && i.esAptoVegano()){
                ret.add((Plato) i);
            }
        }
        return ret;
    }
    
    public List<Bebida> getItemBebidasSinAlcohol() {
        List<Bebida> ret = new ArrayList<>();
        for (Bebida b : this.getItemBebidas()) {
            if (b.getGraduacionAlcoholica() == 0) {  // Filtramos solo las bebidas sin alcohol
                ret.add(b);
            }
        }       

    return ret;
    }
public ItemMenu buscarProducto(String nombre) throws ItemNoEncontradoException {
        
        List<ItemMenu> itemsComunes = this.listaItems.stream()
            .filter(ItemMenu -> ItemMenu.getNombre().equals(nombre))  
            .collect(Collectors.toList()); 
        
        if(itemsComunes.isEmpty()) throw new ItemNoEncontradoException("El vendedor " + this.id + " no posee el producto que usted desea");
        ItemMenu item = itemsComunes.get(0);
        return item; 
    };
}