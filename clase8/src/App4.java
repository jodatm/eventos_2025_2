import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App4  extends JFrame{

    Container contenedor;
    JButton b1, b2, b3, b4, b5, b6;
    JTextField campo1;
    JPanel panelBotones;
    BorderLayout border;
    GridLayout grid;

    public App4(){
        contenedor = getContentPane();
        border = new BorderLayout();
        contenedor.setLayout(border);

        panelBotones = new JPanel();
        grid = new GridLayout(3,2);
        panelBotones.setLayout(grid);

        b1 = new JButton("1");
        panelBotones.add(b1);
        b2 = new JButton("2");
        panelBotones.add(b2);
        b3 = new JButton("3");
        panelBotones.add(b3);
        b4 = new JButton("4");
        panelBotones.add(b4);
        b5 = new JButton("5");
        panelBotones.add(b5);
        //b6 = new JButton("6");
        //panelBotones.add(b6);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        String [] colores = {"rojo","azul","amarillo"};
        JComboBox <String>combo = new JComboBox<String>(colores);
        panel2.add(combo);

        panelBotones.add(panel2);

        contenedor.add(panelBotones, BorderLayout.CENTER);

        campo1 = new JTextField(10);
        contenedor.add(campo1, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
           
    }

    public static void main(String[] args) {
        App4 app = new App4();
    }
    
}
