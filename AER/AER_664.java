import java.util.Scanner;

public class AER_664 {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
        
        int puentes;
        int carriles;
        int cm;
        int mayor;
        int peque;
       
        
        do { 
            puentes = sc.nextInt();

            //peque = new int[puentes];
            peque = 1000;
            for(int i = 0; i < puentes; i++){
                carriles = sc.nextInt();

                mayor = 0;
                for (int j = 1; j < carriles; j++){
                    cm = sc.nextInt();

                    if(cm > mayor){
                        mayor = cm;
                    }
                }
                //peque[i] = mayor;
                if(mayor < peque){
                    peque = mayor;
                }
            }

        } while (puentes != 0);
    }
}