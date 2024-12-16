import java.util.Scanner;

public class ExaPuntualidad2023 {

    public static boolean llegaTarde(String linea){
        
        boolean tarde = false;
        String[] datos = linea.split(" ");
        String turno = datos[1];
        String hora = datos[2];
        int horas = Integer.parseInt(hora.split(":")[0]);
        int mins = Integer.parseInt(hora.split(":")[1]);

        switch (turno) {
            case "M": 
                if((horas > 6) || (horas == 6 && mins != 0)) tarde = true;
            break; 
            case "T":
                if((horas > 14) || (horas == 14 && mins != 0)) tarde = true;
            break; 
            case "N": 
                if((horas > 22) || (horas == 22 && mins != 0)) tarde = true;
            break;
        }
        
        return tarde;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String linea;
        int cont = 0;

        casos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < casos; i++){
            linea = sc.nextLine();
            if (llegaTarde(linea)){
                cont++;
            }
        }
        System.out.println(cont);
    }
}
