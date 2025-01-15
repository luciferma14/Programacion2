import java.util.Scanner;
import java.util.Stack;

public class Ejer4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            
            String linea;
            int parejas = 0;

            linea = sc.nextLine();

            Stack<Character> pila = new Stack<>();

            for(int i = 0; i < linea.length(); i++){
                char cada = linea.charAt(i);

                if(cada == 'G'){
                    pila.clear();
                }else{
                    if(pila.empty()){
                        pila.add(cada);
                    }else{
                        if(pila.peek() == cada){
                            pila.add(cada);
                        }else{
                            pila.pop();
                            parejas++;
                        }
                    }
                }
            }

            System.out.println(parejas);
        }
    }
}

// ----------------------------------------
        // Mi opción

        //while(sc.hasNext()){

        //     String texto;
        //     char cada;
        //     int h = 0;
        //     int m = 0;
        //     int g = 0;
        //     int parejas = 0;

        //     texto = sc.nextLine();

        //     for(int i = 0; i < texto.length(); i++){

        //         cada = texto.charAt(i);

        //         if (cada == 'G'){
        //             g++;
        //             h = 0;
        //             m = 0;
        //         }

        //         if(cada == 'H'){
        //             h++;
        //         }

        //         if(cada == 'M'){
        //             m++;
        //         }
                
        //         while(h > 0 && m > 0){
        //             parejas++;
        //             h--;
        //             m--;
        //         }

        //     }
        //     System.out.println(parejas);
        // }