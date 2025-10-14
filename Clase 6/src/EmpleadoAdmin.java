@SuppressWarnings("rawtypes")
public class EmpleadoAdmin <g,h> extends Empleado
implements Humano {

    private String dependencia;
    private String profesion;

    public EmpleadoAdmin(h nombre, g cedula,
    String dependencia, String profesion) {
        super(nombre, cedula);
        this.dependencia = dependencia;
        this.profesion = profesion;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public void saludar(String apodo) {
        System.out.println("saludar " + apodo);
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


    public static void caminar(){
        System.out.println("pla pla pla");
    }

}
