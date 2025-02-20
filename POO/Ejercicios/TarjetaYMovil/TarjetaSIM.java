public class TarjetaSIM {
    
    private String numero;
    private Integer tiemConex;

    public TarjetaSIM(String numero){
        this.numero = numero;
        this.tiemConex = 0;
    }

    public String toString(){
        return "Num. " + this.numero + " - " + this.tiemConex + "s de conexión";
    }

    public void llama(TarjetaSIM tarjeta, Integer seg){

        this.tiemConex += seg;
        tarjeta.setTiemConex(tarjeta.getTiemConex() + seg);
        
        //tarjeta.tiemConex += seg; //--> Lo mismo que tarjeta.set(...)
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getTiemConex() {
        return this.tiemConex;
    }

    public void setTiemConex(Integer tiemConex) {
        this.tiemConex = tiemConex;
    }
}