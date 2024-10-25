import java.util.Arrays;
import java.util.Scanner;

public class peExtra5d {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numNiveles;
        int numPosiciones;
        int posInicial;
        int posFinal;
        int cont;
        String resul;

        System.out.print("Niveles de la pirámide: ");
        numNiveles = sc.nextInt(); // suponemos que es 4 (como ejemplo pdf ejercicios clase)
        
        numPosiciones = numNiveles * 2 -1; // 4 * 2 = 8 - 1 = 7 --> 1-2-3-4-3-2-1 = 7 números
        posInicial = numNiveles;
        posFinal = numNiveles;
        
        
        for (int i = 0; i < numNiveles; i++) { // números de líneas --> 4 líneas
            cont = 1;               
            resul = "";
            
            for (int j = 0; j <= numPosiciones; j++) { // recorre las posiciones de "resultado"
                if ((j < posInicial) || (j > posFinal)) {
                    resul += " "; // resultado = resultado + " "
                } else {
                    if (j < numNiveles) {
                        resul += cont; // resultado = resultado + contador
                        cont++;
                    } else {
                        resul += cont;
                        cont--;
                    }
                }    
            }
            System.out.println(resul);
            posFinal++;
            posInicial--;
        }
    }
}