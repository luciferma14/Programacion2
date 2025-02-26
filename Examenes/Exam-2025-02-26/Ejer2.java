import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numFora;
        String info;
        String nombre;
        int recom;
        int punteria;
        int mRecom;
        int rc = 0;

        numFora = sc.nextInt();
        sc.nextLine();

        while(numFora != 0){

            for(int i = 0; i < numFora; i++){
                info = sc.nextLine();
                String[] vInfo = info.split(" ");

                nombre = vInfo[0];
                
                punteria = Integer.parseInt(vInfo[2]);

                int[] array = new int[numFora];

                recom = Integer.parseInt(vInfo[1]);
                array[i] = recom;

                // mRecom = 0;
                // for (int j = 0; j < recom; j++){
                //     if(recom > mRecom){
                //         mRecom = recom;
                //     }
                // }

                System.out.println(Arrays.toString(array));
            }

            numFora = sc.nextInt();
            sc.nextLine();
        }
    }
}
