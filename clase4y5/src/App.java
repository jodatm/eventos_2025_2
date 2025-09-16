import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        Guerrero legolas = new Guerrero(TipoGuerrero.LARGA_DISTANCIA,"pepe");
        Guerrero petro = new Guerrero(TipoGuerrero.CORTA_DISTANCIA,"grillo");

        int lista [] = {1,2,3};
        Guerrero lista2 [] = {legolas, petro, 
            new Guerrero(TipoGuerrero.CORTA_DISTANCIA,"camilo")};
        System.out.println(lista2[2].getNombre());
        }*/
    

        /*ArrayList <Guerrero> listaUsuarios = new ArrayList <Guerrero>();
        boolean crearGuerreros = true;
        while(crearGuerreros){
            Scanner scanner = new Scanner(System.in);
            System.out.println("vea cabezon, digame si quiere crear guerreros (S,N)");
            String consulta = scanner.nextLine();
            switch (consulta) {
                case "S":
                    System.out.println("Dame el nombre");
                    String nombre = scanner.next();
                    System.out.println("Dame el tipo de guerrero");
                    TipoGuerrero tipoGuerrero = TipoGuerrero.valueOf(scanner.next());
                    System.out.println("Dame el nombre del dragon");
                    String nombreDelDragon = scanner.next();
                    System.out.println("Dame el poder del dragon");
                    Poder poder = Poder.valueOf(scanner.next());
                    System.out.println("Decime si es nordico");
                    boolean nordico = scanner.nextBoolean();
                    System.out.println("Dame el td");
                    TipoIdentificacion tipo = TipoIdentificacion.valueOf(scanner.next());
                    System.out.println("Decime el numero del id");
                    String numeroId = scanner.next();
                    listaUsuarios.add(new Guerrero(tipoGuerrero,
                    new Dragon(nombreDelDragon,poder),nordico,nombre,tipo,numeroId));
                    break;
                case "N":
                    crearGuerreros = false;
                    break;
                default:
                    System.out.println("Letra incorrecta! S o N");
                    break;
                }
            }
            System.out.println(listaUsuarios);*/
            Persona persona = new Persona("Alvaro",TipoIdentificacion.TI, "1234");
            
            Guerrero guerrero = new Guerrero(TipoGuerrero.CORTA_DISTANCIA, 
            new Dragon("Chimuelo", Poder.ACIDO), false, 
            "Jose", TipoIdentificacion.PA, "6789");

            Panadero joselina = new Panadero("joselina",
            TipoIdentificacion.CC, "3333", 10);

            ArrayList <Persona> listaPersonas = 
            new ArrayList<Persona>();
            
            listaPersonas.add(guerrero);
            listaPersonas.add(joselina);

            for(Persona persona1: listaPersonas){
                if(persona1.getClass().equals(Guerrero.class)){
                    Guerrero g1 = (Guerrero)persona1;
                    System.out.println(g1.getDragon().getNombre());
                }
            }


            
            /*Persona persona2 = new Guerrero(TipoGuerrero.CORTA_DISTANCIA, 
            new Dragon("Chimuelo", Poder.ACIDO), false, 
            "Jose", TipoIdentificacion.PA, "6789");

            Guerrero guerro2 = new Persona("dkasdas",TipoIdentificacion.PA,"999");

            System.out.println(persona2.getNombre());
            */

        }        

        
}
