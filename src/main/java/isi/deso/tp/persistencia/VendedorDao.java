/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package isi.deso.tp.persistencia;

import isi.deso.tp.logicaNegocios.Vendedor;

public interface VendedorDao {
    public Vendedor getVendedorByID(int id);
}