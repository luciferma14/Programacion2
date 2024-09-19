import java.util.Scanner;

public class ampliado5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nom;
        String ape1;
        String ape2;
        int tot;

        System.out.print("Dime tu nombre: ");
        nom = sc.nextLine();

        System.out.print("Dime tu primer apellido: ");
        ape1 = sc.nextLine();

        System.out.print("Dime tu segundo apellido: ");
        ape2 = sc.nextLine();

        tot = nom.length() + ape1.length() + ape2.length();

        System.out.println("Total: " + tot);
    }
}
