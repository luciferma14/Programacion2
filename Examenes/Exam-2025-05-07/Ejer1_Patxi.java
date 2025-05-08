import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer1_Patxi {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        try {

            int casos;
            String url;
            String palabra;
            String linea;

            FileWriter fw = new FileWriter("enlaces.html", true);

            casos = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < casos; i++){
                url = sc.next();
                palabra = sc.next();
                linea = "<a href='http://" + url + "'>" + palabra + "</a>" + "\n";

                fw.write(linea);                        
            }
            
            fw.close();

        }catch (IOException e) {
            e.getMessage();
        }
    }
}
