import java.util.Scanner;

public class avanzado1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double media;

        System.out.print("Primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Segundo número: ");
        num2 = sc.nextDouble();

        media = (num1 + num2) / 2;

        System.out.println("La media aritmética es: " + media);
    }
}