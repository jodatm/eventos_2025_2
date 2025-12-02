import controlador.ControladorInicial;
import modelo.Monstruos;
import modelo.Personaje;
import vista.VistaInicialTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Personaje p1 = new Personaje();
        Monstruos m1 = new Monstruos();
        VistaInicialTerminal vista = new VistaInicialTerminal();
        ControladorInicial controlador = new ControladorInicial(p1,m1,vista);
        controlador.iniciar();
    }
}
