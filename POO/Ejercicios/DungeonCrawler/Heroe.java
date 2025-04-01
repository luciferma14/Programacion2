
public class Heroe extends Personajes{
    
    public Heroe(String nombre, Integer puntosDeVida, String arma){
        super(nombre, puntosDeVida, arma);
    }
    
    public Heroe(){
        setNombre("Mago");
        setPuntosDeVidaMago(0);
        setArma("Hechizo");
    }
}
