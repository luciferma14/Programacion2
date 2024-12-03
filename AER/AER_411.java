import java.util.Scanner;

public class AER_411 {

    public static int calculaNumEle(int pesoMax, String[] pesos) {
        int numEle = 0;
        int sumaPesos = 0;
        int i = 0;
        boolean sigue = true;
    
        do {
            int pesoEle = Integer.parseInt(pesos[i]);
            if (pesoEle == 0 || sumaPesos + pesoEle > pesoMax) {
                sigue = false;
            } else {
                sumaPesos += pesoEle;
                numEle++;
            }
            i++;
            
        } while (i < pesos.length && sigue);
    
        return numEle;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pesoMax;
    
        do {
            pesoMax= sc.nextInt();
            
            if (pesoMax != 0) {
                sc.nextLine(); //salto de línea

                String[] pesos = sc.nextLine().split(" "); // separados por los espacios
    
                int numEle = calculaNumEle(pesoMax, pesos);

                System.out.println(numEle);
            }
        } while (pesoMax != 0);
    
    } 
}