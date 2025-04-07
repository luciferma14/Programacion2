
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MeterLineaMedio {
    public static void main(String[] args) {

        String s = "";
        ArrayList<String> lista = new ArrayList<>();

        // Lectura del fichero
        try {
            FileReader fr = new FileReader("Hola2.txt");
            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null){
                lista.add(s);
            }

            fr.close();
            br.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        if(!lista.isEmpty()){
            // Escritura del fichero
            try {
                FileWriter fw = new FileWriter("Hola2.txt", false);

                fw.write(lista.get(0) + "\n");
                fw.write("Lucía\n");
                fw.write(lista.get(1));

                // for(int i = 0; i < lista.size(); i++){
                //     fw.write(lista.get(i) + "\n");         Por si el fichero tiene más líneas
                //     fw.flush();
                // }

                fw.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
