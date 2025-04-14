import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CifradoCesar1 {

    public static String cifrar(String str, Integer num){

        String textoCifrado = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                int letra = ((str.charAt(i) - 65 + num) % 26) + 65;
                textoCifrado += (char)letra;
            }else{
                textoCifrado += str.charAt(i);
            }
        }
        
        return textoCifrado;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(args.length <= 1){
            System.out.println("No hay argumentos suficientes");
        }else{
            
            String fichero = args[0];
            String num = args[1];
            Integer nume = Integer.valueOf(num);
            String linea;
            String lineasCrifrada = "";

            try {
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                while((linea = br.readLine()) != null){
                    lineasCrifrada += cifrar(linea, nume) + "\n";
                }

                br.close();
                fr.close();

                String nombre = fichero.split("\\.")[0];
                nombre += ".cf" + nume; 

                FileWriter fw = new FileWriter(nombre);
                fw.write(lineasCrifrada);

                fw.close();

            } catch (IOException e) {
                System.out.println("ERROR de lectura del fichero");
                e.getMessage();
            }catch (NumberFormatException e){
                System.out.println("ERROR segundo argumento no es un número");
                e.getMessage();
            }catch (Exception e){
                System.out.println("ERROR genérico");
                e.getMessage();
            }            
        }
    }
}
