import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int rest = n1 / n2;
            resto(n1, n2);
            System.out.println(rest);
        
        }catch (InputMismatchException e){
            System.out.println("Excepcion: " + e.getMessage());

        }catch (ArithmeticException e){
            System.out.println("Excepcion: " + e.getMessage());

        }catch (Exception e){
            System.out.println("Problemas con la division");
        }
    }

    private static void resto(Integer n, Integer m) throws Exception {
        if (n == 0 || m == 0){
            throw new Exception("No se puede dividir por 0");
        }
    }
}