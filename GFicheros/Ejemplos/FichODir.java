import java.io.File;
import java.util.Scanner;

public class FichODir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(args.length <= 0){
            System.out.println("No hay argumentos");
        }else{
            
            try{  
                File f = new File(args[0]);

                if(!f.exists()){
                    System.out.println("No existe");
                }else{
                    if(f.isDirectory()){
                        System.out.println("Es un directorio");
                    }else{
                        System.out.println("Es un fichero");
                    }
                    System.out.println("Ruta: " + f.getAbsolutePath());
                    System.out.println("Tamaño: " + f.length());
                    System.out.println("Permisos: ");
                    if(f.canExecute()){
                        System.out.println("Tiene permiso de ejecución");
                    }else{
                        System.out.println("No tiene permiso de ejecución");
                    }
                    if(f.canWrite()){
                        System.out.println("Tiene permiso de escritura");
                    }else{
                        System.out.println("No tiene permiso de escritura");
                    }
                    if(f.canRead()){
                        System.out.println("Tiene permiso de lectura");
                    }else{
                        System.out.println("No tiene permiso de lectura");
                    }
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}

