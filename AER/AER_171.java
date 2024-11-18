import java.util.Scanner;

public class AER_171 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int picos;
        int abadias;
        int altMax;
        
        picos = sc.nextInt();

        while (picos != 0){

            int[] cordi = new int[picos];

            for (int i = 0; i < picos; i++){
                cordi[i] = sc.nextInt();

            }

            abadias = 1;

            altMax = cordi[picos-1];

            for (int i = picos-2; i >= 0; i--){
                if (cordi[i] > altMax){
                    abadias++;
                    altMax = cordi[i];
                }
            }

            System.out.println(abadias);

            picos = sc.nextInt();
        }
    }   
}