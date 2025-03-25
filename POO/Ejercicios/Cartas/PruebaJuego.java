import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebaJuego {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        List<List<Carta>> manos = baraja.repartirCartas(3);
        
        Jugador jugador1 = new Jugador("J1", manos.get(0));
        Jugador jugador2 = new Jugador("J2", manos.get(1));
        Jugador jugador3 = new Jugador("J3", manos.get(2));
        
        JuegoCuentaYAtrapa juego = new JuegoCuentaYAtrapa(new ArrayList<>(Arrays.asList(jugador1, jugador2, jugador3)));
        juego.jugar();
    }
}
