public class Tren {

    private String nombreTren;
    private Integer capacidadAsi;

    public Tren(){}

    public Tren(String nombreTren, Integer capacidadAsi){
        this.nombreTren = nombreTren;
        this.capacidadAsi = capacidadAsi;
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
}
