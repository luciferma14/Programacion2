
import java.util.Scanner;

public class AER_763 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String palab;

        casos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < casos; i++){
            palab = sc.nextLine();

            if(palab.toLowerCase().equals("colgadas")){
                System.out.println("Bien");
            }else{
                System.out.println("Mal");
            }
        }
    }
}
