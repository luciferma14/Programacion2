import java.util.Scanner;

public class AER_427{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String pers = "";
        String paren = "";

        casos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < casos; i++){

            String persSec = "Luke";
            String parenSec = "padre";

            pers = sc.nextLine();
            paren = sc.nextLine();

            if (pers.equals(persSec) && paren.equals(parenSec)){
                System.out.println("TOP SECRET");
            }else{
                System.out.println(pers + ", yo soy tu " + paren);
            }
        }
    }
}