package vista;

import java.util.Scanner;

import controlador.ControladorBatalla;

public class VistaBatallaTerminal implements VistaBatalla{

    byte ataque;
    byte defensa;

    @Override
    public byte getAtaque() {
        return ataque;  
    }

    @Override
    public byte getDefensa() {
        return defensa;
    }

    @Override
    public void mostrarDaño(byte daño) {
        System.out.println("El daño del heroe al enemigo es " + daño);
    }

    @Override
    public void iniciar(ControladorBatalla controlador) {

        boolean sigueJuego = true;
        while(sigueJuego){
           System.out.println("Bienvenido a DQ");
            System.out.println("presiona 1 para indicar el ataque");
            System.out.println("presiona 2 para indicar la defensa");
            System.out.println("presiona 3 para calcular el daño");
            System.out.println("presiona 4 para terminar");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                byte ataqueIngresado = scanner.nextByte();
                ataque = ataqueIngresado;
                break;
                case 2:
                byte defensaIngresada = scanner.nextByte();
                defensa = defensaIngresada;
                break;
                case 3:
                controlador.actionPerformed(null);
                break;
                case 4:
                 sigueJuego = false;
                 break;
                default:
                System.out.println("Opciona invallida");
                break;
            }
        }

        

        
    }
    
}
