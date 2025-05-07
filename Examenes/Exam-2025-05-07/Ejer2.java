
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejer2 {
    public static void main(String[] args) {

        String linea;
        String[] inf;
        String primer;
        int comen = 0;
        int from = 0;
        int run = 0;
        int workdir = 0;
        int copy = 0;
        int user = 0;
        int expose = 0;
        int cmd = 0;

        if(args.length <= 0){
            System.out.println("No hay argumentos");
        }else{
            
            try{  
                File arch = new File(args[0]);

                if(!arch.exists()){
                    System.out.println("El fichero no existe");
                }else{

                    try {
                        FileReader fr = new FileReader(arch);
                        BufferedReader br = new BufferedReader(fr);

                        while((linea = br.readLine()) != null){
                            inf = linea.split(" ");
                            primer = inf[0];
                            
                            if(primer.equals("#")){
                                comen++;
                            }
                            if(primer.equals("FROM")){
                                from++;
                            }
                            if(primer.equals("RUN")){
                                run++;
                            }
                            if(primer.equals("WORKDIR")){
                                workdir++;
                            }
                            if(primer.equals("COPY")){
                                copy++;
                            }
                            if(primer.equals("USER")){
                                user++;
                            }
                            if(primer.equals("EXPOSE")){
                                expose++;
                            }
                            if(primer.equals("CMD")){
                                cmd++;
                            }
                        }

                        br.close();
                        fr.close();

                    } catch (Exception e) {
                        e.getMessage();
                    }

                    System.out.println("Comentarios " + comen);
                    System.out.println("FROM " + from);
                    System.out.println("RUN " + run);
                    System.out.println("WORKDIR " + workdir);
                    System.out.println("COPY " + copy);
                    System.out.println("USER " + user);
                    System.out.println("EXPOSE " + expose);
                    System.out.println("CMD " + cmd);
                }
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
