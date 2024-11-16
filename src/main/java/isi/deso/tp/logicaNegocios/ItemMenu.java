package isi.deso.tp.logicaNegocios;

public abstract class ItemMenu {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private Categoria categoria;
    private Vendedor vendedor;

    public ItemMenu(int id, String nombre, String descripcion, double precio, Categoria categoria, Vendedor vendedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

    public ItemMenu(String nombre, String descripcion, double precio, Categoria categoria, Vendedor vendedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Vendedor getVendedor(){
        return vendedor;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setVendedor(Vendedor v) {this.vendedor=v;}
    
  
    public abstract float peso();
    public abstract boolean esComida();
    public abstract boolean esBebida();
    public abstract boolean esAptoVegano();

    @Override
    public String toString() {
        return "ItemMenu{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + '}';
    }
    
    
}
