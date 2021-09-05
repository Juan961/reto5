package access;


import model.contenidoModel;
import utils.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;


public class contenidoDAO {
    private Connection conn = null;
    
    public int getIdContent(String titulo, String descripcion, String categoria, String produccion){
        int idContent = 0;
        try {
            if(conn==null)
                conn = conexion.getConection();
            
            String sql = "select idContenido from contenido where tituloContenido = ? and descripcionContenido = ? and categoriaContenido = ? and produccionContenido= ? ;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, titulo);
            statement.setString(2, descripcion);
            statement.setString(3, categoria);
            statement.setString(4, produccion);
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                idContent = result.getInt(1);
            }
        
        } catch(SQLException ex){
            System.out.println("Algo salio mal justo aca " + ex);
        }
        
        return idContent;
    }
    
    public ArrayList getAllContent(){
        ArrayList<ArrayList> contents = new ArrayList();
        try{
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "select tituloContenido, descripcionContenido, categoriaContenido, produccionContenido, nombreUsuario from contenido inner join usuario on usuario.idUsuario = contenido.usuario_idUsuario;";
            Statement statement = conn.createStatement();
            ResultSet result    = statement.executeQuery(sql);
            
            while(result.next()){
                ArrayList<String> content = new ArrayList<>();
                for(int i = 1; i <= 5; i++){
                    content.add(result.getString(i));
                }

                contents.add(content);
            }
        
        } catch(SQLException ex){
            System.out.println("Algo salio mal " + ex);
        }
        
        return contents;
    }
    
    public ArrayList getFliterContent(String filter){
        ArrayList<ArrayList> contents = new ArrayList();
        try {
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "select tituloContenido, descripcionContenido, categoriaContenido, produccionContenido, nombreUsuario from contenido inner join usuario on usuario.idUsuario = contenido.usuario_idUsuario where tituloContenido LIKE ? OR descripcionContenido LIKE ? OR categoriaContenido LIKE ? OR produccionContenido LIKE ? OR nombreUsuario LIKE ?;"; 
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + filter + "%");
            statement.setString(2, "%" + filter + "%");
            statement.setString(3, "%" + filter + "%");
            statement.setString(4, "%" + filter + "%");
            statement.setString(5, "%" + filter + "%");
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                ArrayList<String> content = new ArrayList<>();
                for(int i = 1; i <= 5; i++){
                    content.add(result.getString(i));
                }

                contents.add(content);
            }
            
        } catch (SQLException ex) {
            System.out.println("Algo salio mal" + ex);
        }
        return contents;
    }
    
    public boolean createContent(contenidoModel contenido){
        try {
            if(conn == null)
            conn = conexion.getConection();
        
            String sql = "INSERT INTO CONTENIDO (tituloContenido, descripcionContenido, categoriaContenido, produccionContenido, usuario_idUsuario) VALUES (?, ?, ?, ?, ?);";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            // Asignamos valores que queremos formatear segun los tipos de datos
            statement.setString(1, contenido.getTituloContenido());
            statement.setString(2, contenido.getDescripcionContenido());
            statement.setString(3, contenido.getCategoriaContenido());
            statement.setString(4, contenido.getProduccionContenido());
            statement.setInt(5, contenido.getIdUsuarioFK());
            
            int rowsInserted = statement.executeUpdate();
            
            return rowsInserted != 0;
            
        } catch (SQLException ex) {
            System.out.println("Algo salio mal en la insercion" + ex);
        }
        return false;
    }
    
}
