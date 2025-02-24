
import java.util.Scanner;

public class PruebaVehiculos {

    public static int menu(){
        int opc = 0;
        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda en bicicleta");
        System.out.println("2. Anda en coche");
        System.out.println("3. Ver kilometraje de la bicicleta");
        System.out.println("4. Ver kilometraje del coche");
        System.out.println("5. Ver kilometros totales");
        System.out.println("6. Ver vehículos totales");
        System.out.println("7. Salir");

        return opc;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op;
        int opc = 0;

        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();

        do { 
            
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda en bicicleta");
            System.out.println("2. Anda en coche");
            System.out.println("3. Ver kilometraje de la bicicleta");
            System.out.println("4. Ver kilometraje del coche");
            System.out.println("5. Ver kilometros totales");
            System.out.println("6. Ver vehículos totales");
            System.out.println("7. Salir");

            opc = sc.nextInt();

            //op = menu();

            switch (opc) {
                case 1:
                    System.out.println("Cuantos kilometros anda??");
                    int andaBici = sc.nextInt();
                    bici.anda(andaBici);
                    
                    break;
                case 2:
                    System.out.println("Cuantos kilometros anda??");
                    int andaCoche = sc.nextInt();
                    coche.anda(andaCoche);
                    
                    break;

                case 3:
                    System.out.println(bici.getKilometrosRecorridos());
                    
                    break;
                case 4: 
                    System.out.println(coche.getKilometrosRecorridos());

                    break;
                case 5:
                    System.out.println(Vehiculo.getKilometrosTotales());

                    break;
                case 6: 
                    System.out.println(Vehiculo.getVehiculosCreados());

                    break;
                case 7:
                    System.out.println("Saliendo...");
                    System.out.println("Adioss :)");
                    System.exit(0);
                default:
            }

            //menu();

        } while(opc != 7);
    }
}
