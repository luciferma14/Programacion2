
import java.util.Scanner;

public class ampliado1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.print("Primer número: ");
        x = sc.nextInt();

        System.out.print("Segundo número: ");
        y = sc.nextInt();

        int suma = x + y;
        int resta = x - y;
        int mult = x * y;
        double div = (double)x / y;

        System.out.printf("Suma: %d \nResta: %d \nMult: %d \nDiv: %.2f \n", suma, resta, mult, div);
    }
}