public class Guerrero extends Persona{

    private TipoGuerrero tipoGuerrero;
    private Dragon dragon;
    private boolean nordico;

    public Guerrero(TipoGuerrero tipoGuerrero,
    Dragon dragon, boolean nordico, String nombre, TipoIdentificacion tipoIdentificacion,
    String numeroIdentificacion) {
        super(nombre, tipoIdentificacion,numeroIdentificacion);
        this.tipoGuerrero = tipoGuerrero;
        this.dragon = dragon;
        this.nordico = nordico;
    }

    public TipoGuerrero getTipoGuerrero() {
        return tipoGuerrero;
    }

    public void setTipoGuerrero(TipoGuerrero tipoGuerrero) {
        this.tipoGuerrero = tipoGuerrero;
    }

    public String toString() {
        return "nombre=" + getNombre() + " dragon="+dragon;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public boolean isNordico() {
        return nordico;
    }

    public void setNordico(boolean nordico) {
        this.nordico = nordico;
    }

    
}
