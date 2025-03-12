import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baraja(int numeros){
        for(int i = 1; i <= numeros; i++){
            cartas.add(new Carta(i, "Espadas"));
            cartas.add(new Carta(i, "Oros"));
            cartas.add(new Carta(i, "Copas"));
            cartas.add(new Carta(i, "Bastos"));
        }
    }

    public void barajar(){
        for (int i = 0; i < 200; i++) {
            int posi = (int) (Math.random()* cartas.size());
            Carta aux = cartas.remove(posi);
            cartas.add(aux);
        }
    }

    public void barajar2(){
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta(){
        return  cartas.remove(0);
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
