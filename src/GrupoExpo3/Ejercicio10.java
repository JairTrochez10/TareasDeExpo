package GrupoExpo3;
import java.util.Scanner;
public class Ejercicio10 {
    public static void ejercicio10() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la altura de la piramide:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
