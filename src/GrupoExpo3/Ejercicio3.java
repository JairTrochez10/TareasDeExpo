package GrupoExpo3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
