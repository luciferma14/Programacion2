
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        
        // 100 = lineas del codigo; 5 = ejercicios; abajo = cantidad lineas plageadas (xa para ejercicio)
    
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int lineas;
        int ejer;
        int plageadas = 0;
        int plagio;
        int personas = 0;

        lineas = sc.nextInt();
        ejer = sc.nextInt();

        do {
            if(lineas == 0 && ejer == 0){
                salir = true;

            }else{

                int[] array = new int[ejer];
                plagio = 75;

                for (int i = 0; i < array.length; i++){
                    array[i] = sc.nextInt();
                    plageadas = array[i];

                    if((plageadas * 100) / lineas >= plagio){
                        personas++;
                    }
                }

                System.out.println(personas);
                personas = 0;

                lineas = sc.nextInt();
                ejer = sc.nextInt();
            }
        } while (!salir);
    }    
}
