import java.util.ArrayList;
import java.util.Collections;

public class ejemploPdf {
    public static void main(String[] args) {

        ArrayList<String> diasSemana = new ArrayList<String>();
        //String lunes = "Lunes";

        //diasSemana.add(lunes);
        diasSemana.add("lunes");
        diasSemana.add("martes");
        diasSemana.add("miercoles");
        diasSemana.add("jueves");
        diasSemana.add("viernes");
        diasSemana.add("sabado");
        diasSemana.add("domingo");

        //System.out.println(diasSemana.get(5));

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        //int num = 14;

        //numeros.add(num);

        for(int i = 1; i <= 10; i++){
            numeros.add(i);
        }

        for(int i = 1; i <= 10; i++){
            int random = (int) (Math.random() * 10); // Para meterlos desordenados
            System.out.println(random);
        }

        // for(int i = 0; i < numeros.size(); i++){
        //     System.out.println(numeros.get(i));
        // }

        Collections.sort(diasSemana); // Ordena por orden alfabético

        for (String s : diasSemana){
            System.out.println(s);
        }

        Collections.sort(numeros);

        for (Integer i : numeros){
            System.out.println(i);
        }
    }
}