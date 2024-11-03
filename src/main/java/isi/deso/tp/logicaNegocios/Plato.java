/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.logicaNegocios;

public class Plato extends ItemMenu {
    private int calorias;
    private boolean aptoCeliaco;
    private boolean aptoVegano;
    private float peso; //CHEQUEAR SI ESTE ATRIBUTO ESTÁ BIEN
    
    public Plato(int id, String nombre, String descripcion, double precio, Categoria categoria, int calorias, boolean aptoCeliaco, boolean aptoVegano, float peso, Vendedor vendedor) {
        super(id, nombre, descripcion, precio, categoria, vendedor);
        this.calorias = calorias;
        this.aptoCeliaco = aptoCeliaco;
        this.aptoVegano = aptoVegano;
        this.peso = peso;
    }

    //public void setDescription(String descripcion) {this.description = descripcion}

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public boolean esAptoCeliaco() {
        return aptoCeliaco;
    }

    public void setAptoCeliaco(boolean aptoCeliaco) {
        this.aptoCeliaco = aptoCeliaco;
    }

    public void setAptoVegano(boolean aptoVegano) {
        this.aptoVegano = aptoVegano;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{ COMIDA: " + super.getNombre() + ", precio: " + super.getPrecio() + ", peso: " + this.peso() + "}" ;
    }

    @Override
    public boolean esBebida(){
        return false;
    }
    
    @Override
    public boolean esComida(){
        return true;
    }
    
    @Override
    public boolean esAptoVegano(){
        return this.aptoVegano;
    }
    
    @Override
    public float peso(){
        return this.peso*((float)1.1);
    }
}
