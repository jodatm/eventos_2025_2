import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class App extends JFrame{

    Container contenedor;
    JButton boton1, boton2, boton3, boton4;
    BorderLayout border;

    public App(){
        contenedor = getContentPane();
        border = new BorderLayout(20,20);
        contenedor.setLayout(border);

        boton1 = new JButton("1");
        contenedor.add(boton1, BorderLayout.NORTH);

        boton2 = new JButton("2");
        contenedor.add(boton2, BorderLayout.EAST);

        boton3 = new JButton("3");
        contenedor.add(boton3, BorderLayout.SOUTH);

        boton4 = new JButton("4");
        contenedor.add(boton4, BorderLayout.CENTER);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
    }
}
