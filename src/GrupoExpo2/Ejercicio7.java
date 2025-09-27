package GrupoExpo2;
import javax.swing.*;
import java.util.*;
public class Ejercicio7 {
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10: ");
        int num = sc.nextInt();
        switch(num) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Numero fuera de rango");
        }
    }
}
