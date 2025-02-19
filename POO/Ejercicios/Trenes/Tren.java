public class Tren {

    private String nombreTren;
    private Integer capacidadAsi;
    private String[] asientos;

    public Tren(){
        this.nombreTren = "Virtual";
        this.capacidadAsi = 1;
    }

    public Tren(String nombreTren, Integer capacidadAsi){
        this.nombreTren = nombreTren;
        this.capacidadAsi = capacidadAsi;
        this.asientos = new String[capacidadAsi];
    }


//-------- Getters y Setters ---------

    public String getNombre() {
        return nombreTren;
    }

    public void setNombreTren(String nombreTren) {
        this.nombreTren = nombreTren;
    }

    public Integer getCapacidadAsi() {
        return capacidadAsi;
    }

    public void setCapacidadAsi(Integer capacidadAsi) {
        this.capacidadAsi = capacidadAsi;
    }

    public String[] getAsientos() {
        return this.asientos;
    }

    public void setAsientos(String[] asientos) {
        this.asientos = asientos;
    }
}
