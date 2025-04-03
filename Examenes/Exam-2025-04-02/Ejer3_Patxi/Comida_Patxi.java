
import java.util.ArrayList;
import java.util.Random;

public class Comida_Patxi extends Objeto_Patxi {
    
    private ArrayList<String> nombres;
    private Random random = new Random();

    public Comida_Patxi(){
        super();
    }


    @Override
    public String eligeNombre(){

        String[] herras = {"pan", "manzana", "carne", "pescado"};

        Integer random = (int)(Math.random() * herras.length + 1);

        return herras[random];
    }

    @Override
    public Integer eligeValor(){

        return (int)(Math.random() * 3 + 1);
    }
}
