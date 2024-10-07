
import java.util.Scanner;

public class ejemPE {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String res;
        int nota;
        int hora;

        System.out.print("Responde S/N: ");
        res = sc.next();

        switch (res) {
            case "s":
                System.out.println("AFIRMATIVO");
            break;
            case "n":
                System.out.println("NEGATIVO");
            break;
            default: 
                System.out.println("OPCIÓN INCORRECTA");
        }

        System.out.print("Introduce nota: ");
        nota = sc.nextInt();

        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
            break;
            case 5:
                System.out.println("Aprobado");
            break;
            case 6:
                System.out.println("Bien");
            break;
            case 7:
            case 8:
            System.out.println("Notable");
            break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
            break;
            default: 
                System.out.println("OPCIÓN INCORRECTA");
        }

        System.out.print("Introduce hora: ");
        hora = sc.nextInt();

        switch (hora) {
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("De madrugada");
            break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Buenos díass");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.println("Buenas tardess");
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            System.out.println("Buenas nochess");
            break;

            default: 
                System.out.println("OPCIÓN INCORRECTA");
        }
    }
}
