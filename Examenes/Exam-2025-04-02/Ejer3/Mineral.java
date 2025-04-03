
import java.util.ArrayList;
import java.util.Random;

public class Mineral extends Objeto {
    
    private ArrayList<String> nombres;
    private Random random = new Random();

    public Mineral(){
        super();
    }

    @Override
    public String eligeNombre(){

        nombres.add("hierro");
        nombres.add("carbon");
        nombres.add("oro");
        nombres.add("diamante");

        String aux = "";
        Integer random = (int)Math.random() * nombres.size() + 1;
        aux = nombres.get(random);

        return aux;
    }

    @Override
    public Integer eligeValor(){

        Integer val = random.nextInt(2) + 1;
        
        return val;
    }
}
