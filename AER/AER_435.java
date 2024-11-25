
import java.util.Scanner;

public class AER_435 {

    public static boolean pijote(String numeros){

        boolean valor = true;

        int [] lista = new int[10];

        // calcula número de veces que aparece cada dígito
        for (int i = 0; i < numeros.length(); i++) {
            switch (numeros.charAt(i)) {
                case '0': lista[0]++; break;
                case '1': lista[1]++; break;
                case '2': lista[2]++; break;
                case '3': lista[3]++; break;
                case '4': lista[4]++; break;
                case '5': lista[5]++; break;
                case '6': lista[6]++; break;
                case '7': lista[7]++; break;
                case '8': lista[8]++; break;
                case '9': lista[9]++; break;
            }
        }

        int veces = lista[0];

        for (int i = 0; i < lista.length; i++) {
            if (veces != lista[i]){
                valor = false;
            }
        }

        return valor;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String numeros = sc.nextLine();
            boolean resul = pijote(numeros);

            if (resul){
                System.out.println("subnormal");
            }else{
                System.out.println("no subnormal");
            }
        }
    }
}
