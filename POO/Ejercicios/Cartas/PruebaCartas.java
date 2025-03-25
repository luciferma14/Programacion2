import java.util.ArrayList;

public class PruebaCartas {
    public static void main(String[] args) {

        Carta c = new Carta(1, "Espadas");
        //Baraja b = new Baraja(12);
        
        //b.barajar();

        ArrayList<Carta> j1 = new ArrayList<>();
        ArrayList<Carta> j2 = new ArrayList<>();

        // for(int i = 0; i < 3; i++){
        //     j1.add(b.repartirCarta());
        //     j2.add(b.repartirCarta());
        // }

        System.out.println("-------J1--------");
        for (Carta c1 : j1) {
            System.out.println(c1);
        }

        System.out.println("-------J2--------");
        for (Carta c2 : j2) {
            System.out.println(c2);
        }
        System.out.println("-----------------");

        // for (Carta car : b.getCartas()) {
        //     System.out.println(car);    
        // }
    }
}
