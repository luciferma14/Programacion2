import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Grepj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(args.length <= 0){
            System.out.println("No hay argumentos");
        }else{
            
            try{  
                File texto = new File(args[0]);
                String palab = args[1];
                Integer cont = 1;

                if(!texto.exists()){
                    System.out.println("El fichero no existe");
                }else{

                    String linea;
                    ArrayList<String> lista = new ArrayList<>();

                    try {
                        FileReader fr = new FileReader(texto);
                        BufferedReader br = new BufferedReader(fr);

                        while((linea = br.readLine()) != null){
                            if(linea.contains(palab)){
                                
                                lista.add(cont + ": " + linea);
                            }
                            cont++;
                        }

                        br.close();
                        fr.close();

                    } catch (Exception e) {
                        e.getMessage();
                    }
                    
                    for (String string : lista) {
                        String pColor = "\u001B[32m" + palab + "\u001B[0m"; // texto en color verde

                        System.out.println(string.replace(palab, pColor));
                    }
                }
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}