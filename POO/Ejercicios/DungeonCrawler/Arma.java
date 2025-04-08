import java.util.Random;

public class Arma {
    private String nombre;
    private Integer danyoMax;
    private Integer danyoMin = 1;
    private Random random = new Random();

    public Arma(String nombre, Integer danyoMax) {
        this.nombre = nombre;
        this.danyoMax = danyoMax;
    }

    public Integer danyoArma() {
        return random.nextInt(danyoMax - danyoMin + 1) + danyoMin;
    }

    public String getNombre() {
        return nombre;
    }
}