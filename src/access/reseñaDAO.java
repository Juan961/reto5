package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import utils.conexion;
import model.reseñaModel;
import model.contenidoModel;

public class reseñaDAO {
    private Connection conn = null;
    
    public String getContactUser(int id){
        String emailUser = "";
        try {
            if(conn == null)
                conn = conexion.getConection();
            String sql = "select emailUsuario from usuario where idUsuario=?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                emailUser = result.getString(1);
            }
            
        } catch(SQLException ex){
            System.out.println("Algo salio mal en obtener el email del usuario" + ex);
        }
        
        return emailUser;
    }
    
    public ArrayList<ArrayList> getAllReviews(int idContenido){
        ArrayList<ArrayList> reviews = new ArrayList<>();
        try {
            if(conn == null)
               conn = conexion.getConection();
            String sql = "select calificacionReseña, contenidoReseña, nombreUsuario from reseña inner join usuario where reseña.usuario_idUsuario=usuario.idUsuario AND contenido_idContenido= ? ;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, idContenido);
            
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                ArrayList<String> review = new ArrayList<>();
                for(int i = 1; i <= 3; i++){
                    review.add(result.getString(i));
                }
                reviews.add(review);
            }
            
        } catch(SQLException ex){
            System.out.println("Algo salio mal en la obtencion de todas las reviews" + ex);
        }     
       
        return reviews;
    }
    
    public boolean createReview(reseñaModel reseña){
        
        try {
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "INSERT INTO reseña (calificacionReseña, contenidoReseña, contenido_idContenido, usuario_idUsuario) VALUES (?, ?, ?, ?);";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setFloat(1, reseña.getCalificacionReseña());
            statement.setString(2, reseña.getContenidoReseña());
            statement.setInt(3, reseña.getIdContenidoFK());
            statement.setInt(4, reseña.getIdUsuarioFK());
            
            int rows = statement.executeUpdate();
            
            return rows >= 1;  
                    
        } catch(SQLException ex){
            System.out.println("Algo salio mal en la creacion de la review" + ex);
        }
        return false;
    }
    
    public void deleteAllReviewsFromUser(int idUser){
        try {
            if(conn == null)
                conn = conexion.getConection();
            
            String sql = "DELETE FROM reseña where usuario_idUsuario = ?;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, idUser);
            
            boolean execute = statement.execute();
            
        } catch(SQLException ex) {
            System.out.println("Algo salio mal en la eliminacion de todas las reseñas del usuario " + ex);
        }
    }

}
