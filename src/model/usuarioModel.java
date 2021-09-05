package model;

public class usuarioModel {
    private int idUsuario;
    private String nombreUsuario;
    private String emailUsuario;
    private String contraseñaUsuario;
    private boolean directorUsuario;
    private boolean shareEmail;

    public usuarioModel (String nombreUsuario, String emailUsuario, String contraseñaUsuario, boolean directorUsuario){
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.directorUsuario = directorUsuario;
    }
    

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the emailUsuario
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * @param emailUsuario the emailUsuario to set
     */
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    /**
     * @return the contraseñaUsuario
     */
    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    /**
     * @param contraseñaUsuario the contraseñaUsuario to set
     */
    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    /**
     * @return the directorUsuario
     */
    public boolean isDirectorUsuario() {
        return directorUsuario;
    }

    /**
     * @param directorUsuario the directorUsuario to set
     */
    public void setDirectorUsuario(boolean directorUsuario) {
        this.directorUsuario = directorUsuario;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setShareEmail(boolean shareEmail){
        this.shareEmail = shareEmail;
    }
    
    public boolean isShareEmail(){
        return shareEmail;
    }
}
