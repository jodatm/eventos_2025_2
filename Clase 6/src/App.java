import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        EmpleadoAdmin <String,Double> em1 = new EmpleadoAdmin<String,Double>(5.6,"b","sistemas","ingeniero");
        EmpleadoAdmin <Integer,Character> em2 = new EmpleadoAdmin<Integer,Character>('c',123,"sistemas","ingeniero");
        System.out.println(em1.getCedula());
        System.out.println(em2.getCedula());
        //EmpleadoProfesor pr1 = new EmpleadoProfesor("c","d");
        //EmpleadoProfesor pr2 = new EmpleadoProfesor("c","d");
        ArrayList<Humano>lista = new ArrayList<Humano>();
        lista.add(em1);
        lista.add(EmpleadoProfesor.profesor);
        em1.setNombre("alejandra");
        em2.setNombre("david");
        System.out.println(Empleado.cantidadEmpleados);
        EmpleadoAdmin.caminar();
    }

    public static void prueba(){
        String args2 [] = {"abc","dfr"};
        App.main(args2);
    }
}
