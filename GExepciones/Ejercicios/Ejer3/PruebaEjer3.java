
import java.util.Scanner;


public class PruebaEjer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n1;
        Integer n2;
        Integer n3;
        Integer n4;
        Double n5;
        Double n6;
        Double n7;
        Double n8;
        
        System.out.print("Introduce un número positivo: ");
        n1 = Ejer3.LeeIntPos();

        System.out.print("Introduce un número: ");
        n1 = Ejer3.LeeInt();

        //System.out.println("Has leído el valor: " + n1);

        System.out.println("Introduce dos número para determinar un rango");
        System.out.print("Primer número: ");
        n2 = sc.nextInt();
        System.out.print("Segundo número: ");
        n3 = sc.nextInt();
        System.out.print("Dime un número entre esos valores: ");
        n4 = Ejer3.LeeIntRango(n2, n3);

        System.out.print("Introduce un número double: ");
        n5 = Ejer3.LeeDou();

        System.out.println("Introduce dos número double para determinar un rango");
        System.out.print("Primer número: ");
        n6 = sc.nextDouble();
        System.out.print("Segundo número: ");
        n7 = sc.nextDouble();
        System.out.print("Dime un número entre esos valores: ");
        n8 = Ejer3.LeeDouRango(n6, n7);
    }
}
