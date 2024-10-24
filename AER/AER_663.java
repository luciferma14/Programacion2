import java.util.Scanner;

public class AER_663 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos;
        int fecha = 0;
    
        casos = sc.nextInt();
        
        for (int i = 1; i <= casos; i++){
            
            fecha = sc.nextInt();

            if(fecha > 0){
                fecha--;
            }

            System.out.println(fecha);
        }
    }
}
