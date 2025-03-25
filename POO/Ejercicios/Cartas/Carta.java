public class Carta {
    
    private Integer valor;
    private String palo;

    // Constructor con valor y palo
    public Carta(Integer valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Método toString para mostrar la carta de manera legible
    @Override
    public String toString() {
        return this.valor + " de " + this.palo;
    }

    // Getters y Setters
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
