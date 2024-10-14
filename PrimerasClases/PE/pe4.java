
import java.util.Scanner;

public class pe4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int cont = 2;
        int resto;
        boolean primo = true;

        System.out.print("Dime un número: ");
        num = sc.nextInt();

        while(cont < num && primo){
            resto = num % cont;

            if(resto == 0){
                primo = false;
            }
            cont++;
        }

        if (primo){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
    }
}
