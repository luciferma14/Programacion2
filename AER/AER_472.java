
import java.util.Scanner;

public class AER_472 {

    static Scanner sc = new Scanner(System.in);

    // mientras el siguente valor sea menor que 300, sigue

    public static boolean esApta(int subidaMax, int[] cotas){
        
        boolean apto = true;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < cotas.length; i++){

            for (int j = 0; j < cotas.length; j++) {
                if (cotas[j] > max){
                    max = cotas[j];
                }
            }
    
            for (int x = 0; x < cotas.length; x++) {
                if (cotas[x] < min){
                    min = cotas[x];
                }
            }

            if((max - min) > subidaMax){
                apto = false;
            }
    
        }

        return apto;
    }
    public static void main(String[] args) {

        while (sc.hasNext()){
            int subidaMax = sc.nextInt();
            int numCotas = sc.nextInt();
            int[] cotas = new int[numCotas];
            
            for (int i = 0; i < numCotas; i++) {
                cotas[i] = sc.nextInt();
            }

            if(esApta(subidaMax, cotas)){
                System.out.println("APTA");
            }else{
                System.out.println("NO APTA");
            }
        }
    }
}
