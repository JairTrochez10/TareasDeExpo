package GrupoExpo3;

public class Ejercicio9 {
    public static void ejercicio9() {
        boolean pri=true;
        for(int num=2;num<=100;num++){
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    pri=false;
                    break;
                }
            }
            if(pri){
                System.out.println(num);
            }
        }
    }
}
