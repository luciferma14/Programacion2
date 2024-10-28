import java.util.Scanner;

public class AER_369 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        do { 
            num = sc.nextInt();

            for(int i = 0; i < num; i++){
                System.out.print("1");
            }
            if(num != 0){
                System.out.println();
            }
            
        } while (num != 0);
    }
}