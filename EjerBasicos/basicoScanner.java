import java.util.Scanner;

public class basicoScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = 8;
        int b = 5;
        double res = a / (double) b;

        System.out.printf("La div entre %d y %d es %.1f \n", a, b, res);

        int num1;
        int num2;
        String nom;

        System.out.print("Dime un número: ");
        num1 = sc.nextInt();

        System.out.print("Dime otro número: ");
        num2 = sc.nextInt();

        System.out.println("La suma de los dos: " + (num1 + num2));

        sc.nextLine();

        System.out.print("Dime tu nombre: ");
        nom = sc.nextLine();

        System.out.println("Bienvenid@ " + nom + "a la clase");
        System.out.printf("Bienvenid@ %s a la clase \n", nom);
    }
}