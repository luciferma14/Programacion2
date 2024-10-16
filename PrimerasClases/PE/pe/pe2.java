import java.util.Scanner;

public class pe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base;
        int expo;
        int poten = 1;

        System.out.print("Dime base: ");
        base = sc.nextInt();

        System.out.print("Dime exponente: ");
        expo = sc.nextInt();

        for (int i = 1; i <= expo; i++){
            poten = poten * base;
        }

        System.out.println(poten);
    }
}
