
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int votos = sc.nextInt(); 

        while(votos != 0){
            sc.nextLine();

            HashMap<String, Integer> mapaMayor = new HashMap<>();
            HashMap<String, Integer> mapaMenor = new HashMap<>();
    
            for (int i = 0; i < votos; i++) {

                String falla = sc.next();

                if(falla.charAt(0) > 95){

                    Integer mM = mapaMayor.get(falla);

                    if(mM == null){
                        mapaMayor.put(falla, 1);
                    }else{
                        mapaMayor.put(falla, mM + 1);
                    }
                }else{
                    Integer mm = mapaMenor.get(falla);

                    if(mm == null){
                        mapaMenor.put(falla, 1);
                    }else{
                        mapaMenor.put(falla, mm + 1);
                    }
                }
            }
            String soluMenor = "";
            int mayorm = 0;

            for(Map.Entry<String, Integer> linea : mapaMenor.entrySet()){

                if(mayorm == linea.getValue()){
                    soluMenor = "empate";
                }else{

                    if(mayorm < linea.getValue()){

                        soluMenor = linea.getKey();
                        mayorm = linea.getValue();
                    }
                }
            }

            String soluMayor = "";
            int mayorM = 0;

            for(Map.Entry<String, Integer> linea : mapaMayor.entrySet()){

                if(mayorM == linea.getValue()){
                    soluMayor = "empate";
                }else{

                    if(mayorM < linea.getValue()){

                        soluMayor = linea.getKey();
                        mayorM = linea.getValue();
                    }
                }
            }

            System.out.println(soluMayor + " " + soluMenor);

            votos = sc.nextInt();
        }
    }
}
