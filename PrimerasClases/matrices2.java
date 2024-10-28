public class matrices2 {
    public static void main(String[] args) {

        int filas = 3;
        int colum = 3;
        int valor = 1;
        
        int[][] mat = new int[filas][colum]; 

        for(int i = 0; i < filas; i++){            
            for(int j = 0; j < colum; j++){

                mat[i][j] = valor++;
                
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}