

public class Herramienta_Patxi extends Objeto_Patxi {
    
    public Herramienta_Patxi(){
        super();
    }

    @Override
    public String eligeNombre(){

        String[] herras = {"espada", "pico", "pala", "azada", "hacha"};

        Integer random = (int)(Math.random() * herras.length + 1);

        return herras[random];
    }

   @Override
    public Integer eligeValor(){

        return (int)(Math.random() * 10 + 1);
        
    }

   
}
