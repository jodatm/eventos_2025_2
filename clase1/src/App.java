public class App {
    public static void main(String[] args) {
        int edades [] = {20,30,25};
        for(int edad : edades){
            int nuevaEdad = (int)(Math.random()*10+edad);
            System.out.println(nuevaEdad);
        }
        int matriz [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("--- Matriz ---");
        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0; j < matriz[i].length ; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}
