
import java.util.Scanner;

public class Ejer4 {

    static Scanner sc = new Scanner(System.in);
    public static final String[] COMPOSITORES = {"Bach", "Haydn", "Mozart", "Beethoven", "Brahms", "Mahler", "Bartok"};

    public static String LeerCompositores(){
        String c = null;
      
        try {
            
            c = sc.nextLine();
            
            error(c);
            
        } catch (ElementoNoExistente e) {
            System.out.println(e.toString());

        } catch (Exception e){
            System.out.println("Error indefinido");
        }

        return c;
    }

    private static void error(String c) throws ElementoNoExistente {

        for(int i = 0; i < COMPOSITORES.length; i++){
            if (!COMPOSITORES[i].equals(c)){
                throw new ElementoNoExistente(c + " no está en la lista de compositores");
            }
        }
        
    }
    
}
