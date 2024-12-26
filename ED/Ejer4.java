
import java.util.LinkedList;
import java.util.Queue;

public class Ejer4 {
    public static void main(String[] args) {
        
        LinkedList<Integer> listaNumeros = new LinkedList<Integer>();
        Queue<Integer> colaNumeros = new LinkedList<Integer>();

        for(int i = 1; i <= 90; i++){
            listaNumeros.add(i);
        }

        for(int i = 0; i < 90; i++){
            int random = (int) (Math.random() * 90);
            int saca = listaNumeros.get(random);
            colaNumeros.add(saca);
            System.out.println(colaNumeros.poll());
        }
    }
}
