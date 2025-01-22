
import java.util.HashSet;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase;
        String fraseMin;
        int dentro;

        while(sc.hasNext()){

            frase = sc.nextLine();
            fraseMin = frase.toLowerCase();
            String[] esp = fraseMin.split(" ");

            HashSet<String> hash = new HashSet<>();

            dentro = 0;

            for (int i = 0; i < esp.length; i++) {
                String repe = esp[i];
                if(hash.add(repe)){
                    dentro++;
                }
            }
            System.out.println(dentro);
        }
    }    
}
