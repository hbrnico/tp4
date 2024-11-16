/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package isi.deso.tp.persistencia;

import isi.deso.tp.excepciones.ItemNoEncontradoException;
import isi.deso.tp.logicaNegocios.ItemPedido;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public interface ItemsPedidoDao {
    public List<ItemPedido> buscarPorPedido(int id) throws ItemNoEncontradoException;
    //public List<ItemPedido> buscarPorRestaurante(int idRest) throws ItemNoEncontradoException;
   // public List<ItemPedido> buscarPorRangoPrecio(double min, double max) throws ItemNoEncontradoException;
    //ublic List<ItemPedido> ordenarPor(Comparator<ItemPedido> comp) throws ItemNoEncontradoException;
    //public List<ItemPedido> filtrado(Function<ItemPedido, Boolean> funcion) throws ItemNoEncontradoException;
    public void eliminarItemPedido(int idPedido, int idItemMenu);
    //public void disminuirItemPedido(int idPedido, int idItemMenu);
    public void crearItemPedido(ItemPedido item) throws ItemNoEncontradoException;
}
