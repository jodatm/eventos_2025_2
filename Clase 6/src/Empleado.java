public abstract class Empleado <g,h>{

    private h nombre;
    private g cedula;
    public static int cantidadEmpleados = 0;

    public Empleado(h nombre, g cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        cantidadEmpleados++;
    }
    public h getNombre() {
        return nombre;
    }
    public void setNombre(h nombre) {
        this.nombre = nombre;
    }
    public g getCedula() {
        return cedula;
    }
    public void setCedula(g cedula) {
        this.cedula = cedula;
    }

    public abstract void saludar(String apodo);    

}
