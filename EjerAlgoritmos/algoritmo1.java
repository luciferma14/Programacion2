import java.util.Scanner;
public class Algoritmo1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        do{
            System.out.print("Primero: ");
            num1 = sc.nextInt();

        }while(num1 <= 0);

        do{
            System.out.print("Segundo: ");
            num2 = sc.nextInt();

        }while(num2 <= 0);

       if (num1 % num2 == 0){
            System.out.println("Si es múltiplo");
       }else {
            System.out.println("No es múltiplo");
       }
    }
}
