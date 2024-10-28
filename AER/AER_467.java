import java.util.Arrays;
import java.util.Scanner;

public class AER_467 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String palab;
        //String[] es = palab.split("es");

        casos = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i < casos; i++){
            
            palab = sc.nextLine();

            String[] es = palab.split("es");
            
            if (Arrays.equals(es[0], es[2])){
                System.out.println("TAUTOLOGIA");
            }else{
                System.out.println("NO TAUTOLOGIA");
            }
            
        }



    }
}
