
import java.util.Scanner;

public class AER_764 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        int capturados;
        int anilladas;
        int sinAnillo;

        casos = sc.nextInt();

        while (casos != 0){

            sinAnillo = 0;

            for(int i = 0; i < casos; i++){
                capturados = sc.nextInt();
                anilladas = sc.nextInt();

                sinAnillo = sinAnillo + (capturados - anilladas);
            }

            System.out.println(sinAnillo);

            casos = sc.nextInt();
           
        } 
    }   
}