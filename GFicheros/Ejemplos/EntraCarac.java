
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EntraCarac {
    public static void main(String[] args) {
        try {
            
            FileReader fr = new FileReader("Hola.txt");
            BufferedReader br = new BufferedReader(fr);

            String s;

            while((s = br.readLine()) != null){
                System.out.println(s);
            }

            br.close();
            fr.close();
// -------------------------------------------------------------

            FileWriter fw = new FileWriter("Hola.txt", true);

            String out = "Hola otra vez\n";
            fw.write(out);
            fw.flush(); // "Guardar"
            out = "Adios";
            fw.write(out);

            fw.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
