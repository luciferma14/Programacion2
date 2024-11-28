
import java.util.Scanner;

public class AER_472 {

    // mientras el siguente valor sea menor que 300, sigue

    public static boolean esApta(int subidaMax, int[] cotas){
        
        boolean apto = true;
        
        return apto;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
