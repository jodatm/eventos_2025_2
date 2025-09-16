public class Persona {
    private String nombre;
    private TipoIdentificacion tipoId;
    private String numeroIdentificacion;
    public Persona(String nombre, TipoIdentificacion tipoId, String numeroIdentificacion) {
        this.nombre = nombre;
        this.tipoId = tipoId;
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoIdentificacion getTipoId() {
        return tipoId;
    }
    public void setTipoId(TipoIdentificacion tipoId) {
        this.tipoId = tipoId;
    }
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
}
