import java.util.ArrayList;

public class Cofre {
    private String id;
    private ArrayList<Objeto> contenido = new ArrayList<>();

    // private Herramienta herra = new Herramienta();
    // private Comida comi = new Comida();
    // private Mineral mine = new Mineral();
    // private Armadura armad = new Armadura();

    public Cofre(String id) {
        this.id = id;
        this.contenido = new ArrayList<>();
    }

    public void rellenaCofre() {
        Integer numHerra = (int)(Math.random() * 3);
        for (int i = 0; i < numHerra; i++) {
            contenido.add(new Herramienta());
        }

        Integer numComi = (int)(Math.random() * 4);
        for (int i = 0; i < numComi; i++) {
            contenido.add(new Comida());
        }

        Integer numMine = (int)(Math.random() * 3);
        for (int i = 0; i < numMine; i++) {
            contenido.add(new Mineral());
        }

        Integer numArmad = (int)(Math.random() * 2);
        for (int i = 0; i < numArmad; i++) {
            contenido.add(new Armadura());
        }
    }

    public String getId() {
        return id;
    }

    public String toString() {
        String texto = this.id;
        texto +=  "\n=========\n";
        for(Objeto c : contenido){
            texto += c;
            texto += "\n";
        }

        return texto;
    }
}
