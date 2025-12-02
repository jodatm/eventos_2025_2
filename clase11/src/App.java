import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        //int divisor = 0;
        while(true){
            Scanner scanner = new Scanner (System.in);
            try{
                //divisor = scanner.nextInt();
                //System.out.println(100/divisor);*/
                int creditos = scanner.nextInt();
                if(creditos<2 || creditos>22){
                    throw new CreditosException("ni muchos ni pocos");
                }
                break;
            } catch(InputMismatchException e){
                System.out.println("debes ingresar digitos 1,2,3, etc...");
            } catch(ArithmeticException e){
                System.out.println("vea cabezon, sobre 0 no!!!!");
            } catch (CreditosException e){
                System.out.println(e.getMessage());
            } 
            catch(Exception e){
                System.out.println("Algo inesperado sucedio");
            }
        }
        
    
        System.out.println(":D");
        Auxiliar aux = new Auxiliar();
        try{
            aux.division(10, 0);
        }catch(ArithmeticException e){

        }
        aux.division(1, 0);

        try {
            aux.mostrarArchivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

