import java.util.Scanner;

public class Ejer2_Patxi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int carteles = Integer.valueOf(sc.next());

        while(carteles != 0){

            String mejorFora = "";
            int mayorRecom = 0;
            int peorPunteria = 10;

            for(int i = 0; i < carteles; i++){
                String nombre = sc.next();
                int recom = Integer.parseInt(sc.next());
                int punteria = Integer.parseInt(sc.next());

                if(recom > mayorRecom || (recom == mayorRecom && peorPunteria > punteria)){
                    mejorFora = nombre;
                    mayorRecom = recom;
                    peorPunteria = punteria;
                }
            }

            System.out.println(mejorFora);

            carteles = Integer.valueOf(sc.next());
        }
    }
}