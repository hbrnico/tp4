package isi.deso.tp.logicaNegocios;

public class ItemMenuDTO {
    String nombre;
    int cantidad;
    String vendedor;

    ItemMenuDTO(String nombre, int cantidad, String vendedor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.vendedor = vendedor;
    }
    ItemMenuDTO() {}
    public String getNombre() {return this.nombre;}
    public int getCantidad() {return this.cantidad;}
    public void setNombre(String nombre) {this.nombre=nombre;}
    public void setCantidad(int cantidad) {this.cantidad=cantidad;}
    public void setVendedor(String vendedor) {this.vendedor=vendedor;}
    public String getVendedor() {return this.vendedor;}
}
