import java.util.List;

public class Jugador {

    private String nombre;
    private List<Carta> mano;
    
    public Jugador(String nombre, List<Carta> mano) {
        this.nombre = nombre;
        this.mano = mano;
    }
    
    public Carta juegaCarta() {
        if (mano.isEmpty()) {
            return null; // Si la mano está vacía, no se puede jugar ninguna carta
        } else {
            // Si la mano no está vacía, eliminamos y devolvemos la primera carta
            Carta carta = mano.get(0); // Tomamos la primera carta
            mano.remove(0); // La eliminamos de la mano
            return carta; // La devolvemos
        }
    }
    
    public int getNumeroCartas() {
        return mano.size();
    }
    
    public void recogerCartas(List<Carta> cartasGanadas) {
        mano.addAll(cartasGanadas);
    }
    
    public boolean sinCartas() {
        return mano.isEmpty();
    }
    
    public String getNombre() {
        return nombre;
    }
}
