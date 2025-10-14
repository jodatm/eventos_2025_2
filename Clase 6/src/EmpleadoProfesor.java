@SuppressWarnings("rawtypes")
public class EmpleadoProfesor <g,h> extends Empleado implements
EmpleadoGobierno, Humano{

    public static EmpleadoProfesor <String, Integer>profesor = new EmpleadoProfesor<String,Integer>(1234, "nombre");

    private EmpleadoProfesor(h nombre, g cedula) {
        super(nombre, cedula);
    }

    @Override
    public void saludar(String apodo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saludar'");
    }

    @Override
    public void despedirse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'despedirse'");
    }

    @Override
    public void presentarse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'presentarse'");
    }

    @Override
    public void llorar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'llorar'");
    }

    @Override
    public void credenciales() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'credenciales'");
    }

    @Override
    public void puntaje() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puntaje'");
    }
    
}
