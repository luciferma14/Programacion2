import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cofre {
    private String id;
    private List<String> contenido;
    private static final List<String> OBJETOS_DISPONIBLES = Arrays.asList("Diamante", "Oro", "Hierro", "Manzana", "Espada", "Arco", "Flecha", "Antorcha");

    public Cofre(String id) {
        this.id = id;
        this.contenido = new ArrayList<>();
    }

    public void rellenaCofre() {
        Random rand = new Random();
        int numObjetos = rand.nextInt(4) + 1; // Entre 1 y 4 objetos
        for (int i = 0; i < numObjetos; i++) {
            String objeto = OBJETOS_DISPONIBLES.get(rand.nextInt(OBJETOS_DISPONIBLES.size()));
            contenido.add(objeto);
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cofre " + id + " contiene: " + contenido;
    }
}
