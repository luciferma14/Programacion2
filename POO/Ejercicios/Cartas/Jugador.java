import java.util.List;

public class Jugador {

    private String nombre;
    private List<Carta> mano;
    
    public Jugador(String nombre, List<Carta> mano) {
        this.nombre = nombre;
        this.mano = mano;
    }
    
    public Carta juegaCarta() {
        return mano.isEmpty() ? null : mano.remove(0);
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