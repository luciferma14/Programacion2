import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numFora;
        int dinero;
        int suma;

        numFora = sc.nextInt();

        while(numFora != 0){

            suma = 0;

            for(int i = 0; i < numFora; i++){
                dinero = sc.nextInt();
                suma += dinero;

            }
            System.out.println(suma);

            numFora = sc.nextInt();
        }
    }
}