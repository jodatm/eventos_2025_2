package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Ingrediente;
import modelo.Restaurante;
import vista.VistaRestaurante;

public class ControladorRestaurante implements ActionListener{

    Restaurante restaurante;
    VistaRestaurante vista;
    public ControladorRestaurante(Restaurante restaurante, VistaRestaurante vista) {
        this.restaurante = restaurante;
        this.vista = vista;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Ingrediente ingrediente = vista.getIngrediente();
        String receta = restaurante.getReceta(ingrediente);
        vista.mostrarReceta(receta);
    }

    public void iniciar(){
        vista.iniciar(this);
    }
    
}
