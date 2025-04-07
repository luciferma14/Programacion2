import java.io.File;
import java.util.Scanner;

public class Rmj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(args.length <= 0){
            System.out.println("No hay argumentos");
        }else{
            
            try{  
                File f = new File(args[0]);

                if(!f.exists()){
                    System.out.println("El fichero no existe");
                }else{
                    if(f.isDirectory()){
                        System.out.println("Es un directorio, tiene que ser un fichero");
                        System.exit(0);
                    }else{

                        System.out.print("Seguro que quieres borrar este fichero?? (S / N): ");
                        String opc = sc.next();
        
                        if (opc.toUpperCase().equals("S")){
                            f.delete();

                            System.out.println("Fichero borrado");
                        }else{
                            System.out.println("Saliendo...");
                            System.exit(0);
                        }
                    }
                }
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
