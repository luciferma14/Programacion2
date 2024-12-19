import java.util.Scanner;

public class PeExtra5a {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tam;

        System.out.print("Tamaño del triángulo: ");
        tam = sc.nextInt();

        for(int i = 1; i <= tam; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        }
        System.out.println();
        
        // Lo hace al revés
        // for(int i = 1; i <= tam; i++){
        //     for(int j = i; j < tam; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }
    }
}
