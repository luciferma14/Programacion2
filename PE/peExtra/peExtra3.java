
import java.util.Scanner;

public class PeExtra3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase;
        String[] esp;
        String fraseMin;
        int contEsp = 0;
        int contA = 0;
        int contE = 0;
        int contY = 0;
        int contO = 0;
        int contU = 0;
        int vocales;
        char my = ' ';
        int mayus = 0;

        System.out.print("Dime una frase: ");
        frase = sc.nextLine();

        System.out.println();
        System.out.println("Frase: " + frase);

        esp = frase.split(" ");

        System.out.println("Caracteres: " + frase.length());
        
        for(int i = 1; i < esp.length; i++){
            contEsp++;
        }
        System.out.println("Espacios que tiene: " + contEsp);

        fraseMin = frase.toLowerCase();

        for(int i = 0; i < fraseMin.length(); i++){
            char voc = frase.charAt(i);

            if (voc == 'a') contA++;
            if (voc == 'e') contE++;
            if (voc == 'i') contY++;
            if (voc == 'o') contO++;
            if (voc == 'u') contU++;
        }
        
        vocales = contA + contE + contY + contO + contU;

        System.out.println("Vocales en total: " + vocales);

        for(int i = 0; i < frase.length(); i++){
            my = frase.charAt(i);
            if (my >= 65 && my <= 90) mayus++;
        }
        System.out.println("Mayúsculas en total: " + mayus);
    }
}
