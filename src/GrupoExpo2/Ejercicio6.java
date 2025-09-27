package GrupoExpo2;
import javax.swing.*;
import java.util.*;
public class Ejercicio6 {
    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        int dinero = 1000;
        System.out.println("Menu de banco");
        System.out.println("\n1. Consultar dinero \n2. Depositar dinero \n3. Retirar dinero \n4. Salir\nSeleecione una: ");
        int opcion = sc.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("Dinero disponible: " + dinero);
                break;
            case 2:
                System.out.println("Ingrese cantidad a depositar");
                int deposito = sc.nextInt();
                if(deposito > 0 && deposito <= 1000) {
                    dinero += deposito;
                    System.out.println("Nuevo saldo: " + dinero);
                } else {
                    System.out.println("Cantidad invalida");
                }
                break;
            case 3:
                System.out.println("Ingrese cantidad a retirar");
                int retiro = sc.nextInt();
                if(retiro > 0 && retiro <= dinero) {
                    dinero -= retiro;
                    System.out.println("Nuevo saldo: " + dinero);
                } else {
                    System.out.println("No se puede retirar esa cantidad");
                }
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
