import java.util.ArrayList;

public class JuegoCuentaYAtrapa {
    private ArrayList<Jugador> jugadores;
    private int numeroActual;  
    private ArrayList<Carta> cartasEnMesa;  

    public JuegoCuentaYAtrapa(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.numeroActual = 1;  // Comienza con el número 1
        this.cartasEnMesa = new ArrayList<>();
    }

    public void jugar() {
        // El juego continúa hasta que un jugador se quede sin cartas
        while (true) {
            
            for (Jugador jugador : jugadores) {
                if (jugador.sinCartas()) {
                   
                    System.out.println(jugador.getNombre() + " ha ganado, ¡se quedó sin cartas!");
                    return;
                }

                Carta cartaJugada = jugador.juegaCarta();
                System.out.println(jugador.getNombre() + " dice " + numeroActual + " y tira " + cartaJugada);

                cartasEnMesa.add(cartaJugada);

                // Si la carta jugada coincide con el número actual, todos deben poner la mano
                if (cartaJugada.getValor() == numeroActual) {
                    System.out.println("¡Coincidió! Todos ponen la mano en el centro.");
                    Jugador perdedor = determinarPerdedor();  
                    System.out.println(perdedor.getNombre() + " fue el último en poner la mano y recoge todas las cartas.");
                    perdedor.recogerCartas(cartasEnMesa);  
                    cartasEnMesa.clear();
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
