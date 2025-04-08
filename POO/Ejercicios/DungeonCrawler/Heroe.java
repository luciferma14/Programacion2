
import java.util.Random;


public class Heroe extends Personajes{

    private String tipo;
    
    public Heroe(String tipo, String nombre, Arma arma){
        super(nombre, 0, arma);
        this.tipo = tipo;

        Random random = new Random();

        if(this.tipo.equals("Mago")){
            this.puntosDeVida = random.nextInt(6) + 3; // 3 a 8
        }else{
            this.puntosDeVida = random.nextInt(6) + 5; // 5 a 10
        }
        this.posicion = 0;
    }

    public void avanzar(){
        posicion++;

        if (!tipo.equals("Mago")){
            puntosDeVida++;
        }else{
            puntosDeVida += 2;
        }
    }
}