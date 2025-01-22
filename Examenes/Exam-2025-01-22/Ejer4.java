
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        int anyo;
        int tiempo;
        int tiempoAnyo = 0;

        casos = sc.nextInt();

        do{

            HashMap<Integer, Integer> hash = new HashMap<>();

            for(int i = 0; i < casos; i++){
                anyo = sc.nextInt();
                tiempo = sc.nextInt();

                tiempoAnyo = tiempo + anyo;

                hash.put(anyo, tiempoAnyo);
            }

            for (Map.Entry<Integer,Integer> mapa: hash.entrySet()) { // Recorrer un HashMap con foreach
                
                System.out.println(mapa.getKey() + ": " + mapa.getValue());
            }

            casos = sc.nextInt();

        }while(casos != 0);
    }
}