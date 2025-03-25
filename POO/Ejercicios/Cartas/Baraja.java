import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baraja() {
        // Crear cartas con los 4 palos y valores de 1 a 12
        for (int i = 1; i <= 12; i++) {
            cartas.add(new Carta(i, "Espadas"));
            cartas.add(new Carta(i, "Oros"));
            cartas.add(new Carta(i, "Copas"));
            cartas.add(new Carta(i, "Bastos"));
        }
    }

    public void barajar() {
        for (int i = 0; i < 200; i++) {
            int posi = (int) (Math.random() * cartas.size());
            Carta aux = cartas.remove(posi);
            cartas.add(aux);
        }
    }

    public void barajar2() {
        Collections.shuffle(cartas);
    }

    public List<List<Carta>> repartirCartas(int numJugadores) {
        // Baraja las cartas antes de repartir
        barajar2();

        List<List<Carta>> manos = new ArrayList<>();
        for (int i = 0; i < numJugadores; i++) {
            manos.add(new ArrayList<>());
        }

        // Reparte las cartas aleatoriamente entre los jugadores
        for (int i = 0; i < cartas.size(); i++) {
            manos.get(i % numJugadores).add(cartas.get(i));
        }

        return manos;
    }


    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
