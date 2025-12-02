import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;

public class Auxiliar {

    public int division(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public void mostrarArchivo() throws IOException{
        cerrarArchivo();
        System.out.println("....");
    }

    public void cerrarArchivo() throws IOException, FileNotFoundException, BufferOverflowException{
        System.out.println("....");
    }
    
}
