package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.ControladorRestaurante;
import modelo.Ingrediente;
import java.awt.Container;
import java.awt.FlowLayout;

public class VistaRestauranteGUI extends JFrame implements VistaRestaurante {

    JComboBox <Ingrediente> lista;
    JButton boton;
    Container contenedor;

    public VistaRestauranteGUI(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        Ingrediente [] listaIngredientes = {Ingrediente.POLLO,
        Ingrediente.CARNE, Ingrediente.LECHUGA};
        lista = new JComboBox<>(listaIngredientes);

        contenedor.add(lista);

        boton = new JButton("Dame el plato");

        contenedor.add(boton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
    }

    @Override
    public Ingrediente getIngrediente() {
        return (Ingrediente)lista.getSelectedItem();
    }

    @Override
    public void mostrarReceta(String receta) {
        JOptionPane.showMessageDialog(contenedor, receta);    
    }

    @Override
    public void iniciar(ControladorRestaurante controlador) {
        boton.addActionListener(controlador);
        setVisible(true);    
    }
    
}
