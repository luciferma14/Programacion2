import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sueldo;
        int porte;
        int dobleSueldo;

        sueldo = sc.nextInt();
        porte = sc.nextInt();

        while (sueldo != 0 && porte != 0){

            dobleSueldo = sueldo * 2;

            System.out.println(dobleSueldo * porte);
            
            sueldo = sc.nextInt();
            porte = sc.nextInt();
        }           
    }
}