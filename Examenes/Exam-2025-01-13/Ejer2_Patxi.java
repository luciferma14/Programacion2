import java.util.Scanner;

public class Ejer2_Patxi {


    public static boolean esBisiesto(int a){

        if (a > 1582){
            if (a % 400 == 0) return true;
            if (a % 100 == 0) return false;
            if (a % 4 == 0) return true;
            return false;
        }else{
            return a % 4 == 0;
        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int casos = sc.nextInt();
        sc.nextLine();

        for (int index = 0; index < casos; index++) {

            int nac = Integer.parseInt(sc.next().split("/")[2]);
            int fall = Integer.parseInt(sc.next().split("/")[2]);

            int suma = 0;

            //System.out.println(nac + " - " + fall);

            for (int i = nac; i <= fall; i++) {
                if (esBisiesto(i)) suma++;
            }

            System.out.println(suma);
            
        }
        
    }
}
