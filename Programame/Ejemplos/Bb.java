
import java.util.Scanner;

public class Bb {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int ncam = sc.nextInt();

        while (ncam != 0) {
            
            int suma = 0;

            for (int i = 0; i < ncam; i++) {
                int aves = sc.nextInt();
                int anillas = sc.nextInt();

                suma += aves - anillas;
            }

            System.out.println(suma);
            ncam = sc.nextInt();
        }
    }
}
