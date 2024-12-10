
import java.util.Scanner;

public class AER_163{

    public static String sumaHexa(String hexa){

        String[] cifras = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String solucion = "";
        int num;

        for(int i = 0; i < cifras.length; i++){
            //num = Integer.parseInt(hexa);

            if(hexa.equals(cifras[i])){
                solucion = cifras[i + 1];
            }//else if(num > 9){
            //     num++;
            //     solucion = Integer.toString(num);
            // }
        }

        return solucion;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String hexa;

        hexa = sc.nextLine();
        
        while (!hexa.equals("FIN")){

            System.out.println(sumaHexa(hexa));

            hexa = sc.nextLine();
        }
    }
}