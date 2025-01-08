
import java.util.Scanner;

public class pm1 {

    final static double PI = 3.141592;

    public static double area(double radio){

        double are = PI * radio * radio;

        return are;
    }

    public static double longitud(double radio){
        
        double longi = 2 * PI * radio;

        return longi;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Escribe el radio: ");
        double radio = sc.nextDouble();

        // double area = PI * radio * radio;
        // double longitud = 2 * PI * radio;

        System.out.println("El área es: " + area(radio));
        System.out.println("La longitud es: " + longitud(radio));
        
    }
}
