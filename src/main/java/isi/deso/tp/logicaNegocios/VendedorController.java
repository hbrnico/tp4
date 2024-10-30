package isi.deso.tp.logicaNegocios;

import isi.deso.tp.persistencia.BaseDeDatos;

public class VendedorController {


    public void crearVendedor(String nombre, String direccion, double latidud, double longitud){
        int id= BaseDeDatos.getIDVendedor();
        BaseDeDatos.aumentarIDVendedor();
        Coordenada c = new Coordenada(latidud, longitud);
        Vendedor v = new Vendedor(id, nombre, direccion, c);
        BaseDeDatos.addVendedor(v);
    }
}
