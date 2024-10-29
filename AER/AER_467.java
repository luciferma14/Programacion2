import java.util.Scanner;
public class AER_467 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String palab;
        String esMin0;
        String esMin1;

        casos = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i < casos; i++){
            
            palab = sc.nextLine();

            String[] es = palab.split(" es ");

            esMin0 = es[0].toLowerCase();
            esMin1 = es[1].toLowerCase();
            
            if (esMin0.equals(esMin1)){
                System.out.println("TAUTOLOGIA");
            }else{
                System.out.println("NO TAUTOLOGIA");
            }   
        }
    }
}
