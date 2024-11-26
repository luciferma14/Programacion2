
import java.util.Scanner;

public class AER_416 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos;
        casos = sc.nextInt();

        do { 
            
            String[] fechas = new String[casos];
            String cumple = " ";
            String[] barra = cumple.split("/");            

            for (int i = 0; i < casos; i++) {
                fechas[i] = sc.next();
                
                cumple = fechas[i];     
                barra = cumple.split("/");

               
                
                
                // System.out.println(casos);
                // System.out.println(Arrays.toString(fechas)); //todos los cumples
                // System.out.println(cumple); //fecha del cumple
                // System.out.print(barra[0] + ", "); //dia
                // System.out.println(barra[1] + ", "); //mes
                // System.out.println(barra[2] + ", "); //año

            }
            System.out.println(barra.length);
            for (int j = 0; j < barra.length; j++) {
                for (int x = 0 ; x < barra.length; x++)
                    if(barra[j] == barra[x]){
                        System.out.println("SI");
                    }else{
                        System.out.println("NO");
                    }
                        
            }
            
            // if ((barra[0].equals(barra[0])) && (barra[1].equals(barra[1]))){
            //     System.out.println("SI");
            // }else{
            //     System.out.println("NO");
            // }
        
            casos = sc.nextInt();

        } while (casos != 0);
        
    }
}
