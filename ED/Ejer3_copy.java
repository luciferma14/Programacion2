import java.util.Scanner;
import java.util.Stack;

public class Ejer3_copy {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Stack<Character> pila = new Stack<>();

        String linea;
        char carac;
        char saca;

        linea = sc.nextLine();

        for(int i = 0; i < linea.length(); i++){
            carac = linea.charAt(i);

            if (carac == '(' || carac == '{' || carac == '['){
                pila.push(carac);

            }else if(carac == ')' || carac == '}' || carac == ']'){
                saca = pila.pop();
                if (carac == ')' && saca == '('){
                    System.out.println("SI");
                }else {
                    System.out.println("NO");
                }
            }
        
        }
    }
}
