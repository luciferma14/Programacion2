
import java.io.File;
import java.util.Scanner;

public class ListarDir {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del directorio: ");
        String nombre = sc.next();

        try{
            File f = new File(nombre);

            if(f.isDirectory()){
                String[] lista = f.list();

                System.out.println("Listado del directorio");
                for (String str : lista) {
                    System.out.println(str);
                }

            }else{
                f.mkdir();
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
