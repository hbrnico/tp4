package isi.deso.tp.persistencia;


import isi.deso.tp.logicaNegocios.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CategoriaMemory implements CategoriaDao {
    private List<Categoria> categorias;

    public CategoriaMemory() {this.categorias = BaseDeDatos.getCategoriaList();}

    @Override
    public Categoria getCategoriaByID(int id) {
        /*
        Optional<Categoria> categoria = this.categorias.stream()
                .filter(cat -> cat.getId() == id)
                .findFirst();
        return categoria.orElse(null);
        */
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        Categoria categoria = null;

        try {
            String query = "SELECT * FROM categoria WHERE ID_Categoria = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                categoria = new Categoria(rs.getInt("ID_Categoria"), rs.getString("Descripcion"), rs.getString("Tipo_item"));
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la categoria por ID: " + id);
        }

        Conexion.desconectar();
        return categoria;
    }

    @Override
    public Categoria getCategoriaByTipo(String tipo) {
        /*
        Optional<Categoria> categoria = this.categorias.stream()
                .filter(cat -> cat.getTipo_item().equals(tipo))
                .findFirst();
        return categoria.orElse(null);
         */

        Conexion.conectar();
        Connection con = Conexion.getConnection();

        Categoria categoria = null;

        try {
            String query = "SELECT * FROM categoria WHERE Tipo_item = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                categoria = new Categoria(rs.getInt("ID_Categoria"), rs.getString("Descripcion"), rs.getString("Tipo_item"));
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la categoria por tipo: " + tipo);
        }

        Conexion.desconectar();
        return categoria;
    }

    public ArrayList<Categoria> getCategorias(){
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        ArrayList<Categoria> categorias = new ArrayList<Categoria>();

        try {
            String query = "SELECT * FROM categoria ";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria(rs.getInt("ID_Categoria"), rs.getString("Descripcion"), rs.getString("Tipo_item"));
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar las categorias: " + e.getMessage());
        }

        Conexion.desconectar();
        return categorias;
    }
}
