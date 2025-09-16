public class Dragon {

    

    private String nombre;
    private Poder poder;
    public Dragon(String nombre, Poder poder) {
        this.nombre = nombre;
        this.poder = poder;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Poder getPoder() {
        return poder;
    }
    public void setPoder(Poder poder) {
        this.poder = poder;
    }
    @Override
    public String toString() {
        return "Dragon [nombre=" + nombre + ", poder=" + poder + "]";
    }

    

    
    
}

