
import java.util.ArrayList;

public class Ejer2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>(); 

        int num = (int)(Math.random() * 11) + 10;
        int suma = 0;
        int max;
        int min;
        
        for (int i = 0; i < num; i++) {
            lista.add((int)(Math.random() * 100) + 1);
        }    

        for (Integer x : lista) { // mostrar los números
            System.out.print(x +" ");
        }
        System.out.println();

        min = lista.getFirst();
        max =  lista.getFirst();

        for (Integer x : lista) { // suma, max y min
            suma += x;   
            if (x < min){
                min = x;
            }
            if (x > max){
                max = x;
            }
        }
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + suma / lista.size());
        System.out.println("El máximo es " + max);
        System.out.println("El mínimo es " + min);
    }
}
// hay que hacer estas navidades el ejercicio 4 
// (Math.random() * lista.size()) + 1 
