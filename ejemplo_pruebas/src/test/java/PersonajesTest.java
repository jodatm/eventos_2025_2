import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Personajes;

public class PersonajesTest {

    @Test
    public void validadCalcularEdadChild(){
        Personajes p1 = new Personajes();
        String result = p1.calcularEdad(7);
        assertEquals(result,"niño");
    }

    @Test
    public void validadCalcularEdadCucho(){
        Personajes p1 = new Personajes();
        String result = p1.calcularEdad(20);
        assertEquals(result,"cucho");
    }
    
}
