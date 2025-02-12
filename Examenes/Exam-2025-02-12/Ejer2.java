
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int primer;
        int segundo;
        String pokemon;
        ArrayList<String> pila1 = new ArrayList<>();
        ArrayList<String> pila2 = new ArrayList<>();


        primer = Integer.parseInt(sc.next());
        segundo = Integer.parseInt(sc.next());

        while(primer != 0 && segundo != 0){

            for(int i = 0; i < primer; i++){
                pokemon = sc.next();
                pila1.add(pokemon);

            }
            for(int i = 0; i < segundo; i++){
                pokemon = sc.next();
                pila2.add(pokemon);

            }
            System.out.println(pila2.toString());

            primer = Integer.parseInt(sc.next());
            segundo = Integer.parseInt(sc.next());

        }
    }
}
