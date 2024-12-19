import java.util.Scanner;

public class Ampliado2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double a;
        int b;
        int c;
        System.out.print("Primer número: ");
        a = sc.nextInt();

        System.out.print("Segundo número: ");
        b = sc.nextInt();

        System.out.print("Tercer número: ");
        c = sc.nextInt();

        // a)
        System.out.println("a)");
        int calculo1a;
        double calculo2a;

        calculo1a = ((int)a - b + c);
        calculo2a = (a - b + c);

        System.out.println("Normal: "+(a - b + c)+ " \ncalculo1 (int) = "+calculo1a+" \ncalculo2 (double) = "+calculo2a);

        // b)
        System.out.println("b)");
        int calculo1b;
        double calculo2b;

        calculo1b = ((int)a % c + 3 * ((int)a - c));
        calculo2b = (a % c + 3 * (a - c));

        System.out.println("Normal: "+(a % c + 3 * (a - c))+ " \ncalculo1 (int) = "+calculo1b+" \ncalculo2 (double) = "+calculo2b);

        // c)
        System.out.println("c)");
        int calculo1c;
        double calculo2c;

        calculo1c = (((int)a - 3 * b) - (c + 2 * (int)a));
        calculo2c = ((a - 3 * b) - (c + 2 * a));

        System.out.println("Normal: "+((a - 3 * b) - (c + 2 * a))+ " \ncalculo1 (int) = "+calculo1c+" \ncalculo2 (double) = "+calculo2c);
    }
}
