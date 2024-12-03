
import java.util.Scanner;

public class AER_472 {

    static Scanner sc = new Scanner(System.in);

    // mientras el siguente valor sea menor que 300, sigue

    public static boolean esApta(int subidaMax, int[] cotas){
        
        boolean apto = true;

        for(int i = cotas.length; i < 0; i--){
            for (int j = cotas.length; j < 1; j--) {

                if (cotas[i] - cotas[j] < subidaMax){
                    apto = false;
                }   
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
