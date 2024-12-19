import java.util.Scanner;

public class Avanzado2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double kg;
        double alt;
        double imc;

        System.out.print("Dime tu peso en kg: ");
        kg = sc.nextDouble();

        System.out.print("Dime tu altura en metros: ");
        alt = sc.nextDouble();

        imc = kg / (alt * alt);

        if (imc < 20){
            System.out.println("Delgado");
        }

        if (imc >= 20 && imc <= 30){
            System.out.println("Normal");
        }

        if (imc > 30){
            System.out.println("Obeso");
        }
    }
}