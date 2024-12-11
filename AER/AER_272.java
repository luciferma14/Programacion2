
import java.util.Scanner;

public class AER_272 {

    public static int baseSeis(int num){

        int resto;
        int coci;
 
        coci = num / 6;
        resto = num % 6;

        if(coci < 1){
            return resto;
        }else{
            return coci * 10 + resto;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        int num;

        casos = sc.nextInt();

        for(int i = 0; i < casos; i++){
            num = sc.nextInt();

            System.out.println(baseSeis(num));
        }

    }
}
