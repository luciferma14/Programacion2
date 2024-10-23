import java.util.Scanner;

public class AER_117 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        String pers = "";

        num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            pers = sc.nextLine();
            String nom = pers.substring(4);
            System.out.println("Hola, " + nom + ".");
        }
    }
}
