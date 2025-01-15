import java.util.Scanner;

public class Ejer3 {

    public static int minutos(String tiempo){
        String[] hr = tiempo.split(":");

        return (Integer.parseInt(hr[0]) * 60 + Integer.parseInt(hr[1])); // horas + minutos
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int casos;
        int[] canales = new int[11];
        int can;
        String tiempo;
        int dura;
        int canalMasVisto;
        int minsCanalMasVisto;
        int cuotaPantalla;
        int minsTotales = 0;

        casos = sc.nextInt();

        for(int i = 0; i < casos; i++){
            can = sc.nextInt();
            tiempo = sc.next();

            dura = minutos(tiempo);

            canales[can] += dura;
            minsTotales += dura;
        }

        canalMasVisto = 0;
        minsCanalMasVisto = 0;

        for(int i = 1; i <= 10; i++){
            if(canales[i] > minsCanalMasVisto){
                canalMasVisto = i;
                minsCanalMasVisto = canales[i];
            }   
        }

        cuotaPantalla = (minsCanalMasVisto * 100) / minsTotales;

        System.out.println(canalMasVisto + " " + cuotaPantalla);
    }
}