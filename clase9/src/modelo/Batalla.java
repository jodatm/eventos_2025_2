package modelo;

public class Batalla {

    public static byte calculoDaño(Heroe heroe, Enemigo enemigo){
        System.out.println(heroe.getAtaque());
        System.out.println(heroe.getCuchillazo());
        System.out.println(enemigo.getDefensa());
        return (byte) (heroe.getAtaque()+heroe.getCuchillazo()-enemigo.getDefensa());
    }
    
}
