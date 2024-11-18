import java.util.Scanner;

public class AER_337 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos;
        int valor;
        boolean igual;

        casos = sc.nextInt();

        for (int i = 0; i < casos; i++){
            
            int[] supe = new int[6];
            int[] infe = new int[6];

            for (int j = 0; j < supe.length; j++){
                supe[j] = sc.nextInt();
            }
            for (int j = 0; j < infe.length; j++){
                infe[j] = sc.nextInt();
            }

            valor = supe[0] + infe[0];

            igual = true;

            for (int j = 1; j < infe.length; j++){
                if (supe[j] + infe[j] != valor){
                    igual = false;
                }
            }

            if (igual){
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
    }
}