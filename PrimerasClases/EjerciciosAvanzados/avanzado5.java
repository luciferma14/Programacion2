
import java.util.Scanner;

public class avanzado5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //huevos
        int caben;
        int quiero;
        int tiempo = 10;

        // si caben 8, y quiero 8, tarda 10
        // si caben 8, y quiero 10, tarda 20
        // quiero si num huevos cocer > caben --> +10 se pasa limite caben

        System.out.print("Huevos que caben: ");
        caben = sc.nextInt();

        System.out.print("Huevos que quiero cocer: ");
        quiero = sc.nextInt();

        if(quiero <= caben){
            System.out.println("Tardarán en cocerse " + tiempo + "mins");

        }else if (quiero > caben && quiero > caben + caben){
            for (int i = 0; quiero > caben; i++){
                int tiem = tiempo +10;
                System.out.println(tiem);
            }
        }
    }
}
