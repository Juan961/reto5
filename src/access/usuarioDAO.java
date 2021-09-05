/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import model.usuarioModel;
import utils.conexion;

public class usuarioDAO {
    private Connection conn = null;
    
    // Consultar la informacion del usuario para tenerla a la mano despues del login
    public ArrayList<String> getUser(usuarioModel user){
        
        ArrayList<String> data = new ArrayList<>();  
        
        try {
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "SELECT * FROM USUARIO where emailUsuario=? AND contraseñaUsuario=? ;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getEmailUsuario());
            statement.setString(2, user.getContraseñaUsuario());
            
            ResultSet result = statement.executeQuery();
            
            
            while(result.next()){
                for(int i=1;i<7;i++){
                    data.add(result.getString(i));
                }
            }
            
        } 
        catch (SQLException ex) {
            System.out.println("Algo salio mal por aca" + ex);
        }
        return data;
    }
    
    // Validar el login
    public boolean consultUser(usuarioModel user){
        try {
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "SELECT * FROM USUARIO where emailUsuario=? AND contraseñaUsuario=? ;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getEmailUsuario());
            statement.setString(2, user.getContraseñaUsuario());
            
            ResultSet result = statement.executeQuery();
            
            return result.next();
            
        } catch(SQLException ex){
            System.out.println("Algo salio mal en la consulta" + ex);
        }
        return false;
    }
    
    // Crear un usuario en el register
    public void insertUser(usuarioModel user){
        try {
            if(conn == null)
                conn = conexion.getConection();
            // Sentencia de insercion de SQL
            String sql = "INSERT INTO USUARIO(nombreUsuario, emailUsuario, contraseñaUsuario, directorUsuario) VALUES (?, ?, ?, ?);";
            // Formateamos la sentencia de SQL
            PreparedStatement statement = conn.prepareStatement(sql);
            // Asignamos valores que queremos formatear segun los tipos de datos
            statement.setString(1, user.getNombreUsuario());
            statement.setString(2, user.getEmailUsuario());
            statement.setString(3, user.getContraseñaUsuario());
            System.out.println(user.isDirectorUsuario());
            statement.setBoolean(4, user.isDirectorUsuario());

            int rowsInserted = statement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Algo salio mal en la insercion" + ex);
        }
    }
    
    // Solicitar el id del usuario creador de un contenido para renderizar el contenido del feedback
    public int getIdUser(String titulo, String descripcion, String categoria, String produccion){
        int id = 0;
                
        try{
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "Select idUsuario from usuario, contenido where contenido.usuario_idUsuario = usuario.idUsuario AND contenido.tituloContenido= ? AND contenido.descripcionContenido= ?  AND contenido.categoriaContenido = ? AND contenido.produccionContenido = ? ; ";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, titulo);
            statement.setString(2, descripcion);
            statement.setString(3, categoria);
            statement.setString(4, produccion);
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                id = result.getInt(1);
            }
            
        } catch(SQLException ex){
            System.out.println("Algo salio mal " + ex);
        }
        
        return id;
    }
    
    public boolean deleteUser(usuarioModel user){
        boolean pass = false;
        try {
            if(conn == null)
                conn = conexion.getConection();
            String sql = "DELETE FROM usuario where nombreUsuario=? AND emailUsuario=? AND contraseñaUsuario=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getNombreUsuario());
            statement.setString(2, user.getEmailUsuario());
            statement.setString(3, user.getContraseñaUsuario());
            
            pass = statement.execute();
            
        } catch (SQLException ex) {
            System.out.println("Algo salio mal en la eliminacion del usuario: " + ex);
        }
        return pass;
    }
    
    public boolean updateUser(usuarioModel user, String newName, String newPassword, boolean newIsDirector, boolean newShareEmail){
        boolean pass = false;
        try {
            if(conn == null)
                conn = conexion.getConection();
            String sql = "UPDATE usuario SET nombreUsuario=? contraseñaUsuario=?, directorUsuario=?,  shareEmailUsuario=? where nombreUsuario=? AND emailUsuario=? AND contraseñaUsuario=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, newName);
            statement.setString(2, newPassword);
            statement.setBoolean(3, newIsDirector);
            statement.setBoolean(4, newShareEmail);
            statement.setString(5, user.getNombreUsuario());
            statement.setString(6, user.getEmailUsuario());
            statement.setString(7, user.getContraseñaUsuario());

            int rowsUpdate = statement.executeUpdate();
            
            pass = rowsUpdate != 0;
        } catch (SQLException ex) {
            System.out.println("Algo salio mal en la actualizacion del usuario: " + ex);
        }
        return pass;
    }
    
    public boolean shareEmail(int id){
        boolean value = false;
        try {
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "select shareEmailUsuario from usuario where idUsuario=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            ResultSet result = statement.executeQuery();
            

            while(result.next()){
                System.out.println(result.getBoolean(1));
                value = result.getBoolean(1);
            }
            
            return value;
            
        } catch(SQLException ex){
            System.out.println("Algo salio mal en la verificacion de compartir el email " + ex);
        }
        
        return value;

    }

}
