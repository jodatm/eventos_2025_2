import java.util.ResourceBundle.Control;

import controlador.ControladorBatalla;
import modelo.Batalla;
import vista.VistaBatallaGUI;
import vista.VistaBatallaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Batalla modelo = new Batalla();
        //VistaBatallaTerminal vista = new VistaBatallaTerminal();
        VistaBatallaGUI vista = new VistaBatallaGUI();
        ControladorBatalla controlador = new ControladorBatalla(modelo, vista);
        controlador.iniciar();
    }
}
