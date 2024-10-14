
import java.util.Scanner;

public class pe6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia1;
        int dia2;
        int hora1;
        int hora2;
        int horasTotales;
        int horasTotales2;
        int horasTranscurridas;

        System.out.print("Día 1: ");
        dia1 = sc.nextInt();

        System.out.print("Hora 1: ");
        hora1 = sc.nextInt();

        System.out.print("Día 2: ");
        dia2 = sc.nextInt();

        System.out.print("Hora 2: ");
        hora2 = sc.nextInt();

        switch (dia1) {
            case 1: System.out.print("lunes");break;
            case 2: System.out.print("martes");break;
            case 3: System.out.print("miércoles");break;
            case 4: System.out.print("jueves");break;
            case 5: System.out.print("viernes");break;
            case 6: System.out.print("sábado");break;
            case 7: System.out.print("domingo");break;
            default: System.out.print("Día no válido");
        }

        switch (dia2) {
            case 1: System.out.print("lunes");break;
            case 2: System.out.print("martes");break;
            case 3: System.out.print("miércoles");break;
            case 4: System.out.print("jueves");break;
            case 5: System.out.print("viernes");break;
            case 6: System.out.print("sábado");break;
            case 7: System.out.print("domingo");break;
            default: System.out.print("Día no válido");
        }
        
        horasTotales = dia1 * 24 + hora1; // 1 * 24 + 12 = 36
        horasTotales2 = dia2 * 24 + hora2; // 2 * 24 = 48 + 13 = 61

        horasTranscurridas = horasTotales2 - horasTotales;

        System.out.println(horasTranscurridas);


    }
}
