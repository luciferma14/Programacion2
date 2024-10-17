import java.util.Scanner;

public class pe6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia1;
        int dia2;
        int hora1;
        int hora2;
        int horasTot1;
        int horasTot2;
        int horasTrans;
        String dia1s = "";
        String dia2s = "";

        do{
            System.out.print("Día 1: ");
            dia1 = sc.nextInt();

            if (dia1 < 1 || dia1 > 7){
                System.out.println("El día no es válido");
            }
        }while(dia1 < 1 || dia1 > 7);

        do{
            System.out.print("Hora 1: ");
            hora1 = sc.nextInt();

            if (hora1 < 0 || hora1 > 23){
                System.out.println("La hora no es válida");
            }

        }while(hora1 < 0 || hora1 > 23);

        do{
            System.out.print("Día 2: ");
            dia2 = sc.nextInt();

            if(dia2 < dia1){
                System.out.println("El día no es válido");
            }

            if (dia2 < 1 || dia2 > 7){
                System.out.println("El día no es válido");
            }
        }while(dia2 < 1 || dia2 > 7);

        do{
            System.out.print("Hora 2: ");
            hora2 = sc.nextInt();

            if (hora2 < 0 || hora2 > 23){
                System.out.println("La hora no es válida");
            }

        }while(hora2 < 0 || hora2 > 23);

        switch (dia1) {
            case 1: dia1s = "lunes"; break;
            case 2: dia1s = "martes"; break;
            case 3: dia1s = "miércoles"; break;
            case 4: dia1s = "jueves"; break;
            case 5: dia1s = "viernes"; break;
            case 6: dia1s = "sábado"; break;
            case 7: dia1s = "domingo"; break;
            default: dia1s = "Dia inválido"; break;
            
        }
        switch (dia2) {
            case 1: dia2s = "lunes"; break;
            case 2: dia2s = "martes"; break;
            case 3: dia2s = "miércoles"; break;
            case 4: dia2s = "jueves"; break;
            case 5: dia2s = "viernes"; break;
            case 6: dia2s = "sábado"; break;
            case 7: dia2s = "domingo"; break;
            default: dia2s = "Dia inválido"; break;
        }

        horasTot1 = dia1 * 24 + hora1; // 1 * 24 + 18 = 42
        horasTot2 = dia2 * 24 + hora2; // 2 * 24 = 48 + 20 = 68

        horasTrans = horasTot2 - horasTot1; // 68 - 42 = 26

        System.out.printf("Entres las %d:00h del %s y las %d:00h del %s hay %d horas.\n", hora1, dia1s, hora2, dia2s, horasTrans);
    }
}
