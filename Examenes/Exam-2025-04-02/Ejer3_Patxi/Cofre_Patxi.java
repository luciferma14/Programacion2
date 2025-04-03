import java.util.ArrayList;

public class Cofre_Patxi {
    private String id;
    private ArrayList<Objeto_Patxi> contenido = new ArrayList<>();


    public Cofre_Patxi(String id) {
        this.id = id;
        this.contenido = new ArrayList<>();
    }

    public void rellenaCofre() {
            Integer numHerra = (int)(Math.random() * 3);
            for (int i = 0; i < numHerra; i++) {
                contenido.add(new Herramienta_Patxi());
            }   

            Integer numComi = (int)(Math.random() * 4);
            for (int i = 0; i < numComi; i++) {
                contenido.add(new Comida_Patxi());
            }

            Integer numMine = (int)(Math.random() * 3);
            for (int i = 0; i < numMine; i++) {
                contenido.add(new Mineral_Patxi());
            }

            Integer numArmad = (int)(Math.random() * 2);
            for (int i = 0; i < numArmad; i++) {
                contenido.add(new Armadura_Patxi());
            }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += id + "\n";
        texto += "============\n";
        for(Objeto_Patxi objeto : contenido){
            texto += objeto.getNombre() + " " + objeto.getValor() + "\n" ;
        }

        return texto;
    }
}
