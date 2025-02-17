
import java.util.ArrayList;

public class Viaje {
    
    private String nombreViaje;
    private String fechaViaje;
    private Tren tren;

    public Viaje(){}

    public Viaje(String nombreViaje, String fechaViaje, Tren tren){
        this.nombreViaje = nombreViaje;
        this.fechaViaje = fechaViaje;
        this.tren = tren;
    }

    public void addEstacion(Estacion estacion){
        ArrayList<Estacion> estaciones = new ArrayList<>();

        estaciones.add(estacion);
    }

    public Estacion buscarEstacion(String est) {
        
        if(Estacion.getNombreEst().equals(est)){} // Son iguales
        return null;
    }

    public String plazasLibres(){
        String plazas = String.valueOf(this.tren.getCapacidadAsi());

        if(this.tren.getCapacidadAsi() == 0){
            return "";
        }else{
            return plazas;
        }
    }

    public void reservaAsiento(String dni, int num_asiento) {
        //terminar
    }


//-------- Getters y Setters ---------

    public String getNombreViaje() {
        return nombreViaje;
    }

    public void setNombreViaje(String nombreViaje) {
        this.nombreViaje = nombreViaje;
    }

    public String getFecha() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }
}
