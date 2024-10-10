import java.util.Scanner;

public class ejemPE2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        while (num != 0) { 

            System.out.println(num);

            num = sc.nextInt();            
        }

        // OTRA FORMA

        do { 
            num = sc.nextInt();

            if (num != 0){
                System.out.println(num);
            }

        } while (num != 0);


        // Imprime 50 números
        for (int i = 1; i <= 50; i++){
            System.out.println(i);
        }
    }
}
