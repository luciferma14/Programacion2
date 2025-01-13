
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){

            String texto;
            char cada;
            int h = 0;
            int m = 0;
            int g = 0;
            int parejas = 0;

            texto = sc.nextLine();

            for(int i = 0; i < texto.length(); i++){

                cada = texto.charAt(i);

                if (cada == 'G'){
                    g++;
                    h = 0;
                    m = 0;
                }

                if(cada == 'H'){
                    h++;
                }

                if(cada == 'M'){
                    m++;
                }
                
                while(h > 0 && m > 0){
                    parejas++;
                    h--;
                    m--;
                }

            }
            System.out.println(parejas);
        }
    }
}