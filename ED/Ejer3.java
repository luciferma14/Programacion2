import java.util.Scanner;
import java.util.Stack;

public class Ejer3 {

    public static boolean cierra(String linea){
        
        Stack<Character> sesentaicuatro = new Stack<Character>();
        boolean cerrado = true;
        char carac;
        char saca;

        for(int i = 0; i < linea.length() && cerrado; i++){
            carac = linea.charAt(i);

            if (carac == '(' || carac == '{' || carac == '['){
                sesentaicuatro.push(carac);

            }else{
                if(carac == ')' || carac == '}' || carac == ']'){
                    if(sesentaicuatro.empty()){
                        cerrado = false;
                    }else{
                        saca = sesentaicuatro.pop();
                        if (carac == '(' && saca != ')'){
                            cerrado = false;
                        }
                        if (carac == '{' && saca != '}'){
                            cerrado = false;
                        }
                        if (carac == '[' && saca != ']'){
                            cerrado = false;
                        }
                    }
                } 
            }
        }
        return cerrado;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        if(cierra(sc.nextLine())){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}
