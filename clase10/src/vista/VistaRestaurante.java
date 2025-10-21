package vista;

import controlador.ControladorRestaurante;
import modelo.Ingrediente;

public interface VistaRestaurante {
    public Ingrediente getIngrediente();
    public void mostrarReceta(String receta);
    public void iniciar(ControladorRestaurante controlador);
    
}
