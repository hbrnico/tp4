package isi.deso.tp.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/tpdeso";
    private static final String user = "root";
    private static final String password = "";

    public static void conectar(){
        con= null;
        try {
            Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url,user,password);
            if(con!=null){
                System.out.println("Conexion establecida");
            }
        }
        catch (ClassNotFoundException e) {
            System.out.println("Error de conexion");
        } catch (SQLException e) {
            System.out.println("Error de conexion");
        }
    }

    public static  void desconectar() {
        try{
        con.close();
        }catch(SQLException e){
            System.out.println("Error de conexion");
        }
    }

    public static Connection getConnection(){
        return con;
    }
}

