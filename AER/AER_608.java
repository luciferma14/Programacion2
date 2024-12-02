import java.util.Scanner;

public class AER_608 {


    public static int calculaAlarmas(int[] v){

        int cuenta = 0;

        //Realizar las coprobaciones de las temperaturas

        return cuenta;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTem = sc.nextInt();

        while (numTem != 0){

            int[] temp = new int [numTem];

            for (int i = 0; i < numTem; i++) {
                temp[i] = sc.nextInt();
            }
          
            System.out.println(calculaAlarmas(temp));

            numTem = sc.nextInt();

        }
        
    }
    
}
