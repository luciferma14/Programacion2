
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ff {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){

            String cadena = sc.nextLine();

            HashMap<Character, Integer> mapa = new HashMap<>();

            for (int i = 0; i < cadena.length(); i++) {
                
                Integer mM = mapa.get(cadena.charAt(i));

                if(mM == null){
                    mapa.put(cadena.charAt(i), 1);
                }else{
                    mapa.put(cadena.charAt(i), mM + 1);
                }
                
            }

            int mayor = 0;

            for(Map.Entry<Character, Integer> linea : mapa.entrySet()){

                if(mayor < linea.getValue()){                
                    mayor = linea.getValue();
                }
            }

            if((cadena.length() +1) /2 +1 > mayor){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}
