
import java.util.Scanner;

public class AER_216 {

    public static int segundos(int gotas){

        int seg = 00;

        if (gotas >= 59){
            return seg;
        }else {
            return gotas;
        }
    }

    public static int minutos(int gotas){

        int min = 0;

        if (gotas >= 60){
            min++;
            return min;
        }else {
            return min;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        int gotas;

        casos = sc.nextInt();

        for (int i = 0; i < casos; i++){
            gotas = sc.nextInt();

            System.out.printf("00 : %02d : %02d\n", minutos(gotas),segundos(gotas)); 

        }


    }
}
