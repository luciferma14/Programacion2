public class peExtra1 {
    public static void main(String[] args) {
    
        int dado1 = (int) (Math.random() * 6) +1;
        int dado2 = (int) (Math.random() * 6) +1;
        int dado3 = (int) (Math.random() * 6) +1;
        int total = dado1 + dado2 + dado3;

        System.out.printf("Dado 1: %d \nDado 2: %d \nDado 3: %d \n", dado1, dado2, dado3);
        System.out.println("Suma de los dados: " + total);
    }
}
