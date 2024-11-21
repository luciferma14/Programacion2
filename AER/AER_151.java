import java.util.Scanner;

public class AER_151 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        boolean sigue;
        int valor;

        casos = sc.nextInt();

        do {

            int[][] matriz = new int[casos][casos];

            for(int i = 0; i < casos; i++){
                for (int j = 0; j < casos; j++){

                    matriz[i][j] = sc.nextInt();   
                }   
            }

            sigue = false;
            valor = 0;
            
            valor++;
                
            if(matriz[valor][valor] == 1){
                sigue = true;
            }

            if(sigue){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

            casos = sc.nextInt();

        }while(casos != 0);
    }
}