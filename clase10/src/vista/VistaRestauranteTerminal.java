package vista;

import java.util.Scanner;

import controlador.ControladorRestaurante;
import modelo.Ingrediente;

public class VistaRestauranteTerminal implements VistaRestaurante {

    Ingrediente ingrediente;

    @Override
    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    @Override
    public void mostrarReceta(String receta) {
        System.out.println("La receta es:" + receta);    
    }

    @Override
    public void iniciar(ControladorRestaurante controlador) {
        System.out.println("Dame el ingrediente");
        Scanner scanner = new Scanner(System.in);
        ingrediente = Ingrediente.valueOf(scanner.next());   
        controlador.actionPerformed(null); 
    }
    
}
