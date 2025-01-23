import java.util.Scanner;

public class Ejer3_Patxi {


    public static int minutos(String t){

        String[] min = t.split(":");

        return Integer.parseInt(min[0]) * 60 + Integer.parseInt(min[1]);

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int casos = sc.nextInt();
        sc.nextLine();

        int[] cadenas = new int[11];

        for (int index = 0; index < casos; index++) {

            int c = sc.nextInt();
            String h = sc.next();

            int min = minutos(h);

            cadenas[c] += min;

        }

        int mayor = cadenas[0];
        int cadenamayor = 0;

        int total = 0;
        
        for (int i = 1; i <= 10; i++) {
            total += cadenas[i];
            if (cadenas[i] > mayor){
                cadenamayor = i;
                mayor = cadenas[i];
            }
            
        }
        
        
        System.out.println(cadenamayor + " " + ((mayor * 100)/total) );
            
        
    }
}
