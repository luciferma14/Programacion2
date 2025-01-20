import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AER_109 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> equipos = new HashMap<>();

        String cate;
        String partido;
        String equipo1;
        String equipo2;
        int sets1;
        int sets2;
        int partidosJugados;
        int puntos1;
        int puntos2;
        int valor1;
        int valor2;
        String equipo;
        Integer puntua;
        String ganador;
        Integer puntosMayor;
        int faltantes;

        cate = sc.nextLine();

        while(!cate.equals("FIN")){

            partido = sc.nextLine();

            partidosJugados = 0;

            HashMap<String, Integer> clasi = new HashMap<>();

            while(!partido.equals("FIN")){

                partidosJugados++;
                String[] datos = partido.split(" ");
                equipo1 = datos[0];
                equipo2 = datos[2];
                sets1 = Integer.parseInt(datos[1]);
                sets2 = Integer.parseInt(datos[3]);

                puntos1 = 0;
                puntos2 = 0;

                if(sets1 > sets2){
                    puntos1 = 2;
                    puntos2 = 1;
                }else{
                    puntos1 = 1;
                    puntos2 = 2;
                }

                // Equipos anotados en clasi???
                if(clasi.containsKey(equipo1)){
                    valor1 =  clasi.get(equipo1);
                    clasi.put(equipo1, valor1 + puntos1);

                }else{
                    clasi.put(equipo1, puntos1);
                }

                if(clasi.containsKey(equipo2)){
                    valor2 =  clasi.get(equipo2);
                    clasi.put(equipo2, valor2 + puntos2);
                }else{
                    clasi.put(equipo2, puntos2);
                }

                partido = sc.nextLine();
            }

            //System.out.println(clasi.toString());

            ganador = "";
            puntosMayor = 0;

            for (Map.Entry<String, Integer> mapa : clasi.entrySet()) {
                equipo = mapa.getKey();
                puntua = mapa.getValue();

                if(puntua == puntosMayor){
                    ganador = "EMPATE";
                }

                if(puntua > puntosMayor){
                    ganador = equipo;
                    puntosMayor = puntua;
                }
            }
            //faltantes = (clasi.size() / 2) * clasi.size() - 1 * 2;
            faltantes = (clasi.size() - 1) * clasi.size() - partidosJugados;

            System.out.println(ganador + " " + faltantes);
            cate = sc.nextLine();
        }
    }
}