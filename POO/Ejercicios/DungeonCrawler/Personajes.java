import java.util.Random;

public class Personajes {
    private Random random = new Random();

    protected String nombre;
    protected Integer puntosDeVida;
    protected Arma arma;
    protected Integer posicion;

    public Personajes(String nombre, Integer puntosDeVida, Arma arma){
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.arma = arma;
    }

    public Boolean estaVivo(){
        return puntosDeVida > 0;
    }

    public void recibirDanyo(Integer danyo){
        puntosDeVida -= danyo;
        if (puntosDeVida < 0){
            puntosDeVida = 0;
        }
    }

    public Integer getPosicion(){
        return this.posicion;
    }

    public void setPosicion(Integer posicion){
        this.posicion = posicion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Integer getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public Arma getArma() {
        return this.arma;
    }

}
