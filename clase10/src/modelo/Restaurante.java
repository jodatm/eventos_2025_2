package modelo;

public class Restaurante {
    public Restaurante(){

    }

    public String getReceta(Ingrediente ingrediente){
        switch(ingrediente){
            case POLLO:
                return "pollo al curry";
            case CARNE:
                return "carne asada";
            case LECHUGA:
                return "ensalada cesar";
            default:
                return "No hay receta"; 
        }
    }
}