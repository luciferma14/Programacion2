
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        try {

            int casos;
            String linea;
            String[] inf;
            String web;
            String text;

            FileWriter fw = new FileWriter("enlaces.html", true);

            casos = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < casos; i++){
                linea = sc.nextLine();
                
                while(!linea.isEmpty()){

                    inf = linea.split(" ");
                    web = inf[0];
                    text = inf[1];

                    fw.write("<a href='http://" + web + "'>" + text + "</a>" + "\n");

                    fw.flush();
        
                    linea = sc.nextLine();
                }
                fw.close();
            }
        }catch (IOException e) {
            e.getMessage();
        }
    }
}
