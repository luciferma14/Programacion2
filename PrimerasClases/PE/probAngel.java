import java.util.Scanner;

public class probAngel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int cociente;
        int resto;

        System.out.print("Dame un número: ");
        num = sc.nextInt();

        cociente = num / 10;
        resto = num % 10;

        if (num <= 1 || num >= 100){
            System.out.println("Número no válido");

        } else if (resto < 5){
            System.out.println("Resultado: " + (cociente *10));

        }else if (resto >= 5){
            System.out.println("Resultado: " + ((cociente * 10) + 10));
        }
    }
}