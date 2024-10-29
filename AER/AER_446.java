import java.util.Scanner;

public class AER_446 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nPers;
        String nomReal;
        String nombres;
        String ultimo;
        int num;

        nPers = sc.nextInt();

        for(int i = 0; i < nPers; i++){
            nomReal = sc.next();
            num = sc.nextInt();
            nombres = sc.nextLine();

            String[] listaNombres = nombres.split(" ");
                      
            ultimo = listaNombres[listaNombres.length - 1];
            //System.out.println(nomReal);
            //System.out.println(num);
            //System.out.println(nombres);
            //System.out.println(ultimo);

            if (nomReal.equals(ultimo) && num > 1){
                System.out.println("VERDADERA");
            }else{
                System.out.println("FALSA");
            }
        }
    }
}