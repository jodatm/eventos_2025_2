public class Panadero extends Persona {

    private int añosExperiencia;

    public Panadero(String nombre, TipoIdentificacion tipoId,
     String numeroIdentificacion, int añosExperiencia) {
        super(nombre, tipoId, numeroIdentificacion);
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    
    
}
