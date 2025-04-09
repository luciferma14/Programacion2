
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuContra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String linea;
        ArrayList<String> lista = new ArrayList<>();

        try {
            FileReader fr = new FileReader("passwd.txt");
            BufferedReader br = new BufferedReader(fr);

            while((linea = br.readLine()) != null){
                lista.add(linea.split(":")[0]);
            }

            br.close();
            fr.close();
   
        } catch (IOException e) {
            e.getMessage();
        }

        System.out.print("Usuario: ");
        String nombre = sc.nextLine();

        boolean existe = false;

        for (String str : lista) {
            if(str.equals(nombre)){
                existe = true;
            }
        }

        if(existe){
            System.out.println("Ese usuario ya existe");
        }else{

            System.out.print("Contraseña: ");
            String contra = sc.nextLine();

            try {
                FileWriter fw = new FileWriter("passwd.txt", true);

                fw.write(nombre + ":" + contra + "\n");

                fw.close();

            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}