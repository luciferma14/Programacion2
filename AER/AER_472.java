
import java.util.Scanner;

public class AER_472 {

    static Scanner sc = new Scanner(System.in);

    // mientras el siguente valor sea menor que 300, sigue

    public static boolean esApta(int subidaMax, int[] cotas){
        
        boolean apto = true;
        int cota = cotas[0];
        int desnivel = 0;

        for(int i = 1; i < cotas.length; i++){

            if(cota < cotas[i]){
                desnivel += cotas[i] - cota;
            }else{
                desnivel = 0;
            }

            cota = cotas[i];
            
            if(desnivel > subidaMax){
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
