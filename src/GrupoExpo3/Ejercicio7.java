package GrupoExpo3;
import java.util.Scanner;
public class Ejercicio7 {
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num=sc.nextInt();
        int contador=0;
        for(int i=1;i<=100;i++){
            if(i%num==0){
                contador++;
            }
        }
        System.out.println("Cantidad de multiplos de "+num+" entre 1 y 100:"+contador);
    }
}
