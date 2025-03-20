
import java.util.Scanner;

public class Excepcion1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4};
        try {
            int n = sc.nextInt();

            System.out.println(numbers[n]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción: desbordamiento de un array");

        } catch (Exception e){
            System.out.println("Excepción" + e.toString());

        }finally {
         System.out.println("Este código se ejecutará siempre");
        }
    }
}