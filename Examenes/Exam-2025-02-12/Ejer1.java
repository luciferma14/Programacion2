
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String palab;
        String ultima;
    
        casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            palab = sc.nextLine();
            
            ultima = palab.substring(palab.length()-1);

            if(ultima.equals("a") || ultima.equals("e") || ultima.equals("i") ||
                 ultima.equals("o") || ultima.equals("u") || ultima.equals("n") || ultima.equals("s")){

                    System.out.println("NO");
            }else{
                System.out.println("SI");
            }
        }
    }
}
