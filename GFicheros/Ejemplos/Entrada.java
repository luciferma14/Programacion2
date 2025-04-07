import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        int b;

        try {
            //File f = new File("hola");

            FileInputStream fis = new FileInputStream("hola");
            FileOutputStream fis2 = new FileOutputStream("hola2", true);

            while((b = fis.read()) != -1) {
                System.out.println(b);
                fis2.write(b);
            }
            fis.close();
            fis2.close();
        } catch(IOException e) {
            e.printStackTrace();
        }   
    }
}
