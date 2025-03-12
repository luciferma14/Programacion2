public class Carta {
    
    private Integer valor;
    private String palo;

    public Carta(Integer valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    public String toString(){
        return this.valor + " : " + this.palo;
    }

    public Integer getValor() {
        return this.valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    
}
