package modelo;

public class Heroe {
    private byte ataque;
    private byte cuchillazo = 50;
    
    public Heroe(byte ataque) {
        this.ataque = ataque;
    }
    public byte getAtaque() {
        return ataque;
    }
    public void setAtaque(byte ataque) {
        this.ataque = ataque;
    }
    public byte getCuchillazo() {
        return cuchillazo;
    }
    public void setCuchillazo(byte cuchillazo) {
        this.cuchillazo = cuchillazo;
    }

    
}
