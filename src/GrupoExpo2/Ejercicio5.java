package GrupoExpo2;
import javax.swing.*;
import java.util.*;

public class Ejercicio5 {
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de mascotas");
        System.out.println("1. Perro \n2. Gato \n3. Conejo\nSeleecione una: ");
        int mascota = sc.nextInt();
        switch(mascota) {
            case 1:
                System.out.println("Has adoptado un Perro");
                break;
            case 2:
                System.out.println("Has adoptado un Gato");
                break;
            case 3:
                System.out.println("Has adoptado un Conejo");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
}
