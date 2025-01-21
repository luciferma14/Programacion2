import java.util.Scanner;

public class AER_702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dineroInicial = sc.nextInt();
        int movimientos = sc.nextInt();
        sc.nextLine(); // Salto de línea

        int[] saldoMensual = new int[12];
        for (int i = 0; i < saldoMensual.length; i++) {
            saldoMensual[i] = dineroInicial;
        }

        for (int i = 0; i < movimientos; i++) {
            String linea = sc.nextLine();
            String[] partes = linea.split(" ");
            
            String fecha = partes[0];
            int mes = Integer.parseInt(fecha.split("-")[1]); 

            int cantidad = Integer.parseInt(partes[1]);

            for (int j = mes - 1; j < 12; j++) {
                saldoMensual[j] += cantidad;
            }
        }

        for (int i = 0; i < 12; i++) {
            System.out.print(saldoMensual[i]);
            if (i < 11) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}