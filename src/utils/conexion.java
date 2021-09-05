package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public static Connection getConection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(propierties.dbURL, propierties.username, propierties.password);
            if (conn != null) {
                System.out.println("*** Conected to database ***");
                return conn;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args){
        conexion conn = new conexion();
        conn.getConection();
    }
            
}
