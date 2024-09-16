import java.util.Scanner;

public class basicoScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        String nom;

        System.out.print("Dime un número: ");
        num1 = sc.nextInt();

        System.out.print("Dime otro número: ");
        num2 = sc.nextInt();

        System.out.println("La suma de los dos: " + (num1 + num2));

        System.out.println("Dime tu nombre: ");
        nom = sc.nextLine();

        System.out.println("Bienvenido " + nom);

    }
}