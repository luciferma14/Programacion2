
import java.util.Scanner;

public class avanzado5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //huevos
        int caben;
        int quiero;
        int ollas;
        int tiempo;

        System.out.print("Huevos que caben: ");
        caben = sc.nextInt();

        System.out.print("Huevos que quiero cocer: ");
        quiero = sc.nextInt();

        ollas = quiero / caben;

        if (quiero % caben > 0){
            tiempo = (ollas + 1) * 10;
        }else{
            tiempo = 10;
        }
        System.out.println("Tardarán en cocerse " + tiempo + " minutos");
    }
}