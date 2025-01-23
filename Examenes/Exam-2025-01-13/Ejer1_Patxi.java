import java.util.Scanner;

public class Ejer1_Patxi {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int sueldo = sc.nextInt();
        int porteadores = sc.nextInt();

        while (sueldo != 0 && porteadores != 0) {

            System.out.println(sueldo * 2 * porteadores);

            sueldo = sc.nextInt();
            porteadores = sc.nextInt();
            
        }
        
    }
}
