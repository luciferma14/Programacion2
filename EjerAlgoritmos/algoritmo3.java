public class Algoritmo3 {
    public static void main(String[] args) {
        
        // 0 + 1 = 1 + 2 = 3 + 3 = 6 + 4 = ... +100

        int num = 0;
        int suma = 0;

        while(suma <= 100){
            num++;
            suma = suma + num;
        }

        System.out.println(suma);
    }
}
