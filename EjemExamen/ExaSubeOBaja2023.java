import java.util.Scanner;

public class ExaSubeOBaja2023 {

    public static boolean subeBaja(int piso1, int piso2){

        return piso2 > piso1;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int piso_anterior = 0;

        while(sc.hasNext()){

            int piso_nuevo = sc.nextInt();

            boolean resul = subeBaja(piso_anterior, piso_nuevo);

            if(resul){
                System.out.println("Subiendo " + (piso_nuevo - piso_anterior));
            }else{
                System.out.println("Bajando " + (piso_anterior - piso_nuevo));
            }

            piso_anterior = piso_nuevo;
        }
    }
}
