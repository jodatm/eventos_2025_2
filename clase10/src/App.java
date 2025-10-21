import controlador.ControladorRestaurante;
import modelo.Restaurante;
import vista.VistaRestaurante;
import vista.VistaRestauranteGUI;
import vista.VistaRestauranteTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurante modelo = new Restaurante();
        //VistaRestaurante vista = new VistaRestauranteGUI();
        VistaRestaurante vista = new VistaRestauranteTerminal();
        ControladorRestaurante controlador = new ControladorRestaurante(modelo, vista);
        controlador.iniciar();
    }
}
