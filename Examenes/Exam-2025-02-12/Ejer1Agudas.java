
import java.util.Scanner;

public class Ejer1Agudas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String palab;
        String ultima;
    
        casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            palab = sc.nextLine();
            
            ultima = palab.substring(palab.length()-1); // o con el charAt() y en el if poner: ultima == 'a' ...

            if(ultima.equals("a") || ultima.equals("e") || ultima.equals("i") ||
                 ultima.equals("o") || ultima.equals("u") || ultima.equals("n") || ultima.equals("s")){

                    System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}
