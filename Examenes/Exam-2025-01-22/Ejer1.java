
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int palab;
        String frase;
        String fraseMin;

        palab = sc.nextInt();
        sc.nextLine();

        do { 
            frase = sc.nextLine();

            fraseMin = frase.toLowerCase();

            if(fraseMin.contains("ai") || fraseMin.contains("ia")){
                System.out.println("TRAMPA");
            }else{
                System.out.println("LEGAL");
            }

            palab = sc.nextInt();
            sc.nextLine();

        } while (palab != 0);       
    }
}