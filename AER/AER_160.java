import java.util.Scanner;

public class AER_160 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        boolean arriba;
        boolean bajo;

        casos = sc.nextInt();

        do {

            int matriz[][] = new int[casos][casos];

            arriba = true;
            bajo = true;

            for(int i = 0; i < casos; i++){
                for (int j = 0; j < casos; j++){

                    matriz[i][j] = sc.nextInt();  

                    //System.out.print(matriz[i][j] + " "); 

                    if ( i != j && i < j && matriz[i][j] != 0) {
                        arriba = false;
                    } else if ( i != j && i > j && matriz[i][j] != 0) {
                        bajo = false;
                    }

                }   
                //System.out.println();
            }
            
            if(arriba || bajo){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
            casos = sc.nextInt();

        }while(casos != 0);
    }
}