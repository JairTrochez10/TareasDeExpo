package GrupoExpo2;
import java.util.*;
public class Ejercicio3 {
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        String letra = sc.next();
        switch(letra.toLowerCase()) {
            case "a":
                System.out.println("Es una vocal");
                break;
            case "e":
                System.out.println("Es una vocal");
                break;
            case "i":
                System.out.println("Es una vocal");
                break;
            case "o":
                System.out.println("Es una vocal");
                break;
            case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }
    }
}
