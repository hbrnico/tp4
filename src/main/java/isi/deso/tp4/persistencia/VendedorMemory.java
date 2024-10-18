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
        this.vendedores = new ArrayList<>();
    }

    public VendedorMemory(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    
 
    @Override
    public Vendedor getVendedorByID (int id) {
        Optional<Vendedor> vendedorEncontrado = vendedores.stream()
            .filter(v -> v.getID() == id)  
            .findFirst();

        // Retorna el vendedor si fue encontrado, si no retorna null (mejor seria una excepcion)
        return vendedorEncontrado.orElse(null);
    }
}