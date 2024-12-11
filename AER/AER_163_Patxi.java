import java.util.Scanner;

public class AER_163_Patxi{

    public static String sumaHexa(String hexa){

        String solucion = "";
        int i = hexa.length() -1;
        char ult = hexa.charAt(i);

        while(ult == 'F' && i > 0){
            solucion = solucion +"0";
            i--;
            ult = hexa.charAt(i);
        }

        if(ult == 'F'){
            solucion = "10" + solucion;
        }else{
            switch (ult) {
                case '0': solucion = hexa.substring(0,i) + "1" + solucion; break;
                case '1': solucion = hexa.substring(0,i) + "2" + solucion; break;
                case '2': solucion = hexa.substring(0,i) + "3" + solucion; break;
                case '3': solucion = hexa.substring(0,i) + "4" + solucion; break;
                case '4': solucion = hexa.substring(0,i) + "5" + solucion; break;
                case '5': solucion = hexa.substring(0,i) + "6" + solucion; break;
                case '6': solucion = hexa.substring(0,i) + "7" + solucion; break;
                case '7': solucion = hexa.substring(0,i) + "8" + solucion; break;
                case '8': solucion = hexa.substring(0,i) + "9" + solucion; break;
                case '9': solucion = hexa.substring(0,i) + "A" + solucion; break;
                case 'A': solucion = hexa.substring(0,i) + "B" + solucion; break;
                case 'B': solucion = hexa.substring(0,i) + "C" + solucion; break;
                case 'C': solucion = hexa.substring(0,i) + "D" + solucion; break;
                case 'D': solucion = hexa.substring(0,i) + "E" + solucion; break;
                case 'E': solucion = hexa.substring(0,i) + "F" + solucion; break;
            }
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