
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class AER_143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean hayDatos = true;

        while(hayDatos){

            Stack<Integer> pila = new Stack<Integer>();

            int num;
            int vueltas;
            int tortitas;

            num = sc.nextInt();

            while(num != -1){
                pila.push(num);
                num = sc.nextInt();
            }

            vueltas = sc.nextInt();

            if(pila.empty()){
                hayDatos = false;
                
            }else{
                for(int i = 0; i < vueltas; i++){
                    tortitas = sc.nextInt();
                    
                    LinkedList<Integer> lista = new LinkedList<Integer>();
    
                    for(int j = 0; j < tortitas; j++){
                        lista.add(pila.pop());
                    }
                    for(Integer numero : lista){
                        pila.push(numero);
                    }
                }
                System.out.println(pila.peek());
            }
        }
    }
}