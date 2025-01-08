import java.util.Scanner;

public class avanzado3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1;
        double x2;
        double a;
        double b;
        double c;

        System.out.print("Primer número: ");
        a = sc.nextDouble();

        System.out.print("Segundo número: ");
        b = sc.nextDouble();

        System.out.print("Tercer número: ");
        c = sc.nextDouble();

        x1 = ((-b + Math.sqrt((b * b) -(4 * a * c))) / (2 * a));

        x2 = ((-b - Math.sqrt((b * b) -(4 * a * c))) / (2 * a));

        System.out.printf("x1 = %.2f \nx2 = %.2f \n", x1, x2);
    }
}
