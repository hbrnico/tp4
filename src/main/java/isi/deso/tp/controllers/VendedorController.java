package isi.deso.tp.controllers;

import isi.deso.tp.excepciones.VendedorNoEncontradoExeption;
import isi.deso.tp.logicaNegocios.Coordenada;
import isi.deso.tp.logicaNegocios.Vendedor;
import isi.deso.tp.persistencia.VendedorMemory;

import java.util.List;

public class VendedorController {


    public static void crearVendedor(String nombre, String direccion, double latidud, double longitud){
        Coordenada c = new Coordenada(latidud, longitud);
        Vendedor v = new Vendedor(nombre, direccion, c);
        VendedorMemory m = new VendedorMemory();
        m.crearVendedor(v);

    }

    public static List<Vendedor> buscarListaVendedores(){
        VendedorMemory m = new VendedorMemory();
        List<Vendedor> vendedorList = m.getVendedores();
        return vendedorList;
    }

    public static Vendedor getVendedorByID(int ID) throws VendedorNoEncontradoExeption {
        VendedorMemory m = new VendedorMemory();
        Vendedor v=m.getVendedorByID(ID);
        return v;
    }

    public static Vendedor buscarVendedor(String nombre) throws VendedorNoEncontradoExeption {
        VendedorMemory m = new VendedorMemory();
        Vendedor v=m.getVendedorByNombre(nombre);
        return v;
    }


    public static void eliminarVendedor(String nombre){
        VendedorMemory m = new VendedorMemory();
        Vendedor v=m.getVendedorByNombre(nombre);
        m.eliminarVendedor(v.getID());
    }

    public static void modificarVendedor(String nombre, String direccion, double latidud, double longitud, int id){
        VendedorMemory m = new VendedorMemory();
        Coordenada c = new Coordenada(latidud, longitud);
        Vendedor v=new Vendedor(nombre, direccion, c);
        m.modificarVendedorPorID(id,v);
    }
}
