import java.util.Random;

public class Personajes {
    private Random random = new Random();

    private String nombre;
    private Integer puntosDeVida;
    private String arma;

    public Personajes(String nombre, Integer puntosDeVida, String arma){
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.arma = arma;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void setPuntosDeVida(Integer puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public String getArma() {
        return this.arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setPuntosDeVidaMago(Integer puntosDeVida){
        this.puntosDeVida = random.nextInt(3) + 3;
    }
}
