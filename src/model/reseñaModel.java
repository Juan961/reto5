package model;

public class reseñaModel {
    private int idReseña;
    private float calificacionReseña;
    private String contenidoReseña;
    private int idContenidoFK;
    private int idUsuarioFK;

    public reseñaModel(float calificacionReseña, String contenidoReseña, int idContenidoFK, int idUsuarioFK) {
        this.calificacionReseña = calificacionReseña;
        this.contenidoReseña = contenidoReseña;
        this.idContenidoFK = idContenidoFK;
        this.idUsuarioFK = idUsuarioFK;
    }
    
    /**
     * @return the idReseña
     */
    public int getIdReseña() {
        return idReseña;
    }

    /**
     * @return the calificacionReseña
     */
    public float getCalificacionReseña() {
        return calificacionReseña;
    }

    /**
     * @param calificacionReseña the calificacionReseña to set
     */
    public void setCalificacionReseña(float calificacionReseña) {
        this.calificacionReseña = calificacionReseña;
    }

    /**
     * @return the contenidoReseña
     */
    public String getContenidoReseña() {
        return contenidoReseña;
    }

    /**
     * @param contenidoReseña the contenidoReseña to set
     */
    public void setContenidoReseña(String contenidoReseña) {
        this.contenidoReseña = contenidoReseña;
    }

    /**
     * @return the idContenidoFK
     */
    public int getIdContenidoFK() {
        return idContenidoFK;
    }

    /**
     * @param idContenidoFK the idContenidoFK to set
     */
    public void setIdContenidoFK(int idContenidoFK) {
        this.idContenidoFK = idContenidoFK;
    }

    /**
     * @return the idUsuarioFK
     */
    public int getIdUsuarioFK() {
        return idUsuarioFK;
    }

    /**
     * @param idUsuarioFK the idUsuarioFK to set
     */
    public void setIdUsuarioFK(int idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }
    
    
}
