import java.util.Scanner;
//import libreriaNum.*;

public class AER_210 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos;
        String palabra;
        int suma;
        char letra;

        casos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < casos; i++){
            palabra = sc.nextLine();
            suma = 0;
            for(int j = 0; j < palabra.length(); j++){
                letra = palabra.charAt(j);
                suma += letra; // suma el valor de la tabla ASCII del carácter a "suma"
            }
            //System.out.println(Numeros.anteriorPrimo(suma));
        }
    }
}
