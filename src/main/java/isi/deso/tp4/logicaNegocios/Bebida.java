/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.logicaNegocios;

public class Bebida extends ItemMenu {
    private float graduacionAlcoholica;
    private int tamanio;

    
    public Bebida(int id, String nombre, String descripcion, double precio, Categoria categoria, float graduacionAlcoholica, int tamanio, Vendedor vendedor) {
        super(id, nombre, descripcion, precio, categoria, vendedor);
        this.graduacionAlcoholica = graduacionAlcoholica;
        this.tamanio = tamanio;
    }

    public float getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(float graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "{ BEBIDA: " + super.getNombre() + ", precio: " + super.getPrecio() + ", peso: " + this.peso() + "}" ;
    }

    @Override
    public boolean esBebida(){
        return true;
    }
   
    @Override
    public boolean esComida(){
        return false;
    }
    
    @Override
    public boolean esAptoVegano(){
        return true; //CHEQUEAR ESTE METODO PARA VER SI SIEMPRE DEVUELVE TRUE
    }
    
    @Override
    public float peso(){
        if(graduacionAlcoholica == 0) return this.tamanio * ((float)1.04) * ((float)1.2);
        return this.tamanio * ((float)0.99) * ((float)1.2);
    }
}
