import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.Container;

public class App2 extends JFrame{

    Container contenedor;
    JButton boton1, boton2, boton3, boton4;
    GridLayout border;

    public App2(){
        contenedor = getContentPane();
        border = new GridLayout(2,2,30,30);
        contenedor.setLayout(border);

        boton1 = new JButton("1");
        contenedor.add(boton1);

        boton2 = new JButton("2");
        contenedor.add(boton2);

        boton3 = new JButton("3");
        contenedor.add(boton3);

        boton4 = new JButton("4");
        contenedor.add(boton4);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App2 app = new App2();
    }
}
