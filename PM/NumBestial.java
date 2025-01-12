import java.util.Scanner;

public class NumBestial {

    public static boolean esBestial(int num){

        boolean bestial = true;
        String numero = String.valueOf(num);
        
        if(numero.contains("666")){
            bestial = true;
        }else{
            bestial = false;
        }

        return bestial;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        while(num != 0){

            if(esBestial(num)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

            num = sc.nextInt();
        }
    }
}