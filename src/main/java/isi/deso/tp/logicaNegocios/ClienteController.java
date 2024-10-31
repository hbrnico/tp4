package isi.deso.tp.logicaNegocios;

import isi.deso.tp.persistencia.BaseDeDatos;
import isi.deso.tp.persistencia.ClienteMemory;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    public void crearCliente(String nombre, String cuit, String email,  String direccion, double latidud, double longitud){
        Coordenada c = new Coordenada(latidud, longitud);
        Cliente client = new Cliente(cuit, nombre, email,direccion, c);
        ClienteMemory bdd = new ClienteMemory();
        bdd.crearCliente(client);
    }

    public void eliminarCliente(String nombre){
        //eliminamos el cliente de la bdd o solo no lo mostramos por pantalla???
        
        //eliminacion logica? cliente.setActivo(false);
    }

    public List<Cliente> listarClientes(){
        return new ArrayList<>();
    }
}
