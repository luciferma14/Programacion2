
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> listaNumeros = new LinkedList<Integer>();
        Queue<Integer> colaNumeros = new LinkedList<Integer>();

        int opc;

        for(int i = 1; i <= 90; i++){
            listaNumeros.add(i);
        }

        System.out.println("Números del BINGO");
        System.out.println("Pulsa 1 para el siguiente número");
        System.out.println("Pulsa 0 si ya has terminado");

        for(int i = 0; i < 90; i++){
            int random = (int) (Math.random() * 90);
            int saca = listaNumeros.get(random);
            colaNumeros.add(saca);
        }

        do{
            opc = sc.nextInt();

            if(opc == 1){
                System.out.println(colaNumeros.poll());
            }

        }while (opc != 0);
    }
}