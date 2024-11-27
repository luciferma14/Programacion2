import java.util.Scanner;

public class AER_416 {

    static Scanner sc = new Scanner(System.in);

    public static boolean cumple(int casos){

        String[] fechas = new String[casos];
        String fecha;
        String diaMes;
        boolean repetido = false;

        for (int i = 0; i < casos; i++) {

            fecha = sc.next();
            diaMes = fecha.substring(0, 5); 

            for (int j = 0; j < i; j++) {
                if (diaMes.equals(fechas[j].substring(0, 5))) {
                    repetido = true;  
                }
            }
            fechas[i] = fecha;  // Almacena la fecha completa
        }
        return repetido;
    }
    public static void main(String[] args) {

        int casos;
        boolean repetido;

        casos = sc.nextInt();

        do{
            repetido = cumple(casos);

            if (repetido) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            casos = sc.nextInt();

        }while (casos != 0);
    }
}