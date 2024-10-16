/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.logicaNegocios;

public class Coordenada{
    private double lat;
    private double lng;
    
    public Coordenada(double lat, double lng){
        this.lat = lat;
        this.lng = lng;
    }
    
    public Coordenada getCoordenadas(){
        return this;
    }
    
    public double getLat(){
        return this.lat;
    }
    
    public double getLng(){
        return this.lng;
    }
}
