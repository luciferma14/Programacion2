
import java.util.Arrays;
import java.util.Scanner;

public class AER_140 {

    public static int sumaDig(String num){

        int suma = 0;
        
        return suma;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num;
        int dig;

        num = sc.nextLine();

        while(!num.contains("-")){

            int[] lista = new int[num.length()];

            for(int i = 0; i < lista.length; i++){

                lista[i] = num.charAt(0);
            }

            System.out.println(Arrays.toString(lista));

            num = sc.nextLine();
        }
        
    }
}
