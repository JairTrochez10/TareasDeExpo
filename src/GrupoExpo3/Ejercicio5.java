package GrupoExpo3;
import java.util.Scanner;
public class Ejercicio5 {
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        int factorial = 1;
        for(int i=num;i>=1;i--) {
            factorial*= i;
        }
        System.out.println("El factorial de " + num + " es " + factorial);
    }
}
