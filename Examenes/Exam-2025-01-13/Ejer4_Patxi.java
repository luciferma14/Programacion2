import java.util.Scanner;
import java.util.Stack;

public class Ejer4_Patxi {

    public static int calculaParejas(String s){
        Stack<Character> pila = new Stack<>();

        int parejas = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (c){
                case 'G': pila.clear();
                          break;
                case 'H':
                case 'M':
                         if (pila.isEmpty()){
                            pila.push(c);
                         }else{
                            if (pila.peek() != c){
                                pila.pop();
                                parejas++;
                            }else{
                                pila.push(c);
                            }
                         }
                         
            }
            
        }

        return parejas;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        while (sc.hasNext()){

            String cadena = sc.nextLine();

            System.out.println(calculaParejas(cadena));
            
        }
        
    }
}
