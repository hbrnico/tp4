/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Vendedor;

import java.util.List;

public interface VendedorDao {
    public Vendedor getVendedorByID(int id);
    public Vendedor getVendedorByNombre(String nombre);
    public void crearVendedor(Vendedor vendedor);
    public List<Vendedor> getVendedores();
    public void eliminarVendedor(int id);
    public void modificarVendedorPorID(int id, Vendedor v);
}
