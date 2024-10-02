import java.util.Scanner;

public class algoritmo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cant;
        int num;
        int par = 0;
        int impar = 0;
        int cantPar = 0;
        int cantIm = 0;

        System.out.print("Dime una cantidad de números: ");
        cant = sc.nextInt();

        for(int i = 1; i <= cant; i++){
            System.out.print("Número: ");
            num = sc.nextInt();

            if (num % 2 == 0){
                par++;
                cantPar = par / cant; // crear var para guardar par++
            }else {
                impar++;
                cantIm = impar / cant;

            }
        }

        System.out.printf("Porcentaje de pares: %d \nPorcentaje de impares: %d\n", cantPar, cantIm);
    }
}
