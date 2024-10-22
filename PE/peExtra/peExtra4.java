import java.util.Scanner;

public class peExtra4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase;
        String fraseMin;
        String repFrase = "";

        System.out.print("Dime una frase: ");
        frase = sc.nextLine();

        fraseMin = frase.toLowerCase();
    
        repFrase = fraseMin.replace('a', '1').replace('e', '2').replace('i', '3').replace('o', '4').replace('u', '5');
        
        System.out.println(repFrase);
    }   
}