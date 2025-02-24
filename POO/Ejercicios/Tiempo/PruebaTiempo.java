
import java.util.ArrayList;
import java.util.Collections;

public class PruebaTiempo {
    public static void main(String[] args) {
        
        Tiempo tiempo1 = new Tiempo(0, 30, 40);
        Tiempo tiempo2 = new Tiempo(0, 35, 20);
        Tiempo tiempo3 = new Tiempo(1, 20, 12);
        Tiempo tiempo4 = new Tiempo(1, 10, 59);

        ArrayList<Tiempo> lista = new ArrayList<>();
        
        lista.add(tiempo1);
        lista.add(tiempo2);
        lista.add(tiempo3);
        lista.add(tiempo4);

        for (Tiempo tiempo : lista) {
            System.out.println(tiempo);
        }

        Collections.sort(lista);

        System.out.println("----------");

        for (Tiempo tiempo : lista) {
            System.out.println(tiempo);
        }
        //System.out.println(tiempo1);

        tiempo1.suma(new Tiempo(0, 35, 20)); // Tiempo tiempo2 = new Tiempo(0, 35, 20);

        //System.out.println(tiempo1);

        tiempo2.resta(new Tiempo(0, 35, 20));

        //System.out.println(tiempo2);
    }
}
