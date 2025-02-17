import java.util.ArrayList;
import java.util.List;

// Clase Movimiento (parte)
class Ataque {
    private String nombre;

    public Ataque(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Pokémon (todo)
class Pokemo {
    private String nombre;
    private List<Ataque> ataques;

    public Pokemo(String nombre) {
        this.nombre = nombre;
        this.ataques = new ArrayList<>();
    }

    public void aprenderAtaque(Ataque ataque) {
        ataques.add(ataque);
    }

    public void mostrarAtaques() {
        System.out.println("Ataques de " + nombre + ":");
        for (Ataque ataque : ataques) {
            System.out.println(ataque.getNombre());
        }
    }
}

// Clase principal
public class Compo3 {
    public static void main(String[] args) {
        // Crear movimientos
        Ataque rayo = new Ataque("Rayo");
        Ataque planta = new Ataque("Planta");

        // Crear Pokémon
        Pokemo pikachu = new Pokemo("Pikachu");

        // Aprender movimientos
        pikachu.aprenderAtaque(rayo);
        pikachu.aprenderAtaque(planta);

        // Mostrar movimientos del Pokémon
        pikachu.mostrarAtaques();
    }
}