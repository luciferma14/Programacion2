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
            return null;
        } else {
            Carta carta = mano.get(0); 
            mano.remove(0); 
            return carta; 
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
