import java.util.ArrayList;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> linea = new ArrayList<String>();

        String conte;
        int parente = 0;
        int llave = 0;
        int corche = 0;

        conte = sc.nextLine();

        linea.add(conte);

        if(conte.contains("(")){ 
            parente++;
        }
        if(conte.contains("{")){
            llave++;
        }
        if(conte.contains("[")){
            corche++;
        }

        if(conte.contains(")")){
            parente++;
        }
        if(conte.contains("}")){
            llave++;
        }
        if(conte.contains("]")){
            corche++;
        }
        

        // if(parente % 2 == 0){
        //     System.out.println("SI");
        // }else{
        //     System.out.println("NO");
        // }

        System.out.println(parente);
        System.out.println(llave);
        System.out.println(corche);






    }
}
