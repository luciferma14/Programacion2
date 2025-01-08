import java.util.Scanner;

public class algoritmo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cant;
        int num;
        int par = 0;
        int impar = 0;
        double cantPar = 0;
        double cantIm = 0;

        System.out.print("Dime una cantidad de números: ");
        cant = sc.nextInt();

        for(int i = 1; i <= cant; i++){
            System.out.print("Número: ");
            num = sc.nextInt();

            if (num % 2 == 0){
                par++;
                cantPar = ((double)par / cant) * 100; 
            }else {
                impar++;
                cantIm = ((double)impar / cant) * 100;
            }
        }

        System.out.printf("Porcentaje de pares: %.2f \nPorcentaje de impares: %.2f\n", cantPar, cantIm);
    }
}
