import java.util.ArrayList;
import java.util.Scanner;

public class AER_144 {

    // falta terminarlo :(
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String texto;
        int tres = 0;
        char cada;

        texto = sc.nextLine();

        if(texto.contains("-") || texto.contains("+") || texto.contains("*") || texto.contains("3")){
            // - inicio, + final, * flecha derecha, 3 suprimir
            ArrayList<Character> cadena = new ArrayList<Character>();
            ArrayList<Character> cadena2 = new ArrayList<Character>();
            
            
            for(int i = 0; i < texto.length(); i++){
                cada = texto.charAt(i);
                // cuenta los treses que hay
                if(cada == '3'){
                    tres++;
                }
            }
            for(int i = 0; i < texto.length(); i++){
                cada = texto.charAt(i);
                cadena.add(cada);
                if(cada == '-'){
                    for(int j = 0; j < tres; j++){
                        cadena.removeFirst();
                    }
                }
            }

            
            System.out.println(cadena);

        }else{
            System.out.println(texto);
        }
    }
}
