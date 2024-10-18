/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp4.persistencia;

import isi.deso.tp4.logicaNegocios.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
}