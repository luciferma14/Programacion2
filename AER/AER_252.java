
import java.util.Scanner;

public class AER_252 {

    public static boolean palindroma(String s){

        boolean polin = true;

        if(s.length() == 0 || s.length() == 1){
            polin = true;
        }else{
            if(s.charAt(0) == s.length() - 1){
                //System.out.println(palindroma(s.substring(1, s.length() - 1)));
                polin = palindroma(s.substring(1, s.length() - 1));

            }else{
                polin = false;
            }
        }

        return polin;
    }
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    while(!s.equals("XXX")){

        s = s.toLowerCase();
        s = s.replaceAll(" ", "");

        System.out.println(s);

        if(palindroma(s)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

        s = sc.nextLine();
    }

   } 
}
