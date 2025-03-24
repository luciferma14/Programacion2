
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ncasos = sc.nextInt(); sc.nextLine();

        for(int i = 0; i < ncasos; i++){
            String palab = sc.nextLine().toLowerCase();

            if(palab.equals("colgadas")){
                System.out.println("Bien");
            }else{
                System.out.println("Mal");
            }
        }
    }
}
