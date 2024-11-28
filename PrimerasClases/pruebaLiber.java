import java.util.Arrays;
import liber.Vector;

public class pruebaLiber{
    public static void main(String[] args) {
        
        int[] v = Vector.rellenaVectorInt(8);

        System.out.println(Arrays.toString(v));

        System.out.println("El valor buscado es: " + Vector.busca(v, 5));

        System.out.println("La suma de los elementos del vector es: " + Vector.suma(v));

        System.out.println("El valor máximo es: " + Vector.maximo(v));
        
        System.out.println("El valor mínimo es: " + Vector.minimo(v));
        

        int[] v2 = Vector.reverse(v);

        System.out.println(Arrays.toString(v2));


        int[] v3 = Vector.reverse2(v);

        System.out.println(Arrays.toString(v3));


        Vector.ordena(v);

        System.out.println(Arrays.toString(v));


        String[] s = {"casa", "libro", "ciudad"};

        System.out.println(Vector.busca(s, 1));

        System.out.println(Vector.primero(s));

        System.out.println(Vector.ultimo(s));
    }
}