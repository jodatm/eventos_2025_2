package controlador;

import modelo.Monstruos;
import modelo.Personaje;
import vista.VistaInicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorInicial implements ActionListener{
    Personaje p1;
    Monstruos m1;
    VistaInicial vista;

    
    
    public ControladorInicial(Personaje p1, Monstruos m1, VistaInicial vista) {
        this.p1 = p1;
        this.m1 = m1;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public void iniciar(){
        vista.iniciar();
    }
}
