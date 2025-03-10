
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaVehiculos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Bicicleta> bicis = new ArrayList<>();
        ArrayList<Coche> coches = new ArrayList<>();
        int opc;

        do { 
            
            System.out.println("VEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Añadir bicicleta");
            System.out.println("2. Añadir coche");
            System.out.println("3. Anda en bicicleta");
            System.out.println("4. Anda en coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometros totales");
            System.out.println("8. Ver vehículos totales");
            System.out.println("9. Salir");
            System.out.print("Elige una opción (1-9): ");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Bicicleta bicii = new Bicicleta();
                    bicis.add(bicii);
                    break;
                    
                case 2:
                    Coche cochee = new Coche();
                    coches.add(cochee);
                    break;

                case 3:
                    System.out.println("Cuantos kilometros anda??");
                    int andaBici = sc.nextInt();
                    int bic = (int) (Math.random()* (bicis.size()));
                    bicis.get(bic).anda(andaBici);
                    break;

                case 4:
                    System.out.println("Cuantos kilometros anda??");
                    int andaCoche = sc.nextInt();
                    int coc = (int) (Math.random()* (coches.size()));
                    coches.get(coc).anda(andaCoche); 
                    break;

                case 5:
                    for (Bicicleta bicicleta : bicis) {
                        System.out.println(bicicleta.getKilometrosRecorridos());
                    }
                    break;

                case 6: 
                    for (Coche coche : coches) {
                        System.out.println(coche.getKilometrosRecorridos());
                    }
                    break;

                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;

                case 8: 
                    System.out.println(Vehiculo.getVehiculosCreados());
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    System.out.println("Adioss :)");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida :(");
                    break;
            }

        } while(opc != 9);
    }
}