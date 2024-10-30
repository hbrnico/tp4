package isi.deso.tp.logicaNegocios;

import isi.deso.tp.persistencia.BaseDeDatos;

public class ClienteController {

    public void crearCliente(String nombre, String cuit, String email,  String direccion, double latidud, double longitud){
        int id= BaseDeDatos.getIDCliente();
        BaseDeDatos.aumentarIDVendedor();
        Coordenada c = new Coordenada(latidud, longitud);
        Cliente client = new Cliente(id,cuit, nombre, email,direccion, c);
        BaseDeDatos.addCliente(client);
    }
}
