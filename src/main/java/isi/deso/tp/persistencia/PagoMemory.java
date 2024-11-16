package isi.deso.tp.persistencia;

import  isi.deso.tp.logicaNegocios.Pago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagoMemory implements PagoDao {

    public void crearPago(Pago pago){
        Conexion.conectar();
        Connection con = Conexion.getConnection();

        try {
            if(pago.getAlias() != null){
                String query = "INSERT INTO pago(Metodo, Alias) VALUES(?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, pago.getMetodo());
                ps.setString(2, pago.getAlias());
                ps.executeUpdate();
            }
            else{
                String query = "INSERT INTO pago(Metodo, CUIT, CVU) VALUES(?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, pago.getMetodo());
                ps.setString(2, pago.getCUIT());
                ps.setString(3, pago.getCVU());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("Error al crear el pago");
        }

        Conexion.desconectar();
    }

}
