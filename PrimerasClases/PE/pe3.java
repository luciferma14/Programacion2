import java.util.Scanner;

public class pe3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int coci;
        int contDig = 1;
        int n;

        System.out.print("Dime un número (máx 6 dig): ");
        num = sc.nextInt();

        n = num;

        if(n < -1000000 || n > 1000000){
            System.out.println("Número mayor de 6 dig");

        }else{
            do { 
                coci = (num / 10);
                
                if (coci != 0){
                    contDig++;
                    num = coci;
                }
                
            } while (coci != 0);

            System.out.println(contDig + " dígitos");
        }
    }
}
