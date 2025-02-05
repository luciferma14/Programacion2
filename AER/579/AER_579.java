
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AER_579 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nParejas;
        int prioridad;
        int tiempo;

        nParejas = sc.nextInt();

        while(nParejas != 0){

            ArrayList<Pareja> lista = new ArrayList<>();

            for(int i = 0; i < nParejas; i++){
                prioridad = sc.nextInt();
                tiempo = sc.nextInt();

                Pareja pare = new Pareja(prioridad, tiempo);

                lista.add(pare);
            }            

            Collections.sort(lista);

            for (Pareja pareja : lista) {
                System.out.println(pareja);
            }
            System.out.println("---");


            nParejas = sc.nextInt();
        }
    }
}