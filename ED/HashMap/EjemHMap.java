import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EjemHMap {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hm = new HashMap<Integer, String>(); 

        hm.put(3, "Hola");
        hm.put(2, "Adios");
        hm.put(8, "Bienvenidos");
        hm.put(1, "Salida");

        for (Map.Entry<Integer, String> mapa: hm.entrySet()) { // Recorrer un HashMap con foreach
            
            //System.out.println(mapa.getKey() + " - " + mapa.getValue());
            if(mapa.getValue().equals("Adios")){
                
                hm.put(mapa.getKey(), "Entrada");
            }
        }

        System.out.println(hm.toString());

//-------------------------------------------------------------------------------
        
        HashMap<String, ArrayList<Integer>> vecinos = new HashMap<>();
        ArrayList<Integer> puertas1 = new ArrayList<>();

        puertas1.add(1);
        puertas1.add(2);
        puertas1.add(3);
        puertas1.add(4);

        vecinos.put("primero", puertas1);

        ArrayList<Integer> puertas2 = new ArrayList<>();

        puertas2.add(5);
        puertas2.add(6);
        puertas2.add(7);

        vecinos.put("segundo", puertas2);

        ArrayList<Integer> puertas3 = new ArrayList<>();

        puertas3.add(8);
        puertas3.add(9);
        puertas3.add(10);
        puertas3.add(11);
        puertas3.add(12);
        puertas3.add(13);
        puertas3.add(14);

        vecinos.put("tercero", puertas3);

        ArrayList<Integer> puertas4 = new ArrayList<>();

        puertas4.add(15);

        vecinos.put("cuarto", puertas4);

        //System.out.println(vecinos.toString());

        for (Map.Entry<String, ArrayList<Integer>> mapa: vecinos.entrySet()) { // Recorrer un HashMap con foreach
            
            System.out.println(mapa.getKey() + ": " + mapa.getValue());
        }
    }
}
