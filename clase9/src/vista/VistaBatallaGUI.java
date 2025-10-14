package vista;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ControladorBatalla;

public class VistaBatallaGUI extends JFrame implements VistaBatalla{

    JTextField campoAtaque;
    JTextField campoDefensa;
    public static JButton calcularDaño;
    Container contenedor;
    JLabel campoDaño;

    public VistaBatallaGUI(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        campoAtaque = new JTextField(10);
        contenedor.add(campoAtaque);

        campoDefensa = new JTextField(10);
        contenedor.add(campoDefensa);

        campoDaño = new JLabel("El daño es");
        contenedor.add(campoDaño);

        calcularDaño = new JButton("Calcular daño");
        
        contenedor.add(calcularDaño);
        
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public byte getAtaque() {
        return Byte.parseByte(campoAtaque.getText());
    }

    @Override
    public byte getDefensa() {
        return Byte.parseByte(campoDefensa.getText());
    }

    @Override
    public void mostrarDaño(byte daño) {
        campoDaño.setText(daño+"");
    }

    @Override
    public void iniciar(ControladorBatalla controlador) {
        calcularDaño.addActionListener(controlador);
        setVisible(true);
    }
    
}
