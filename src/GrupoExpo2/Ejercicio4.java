package GrupoExpo2;
import java.util.*;
public class Ejercicio4 {
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un color (Rojo Verde Azul): ");
        String color = sc.next();
        switch(color.toLowerCase()) {
            case "rojo":
                System.out.println("Color primario de la luz Rojo");
                break;
            case "verde":
                System.out.println("Color primario de la luz Verde");
                break;
            case "azul":
                System.out.println("Color primario de la luz Azul");
                break;
            default:
                System.out.println("No es un color primario de la luz");
                break;
        }
    }
}
