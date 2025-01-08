public class matrices {
    public static void main(String[] args) {
        
        //int[][] mat1 = {{1,2,3},{4,5}};

        int filas = 5;
        int colum = 7;
        boolean[][] mat2 = new boolean[filas][colum];
        mat2[2][4] = true;

        for(int i = 0; i < filas; i++){
            for (int j = 0; j < colum; j++) {
                System.out.print(mat2[i][j] +  " ");        
            }
            System.out.println();
        }


    }
}
