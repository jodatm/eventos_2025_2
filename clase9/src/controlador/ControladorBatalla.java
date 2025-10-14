package controlador;

import modelo.Batalla;
import modelo.Enemigo;
import modelo.Heroe;
import vista.VistaBatalla;
import vista.VistaBatallaGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorBatalla implements ActionListener{
    Batalla modelo;
    VistaBatalla vista;

    public ControladorBatalla(Batalla modelo, VistaBatalla vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==VistaBatallaGUI.calcularDaño){
            
        }
        byte ataque = vista.getAtaque();
        Heroe heroe = new Heroe(ataque);
        byte defensa = vista.getDefensa();
        Enemigo enemigo = new Enemigo(defensa);
        byte daño = modelo.calculoDaño(heroe, enemigo);
        vista.mostrarDaño(daño);
    }

    public void iniciar(){
        vista.iniciar(this);
    }

    
}
