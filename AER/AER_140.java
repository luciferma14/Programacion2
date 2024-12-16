import java.util.Scanner;

public class AER_140 {

    public static String sumaDig(int num){

        String str = String.valueOf(num);
        String solu = "";
        int suma = 0;

        for(int i = 0; i < str.length() -1; i++){
            int x = Integer.parseInt(str.substring(i, i+1));
            suma += x;
            solu = solu + x + " + ";
        }

        suma += Integer.parseInt(str.substring(str.length()-1));
        solu = solu + str.substring(str.length()-1) + " = " + suma;

        return solu;

        // if(num < 10){
        //     return num + "";
        // }else{
        //     int digito = num / 10;
        //     int resto = num % 10;

        //     return sumaDig(resto) + " + " + digito;
        // }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        while(num >= 0){

            String solu = sumaDig(num);

            System.out.println(solu);
            
            num = sc.nextInt();

            // Lo que había intentado yop :(
            // String[] lista = new String[num.length()];

            // for(int i = 0; i < num.length(); i++){

            //     char nume = num.charAt(i);

            //     String numeros = Character.toString(nume);

            //     lista[i] = numeros;
            //     System.out.printf("%s + ", lista[i]);
                
            // }
        }
    }
}