import java.util.Scanner;

public class Avanzado4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int insectos;
        int aracnidos;
        int crustaceos;
        int miriapodos;
        int segmentos;
        int total;

        System.out.print("Insectos: ");
        insectos = sc.nextInt();

        System.out.print("Arácnidos: ");
        aracnidos = sc.nextInt();

        System.out.print("Crustáceos: ");
        crustaceos = sc.nextInt();

        System.out.print("Cienpiés: ");
        miriapodos = sc.nextInt();

        System.out.print("Segmentos cienpiés: ");
        segmentos = sc.nextInt();

        total = (insectos * 6) + (aracnidos * 8) + (crustaceos * 10) + ((segmentos * 2) * miriapodos);

        System.out.print("Total de patas: " + total);
    }
}