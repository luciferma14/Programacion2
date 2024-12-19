import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        // int[] vec = new int[8];
        int[] vec1 = {4,8,2,-5,-2,7,3};
        int[] vec2 = {-5,-2,2,3,4,7,8};

        System.out.println(Arrays.toString(vec1)); // Muestra por pantalla el array
        System.out.println(Arrays.toString(vec2));
        System.out.println(Arrays.equals(vec1, vec2)); // false
        Arrays.sort(vec1); // Ordena el array de menor a mayor
        System.out.println(Arrays.equals(vec1, vec2)); // true




    }
}