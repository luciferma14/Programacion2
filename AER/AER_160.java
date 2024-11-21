import java.util.Scanner;

public class AER_160 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        int sigueB = 0;
        int filaB = 0;
        int columB = 0;
        int sigueA = 0;
        int filaA = 0;
        int columA = 0;

        casos = sc.nextInt();

        do {

            int[][] matriz = new int[casos][casos];

            for(int i = 0; i < casos; i++){
                for (int j = 0; j < casos; j++){

                    matriz[i][j] = sc.nextInt();  
                    System.out.print(matriz[i][j] + " "); 
                }   
                System.out.println();
            }

            
            if(filaB >= casos-1){}else{
                filaB++;
            }                               // 1 0 - 2 0 - 2 1

            if(filaB <= casos-1){}else{
                columB++;
            }

            sigueB = 0;

            for (int i = 0; i < matriz.length; i++){
                if(matriz[filaB][columB] == 0){     // 1 0 - 2 0 - 2 1
                    sigueB++;
                }
            }
        // ---------------------------------------------------------------

            if(columA >= casos-1){}else{
                columA++;
            }                               // 0 1 - 0 2 - 1 2

            if(columA <= casos-1){}else{
                filaA++;
            }

            sigueA = 0;

            for (int i = 0; i < matriz.length; i++){
                if(matriz[filaA][columA] == 0){     // 0 1 - 0 2 - 1 2
                    sigueA++;
                }
            }
            
            System.out.println(filaB);
            System.out.println(columB);     // 1 0 - 2 0 - 2 1
            System.out.println(sigueB);
            System.out.println();
            System.out.println(filaA);
            System.out.println(columA);     // 0 1 - 0 2 - 1 2
            System.out.println(sigueA);
            
            if(sigueB == casos || sigueA == casos){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
            casos = sc.nextInt();

        }while(casos != 0);
    }
}