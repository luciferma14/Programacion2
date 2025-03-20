import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int rest = n1 / n2;
            System.out.println(rest);
        
        }catch (InputMismatchException e){
            System.out.println("Excepcion: " + e.getMessage());

        }catch (ArithmeticException e){
            System.out.println("Excepcion: " + e.getMessage());

        }catch (Exception e){
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}
