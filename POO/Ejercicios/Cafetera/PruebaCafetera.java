import java.util.Scanner;

public class PruebaCafetera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cafetera cafe1 = new Cafetera();
        Cafetera cafe2 = new Cafetera(500);
        Cafetera cafe3 = new Cafetera(2000, 1000);

        cafe1.llenarCafetera();
        cafe2.servirTaza(450);
        System.out.println(cafe2.getCantidadActual());

        cafe3.setCapacidadMaxima(4000);
        cafe3.agregarCafe(2800);
        cafe3.vaciarCafetera();
        System.out.println(cafe3.getCantidadActual());

    }
}
