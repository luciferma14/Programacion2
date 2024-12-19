import java.util.Scanner;

public class Ampliado6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nom;
        String[] separa;

        System.out.print("Dime tu nombre completo: ");
        nom = sc.nextLine();

        separa = nom.split(" ",3);
        
        String n = separa[0];
        String ap1 = separa[1];
        String ap2 = separa[2];

        int ln = separa[0].length();
        int lap1 = separa[1].length();
        int lap2 = separa[2].length();

        System.out.printf("%s = %d letras \n%s = %d letras \n%s = %d letras\n", n, ln, ap1, lap1, ap2, lap2);
    }
}
