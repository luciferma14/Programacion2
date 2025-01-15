import java.util.HashSet;

public class EjemSet {
    public static void main(String[] args) {
        
        HashSet<Integer> hash = new HashSet<>();

        int repetidos = 0;

        for (int i = 0; i < 10; i++) {
            int num = i % 3;  // solo 0, 1 y 2
            if(!hash.add(num)){
                repetidos++;
            }
        }

        System.out.println(repetidos);

//-----------------------------------

        hash.add(10);
        hash.add(300);
        hash.add(8);
        hash.add(10); // No introduce los duplicados --> [8, 10, 300] (se ordena solo??)

        System.out.println(hash.toString());
    }
}
