
import java.util.Scanner;

public class AER_163{

    public static String sumaHexa(String hexa){

        String solucion = "";

        return solucion;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String hexa;

        hexa = sc.nextLine();
        
        while (!hexa.equals("FIN")){

            System.out.println(sumaHexa(hexa));

            hexa = sc.nextLine();
        }
    }
}