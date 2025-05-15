package ReservaVuelos;

public class Vuelos {
    private String id_Vuelo;
    private String origen;
    private String destino;
    private String fecha;
    private Integer capacidad;

    public Vuelos(){}

    public Vuelos(String id_Vuelo, String origen, String destino, String fecha, Integer capacidad){
        this.id_Vuelo = id_Vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.capacidad = capacidad;
    }

    public String getId_Vuelo() {
        return this.id_Vuelo;
    }

    public void setId_Vuelo(String id_Vuelo) {
        this.id_Vuelo = id_Vuelo;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        if (id_Vuelo == null){
            return "Capacidad: " + capacidad;
        }
        return "Vuelo: " + id_Vuelo;
    }

}
