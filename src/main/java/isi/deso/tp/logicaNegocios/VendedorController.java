package isi.deso.tp.logicaNegocios;

import isi.deso.tp.persistencia.BaseDeDatos;
import isi.deso.tp.persistencia.VendedorMemory;

public class VendedorController {


    public void crearVendedor(String nombre, String direccion, double latidud, double longitud){
        Coordenada c = new Coordenada(latidud, longitud);
        Vendedor v = new Vendedor(id, nombre, direccion, c);
        VendedorMemory m = new VendedorMemory();
        m.crearVendedor(v);
    }
}
