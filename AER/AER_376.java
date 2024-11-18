import java.util.Scanner;

public class AER_376 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int alt;
        int picos;

        alt = sc.nextInt();

        while (alt != 0){

            int[] montRusa = new int[alt];

            for (int i = 0; i < alt; i++){
                montRusa[i] = sc.nextInt();
            }

            picos = 0;

            //Comprobar si la primera altura es un pico
            if(montRusa[0] > montRusa[1] && montRusa[0] > montRusa[alt-1]){//último
                picos++;
            }
            if (montRusa[alt-1] > montRusa[alt-2] && montRusa[alt-1] > montRusa[0]){
                picos++;
            }
            for(int i = 1; i < alt-1; i++){
                if(montRusa[i] > montRusa[i-1] && montRusa[i] > montRusa[i+1]){
                    picos++;
                }
            }

            System.out.println(picos);

            alt = sc.nextInt();
        }
    }
}
