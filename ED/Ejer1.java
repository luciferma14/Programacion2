import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<String>();

        String nom;
        boolean acaba = false;

        do {
            System.out.print("Introduce nombre alumno: ");
            nom = sc.nextLine(); 

            if (nom.equals("FIN")) { // si es FIN acaba el programa 
                acaba = true;
            }else{
                nombres.add(nom); 
            }

        }while (!acaba);    

        for (int i = 0; i < nombres.size(); i++) { // esto nos permite recorrer la lista
            System.out.println(nombres.get(i));

        }

        System.out.println("La lista tiene " + nombres.size()+" alumnos");

        Collections.sort(nombres); // Te ordena en orden alfafético la lista, y si ponemos (nombres.Collections.Reverse......) lo ha borrado antes de que lo copiara
    
        for (String x : nombres) { // vuelve a imprimirlo (foreach)
            System.out.println(x);   
        }
    
    }
           
}
