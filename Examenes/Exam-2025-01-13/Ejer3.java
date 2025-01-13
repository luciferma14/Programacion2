
import java.util.Scanner;

public class Ejer3 {

    public static int minutos(String tiempo){
        String[] hr = tiempo.split(":");

        return  Integer.parseInt(hr[0]) * 60 + Integer.parseInt(hr[1]); // horas + minutos
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int casos;
        int[] canales = new int[11];
        int can;
        String tiempo;
        int dura;
        int total = 0;

        casos = sc.nextInt();

        for(int i = 0; i < casos; i++){
            can = sc.nextInt();
            tiempo = sc.nextLine();

            dura = minutos(tiempo);
            total += dura;

        }
    }
}
