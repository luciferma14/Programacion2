import java.util.ArrayList;

public class JuegoCuentaYAtrapa {
    private ArrayList<Jugador> jugadores;  // Lista de jugadores
    private int numeroActual;  // Número que los jugadores deben decir
    private ArrayList<Carta> cartasEnMesa;  // Cartas que se han jugado hasta el momento

    public JuegoCuentaYAtrapa(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.numeroActual = 1;  // Comienza con el número 1
        this.cartasEnMesa = new ArrayList<>();
    }

    // Método para iniciar y jugar el juego
    public void jugar() {
        // El juego continúa hasta que un jugador se quede sin cartas
        while (true) {
            // Se pasa el turno entre los jugadores
            for (Jugador jugador : jugadores) {
                if (jugador.sinCartas()) {
                    // Si un jugador no tiene cartas, gana el juego
                    System.out.println(jugador.getNombre() + " ha ganado, ¡se quedó sin cartas!");
                    return;
                }

                // El jugador juega una carta
                Carta cartaJugada = jugador.juegaCarta();
                System.out.println(jugador.getNombre() + " dice " + numeroActual + " y tira " + cartaJugada);

                // Agrega la carta jugada a las cartas en la mesa
                cartasEnMesa.add(cartaJugada);

                // Si la carta jugada coincide con el número actual, todos deben poner la mano
                if (cartaJugada.getValor() == numeroActual) {
                    System.out.println("¡Coincidió! Todos ponen la mano en el centro.");
                    Jugador perdedor = determinarPerdedor();  // Determina quién perdió
                    System.out.println(perdedor.getNombre() + " fue el último en poner la mano y recoge todas las cartas.");
                    perdedor.recogerCartas(cartasEnMesa);  // El perdedor recoge las cartas en la mesa
                    cartasEnMesa.clear();  // Se limpia la mesa
                }

                // El número actual se incrementa, y si llega a 12, vuelve a 1
                numeroActual = (numeroActual % 12) + 1;
            }
        }
    }

    // Determina qué jugador pierde (quien tiene menos cartas)
    private Jugador determinarPerdedor() {
        Jugador perdedor = jugadores.get(0);
        for (Jugador jugador : jugadores) {
            if (jugador.getNumeroCartas() < perdedor.getNumeroCartas()) {
                perdedor = jugador;
            }
        }
        return perdedor;
    }
}
