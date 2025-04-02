import java.util.ArrayList;
import java.util.Random;

public class Armadura extends Objeto {
    
    private ArrayList<String> nombres;
    private Random random = new Random();

    public Armadura(){
        super();
    }

    @Override
    public String elegirNombre(){

        nombres.add("casco");
        nombres.add("pechera");
        nombres.add("pantalon");
        nombres.add("botas");

        String aux = "";
        Integer random = (int)Math.random() * nombres.size() + 1;
        aux = nombres.get(random);

        return aux;
    }

    @Override
    public Integer elegirValor(){

        Integer val = random.nextInt(10) +1;
        
        return val;
    }
}
