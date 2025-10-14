package vista;

import controlador.ControladorBatalla;

public interface VistaBatalla {
    public byte getAtaque();
    public byte getDefensa();
    public void mostrarDaño(byte daño);
    public void iniciar(ControladorBatalla controlador);
}
