import java.util.Scanner;

public class pe5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Dime un número: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for (int j = i; j <= num; j++){
                System.out.println("Par ("+ i + "," + j + ")" + ": " + i + "+" + j + "+" + i + "*" + j + " vale " + (i+j+i*j));
            }
        }
    }
}