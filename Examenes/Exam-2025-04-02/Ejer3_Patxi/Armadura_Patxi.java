import java.util.ArrayList;
import java.util.Random;

public class Armadura_Patxi extends Objeto_Patxi {
    
    private ArrayList<String> nombres;
    private Random random = new Random();

    public Armadura_Patxi(){
        super();
    }

    @Override
    public String eligeNombre(){

        String[] herras = {"casco", "pechera", "pantalon", "botas"};

        Integer random = (int)(Math.random() * herras.length + 1);

        return herras[random];
    }

    @Override
    public Integer eligeValor(){

        return (int)(Math.random() * 10 + 1);
     }
}
