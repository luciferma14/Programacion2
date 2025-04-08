
import java.util.Random;

public class Monstruo extends Personajes{

    private String tipo;

    public Monstruo(String tipo, String nombre, Arma arma){
        super(nombre, new Random().nextInt(16) + 5, arma); // 5 a 20
        this.tipo = tipo;
    }
}