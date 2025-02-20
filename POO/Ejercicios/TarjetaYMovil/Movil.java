import java.text.DecimalFormat;

public class Movil extends TarjetaSIM {

    private String tarifa;
    private Integer tiemLlamada;

    public Movil(String numero){
        super(numero);
    }
    
    public Movil(String numero, String tarifa){
        super(numero);
        this.tarifa = tarifa;
        this.tiemLlamada = 0;
    }

    public void llama(Movil movil, Integer seg){
        super.llama(movil, seg);
        this.tiemLlamada += seg;
    }

    public String toString(){

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Double gastos = 0.0;

        if(this.tarifa.equals("plata")){
            gastos = (tiemLlamada * 0.10) / 60;
        }
        if(this.tarifa.equals("oro")){
            gastos = (tiemLlamada * 0.06) / 60;
        }
        if(this.tarifa.equals("platinum")){
            gastos = (tiemLlamada * 0.03) / 60;
        }

        return super.toString() + " - " + decimalFormat.format(gastos) + " euros de gasto";
    }
}