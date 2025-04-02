
import java.util.ArrayList;
import java.util.Random;

public class Comida extends Objeto {
    
    private ArrayList<String> nombres;
    private Random random = new Random();

    public Comida(){
        super();
    }


    @Override
    public String elegirNombre(){

        nombres.add("pan");
        nombres.add("manzana");
        nombres.add("carne");
        nombres.add("pescado");

       String aux = "";
        Integer random = (int)Math.random() * nombres.size() + 1;
        aux = nombres.get(random);

        return aux;
    }

    @Override
    public Integer elegirValor(){

        Integer val = random.nextInt(3) + 1;
        
        return val;
    }
}
