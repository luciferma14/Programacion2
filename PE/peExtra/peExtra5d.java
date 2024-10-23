import java.util.Scanner;

public class peExtra5d {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tam;
        
        System.out.print("Tamaño del triángulo: ");
        tam = sc.nextInt();

        for(int i = 1; i <= tam; i++){
            System.out.println();
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
        }
        System.out.println();

    }
}
