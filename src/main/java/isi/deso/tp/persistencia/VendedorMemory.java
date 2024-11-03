/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.VendedorNoEncontradoExeption;
import isi.deso.tp.logicaNegocios.Cliente;
import isi.deso.tp.logicaNegocios.Vendedor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class VendedorMemory implements VendedorDao {
    private List<Vendedor> vendedores;
    
    public VendedorMemory() {
        this.vendedores = BaseDeDatos.getVendedorList();
    }

    public Vendedor getVendedorByID (int id) {
        Optional<Vendedor> vendedorEncontrado = this.vendedores.stream()
            .filter(v -> v.getID() == id)
            .findFirst();
        return vendedorEncontrado.orElse(null);
    }

    public Vendedor getVendedorByNombre(String nombre) throws VendedorNoEncontradoExeption {

        List<Vendedor> vl=BaseDeDatos.getVendedorList();


        List<Vendedor> vendedorEncontrado = vl.stream()
                .filter(v -> v.getNombre().equals(nombre))
                .collect(Collectors.toList());

        if(vendedorEncontrado.isEmpty())throw  new VendedorNoEncontradoExeption("No existen vendedores con ese nombre");

        return vendedorEncontrado.get(0);
    }

    public void crearVendedor(Vendedor vendedor){
        int id = BaseDeDatos.getIDCliente();
        vendedor.setID(id);
        BaseDeDatos.aumentarIDCliente();
        BaseDeDatos.addVendedor(vendedor);
    }

    public List<Vendedor> getVendedores() {
        List<Vendedor> vendedores = BaseDeDatos.getVendedorList();
        return vendedores;
    }

    public void eliminarVendedor(int id) {
         BaseDeDatos.eliminarVendedor(id);
    }

    public void modificarVendedorPorID(int id, Vendedor v) {
        BaseDeDatos.modificarVendedorPorID(id,v);
    }
}