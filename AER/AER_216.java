
import java.util.Scanner;

public class AER_216 {

    public static int[] calcurar(int gotas){

        int [] tiempo = new int[3];

        tiempo[0] = gotas / 3600;
        int resto = gotas % 3600;
        tiempo[1] = resto / 60;
        tiempo[2] = resto % 60;
        
        return tiempo;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        int gotas;

        casos = sc.nextInt();

        for (int i = 0; i < casos; i++){
            gotas = sc.nextInt();

            int[] tiempo = calcurar(gotas);

            System.out.printf("%02d:%02d:%02d%n", tiempo[0], tiempo[1], tiempo[2]); 

        }


    }
}
