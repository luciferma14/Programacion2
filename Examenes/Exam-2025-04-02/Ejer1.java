
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre = "";

        while(sc.hasNext()){

            String[] texto = sc.nextLine().split(" ");
            String servi = texto[0];

            for(int i = 1; i < texto.length; i++){
                nombre = texto[i];

                System.out.println("Hola " + nombre + ", bienvenido al servidor " + servi);
            }
        }
    }
}
