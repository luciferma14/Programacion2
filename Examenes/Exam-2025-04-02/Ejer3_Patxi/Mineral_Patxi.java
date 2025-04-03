
import java.util.ArrayList;
import java.util.Random;

public class Mineral_Patxi extends Objeto_Patxi {
    
    private ArrayList<String> nombres;
    private Random random = new Random();

    public Mineral_Patxi(){
        super();
    }

    @Override
    public String eligeNombre(){

        String[] herras = {"hierro", "carbon", "oro", "diamante"};

        Integer random = (int)(Math.random() * herras.length + 1);

        return herras[random];
    }

    @Override
    public Integer eligeValor(){

        return (int)(Math.random() * 2 + 1);
    }
}
