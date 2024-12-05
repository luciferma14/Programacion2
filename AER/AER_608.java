import java.util.Scanner;

public class AER_608 {


    public static int calculaAlarmas(int[] v){

        int cuenta = 0;

        //Realizar las coprobaciones de las temperaturas

        return cuenta;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ntemp = sc.nextInt();

        while (ntemp != 0){

            int[] temp = new int [ntemp];

            for (int i = 0; i < ntemp; i++) {
                temp[i] = sc.nextInt();
            }
          
            System.out.println(calculaAlarmas(temp));

            //Siguiente caso
            ntemp = sc.nextInt();

        }
        
    }
    
}