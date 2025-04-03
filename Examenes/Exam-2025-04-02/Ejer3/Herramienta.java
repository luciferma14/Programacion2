
import java.util.ArrayList;
import java.util.Random;

public class Herramienta extends Objeto {
    
    private ArrayList<String> nombres = new ArrayList<>();
    private Random random = new Random();

    public Herramienta(){
        super();
    }

    @Override
    public String eligeNombre(){

        this.nombres.add("espada");
        this.nombres.add("pico");
        this.nombres.add("pala");
        this.nombres.add("azada");
        this.nombres.add("hacha");

        String aux = "";
        Integer random = (int)(Math.random() * this.nombres.size() + 1);
        aux = this.nombres.get(random);

        return aux;
    }

   @Override
    public Integer eligeValor(){

        Integer val = random.nextInt(10) +1;
        
        return val;
    }

   
}
