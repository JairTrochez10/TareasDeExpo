package GrupoExpo3;

public class Ejercicio6 {
    public static void ejercicio6() {
        int pare =0;
        int impare =0;
        for(int i=1;i<=100;i++) {
            if(i%2==0) {
                pare += i;
            } else {
                impare += i;
            }
        }
        System.out.println("Suma de pare: "+pare);
        System.out.println("Suma de impares: "+impare);
    }
}
