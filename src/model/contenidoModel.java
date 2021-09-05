package model;

public class contenidoModel {
    private int idContenido;
    private String tituloContenido;
    private String descripcionContenido;
    private String categoriaContenido;
    private String produccionContenido;
    private int idUsuarioFK;

    public contenidoModel(String tituloContenido, String descripcionContenido, String categoriaContenido, String produccionContenido, int idUsuarioFK) {
        this.tituloContenido = tituloContenido;
        this.descripcionContenido = descripcionContenido;
        this.categoriaContenido = categoriaContenido;
        this.produccionContenido = produccionContenido;
        this.idUsuarioFK = idUsuarioFK;
    }
    
    /**
     * @return the idContenido
     */
    public int getIdContenido() {
        return idContenido;
    }
    

    public void setIdContenido(String idContenido) {
        this.tituloContenido = idContenido;
    }

    /**
     * @return the tituloContenido
     */
    public String getTituloContenido() {
        return tituloContenido;
    }

    /**
     * @param tituloContenido the tituloContenido to set
     */
    public void setTituloContenido(String tituloContenido) {
        this.tituloContenido = tituloContenido;
    }

    /**
     * @return the descripcionContenido
     */
    public String getDescripcionContenido() {
        return descripcionContenido;
    }

    /**
     * @param descripcionContenido the descripcionContenido to set
     */
    public void setDescripcionContenido(String descripcionContenido) {
        this.descripcionContenido = descripcionContenido;
    }

    /**
     * @return the categoriaContenido
     */
    public String getCategoriaContenido() {
        return categoriaContenido;
    }

    /**
     * @param categoriaContenido the categoriaContenido to set
     */
    public void setCategoriaContenido(String categoriaContenido) {
        this.categoriaContenido = categoriaContenido;
    }

    /**
     * @return the produccionContenido
     */
    public String getProduccionContenido() {
        return produccionContenido;
    }

    /**
     * @param produccionContenido the produccionContenido to set
     */
    public void setProduccionContenido(String produccionContenido) {
        this.produccionContenido = produccionContenido;
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
