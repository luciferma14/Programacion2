import java.util.Scanner;
//import libreriaNum.Numeros;

public class AER_100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int casos100;
        int numero;
        int numDesc;
        int numAsc;
        int itera;
        int cont = 0;
        int num100 = 0;

        casos100 = sc.nextInt();

        do {
            num100  = sc.nextInt();
            numero = num100;

            itera = 0;

            while (num100 != 6174) {
                itera++;

                if (itera >= 8){
                    itera = 8;
                    num100 = 6174;
                }

                numero = num100;

                // numDesc = Numeros.ordenaDigitos(numero);
                // numAsc = Numeros.volteaNum(numDesc);
                
                //num100 = numDesc-numAsc;
            }
            System.out.println(itera);
            cont++;

        } while (cont < casos100);
    }
}
