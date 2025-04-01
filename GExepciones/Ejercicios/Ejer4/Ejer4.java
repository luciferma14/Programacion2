
import java.util.Scanner;

public class Ejer4 {

    static Scanner sc = new Scanner(System.in);
    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};

    public static String LeerCompositores(){
        int esta = -1;
      
        try{
            System.out.print("Nombre de un compositor: ");
            String palabra = sc.next();
        
            for (int i = 0; i < COMPOSITORES.length; i++) {
                if (COMPOSITORES[i].equals(palabra)) {
                    esta = i;
                }
            }
            if (esta == -1) {
                throw new ElementoNoExistente("El compositor no está en la lista");
            } else {
                return "Está en la posición " + esta;
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return "";
    }
}
