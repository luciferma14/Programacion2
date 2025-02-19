
import java.util.ArrayList;

public class Viaje {
    
    private String nombreViaje;
    private String fechaViaje;
    private Tren tren;
    private ArrayList<Estacion> estaciones = new ArrayList<>();

    public Viaje(String nombreViaje, String fechaViaje){
        this.nombreViaje = nombreViaje;
        this.fechaViaje = fechaViaje;
        this.tren = new Tren();
    }

    public Viaje(String nombreViaje, String fechaViaje, Tren tren){
        this.nombreViaje = nombreViaje;
        this.fechaViaje = fechaViaje;
        this.tren = tren;
        // Vaciar asientos
        String[] asientos = this.tren.getAsientos();
        for(int i = 0; i < asientos.length; i++){
            asientos[i] = "";
        }
    }

    public void addEstacion(Estacion estacion){

        estaciones.add(estacion);
    }

    public Estacion buscarEstacion(String est) {
        
        for(Estacion estacion : estaciones){
            
            if(estacion.getNombreEst().equals(est)){
                return estacion;
            }
        }
        return null;
    }

    public String plazasLibres(){
        String plazas = "";

        for(int i = 0; i < tren.getCapacidadAsi(); i++){
            if (tren.getAsientos()[i].equals("")){
                plazas += i + "-";
            }
        }

        return plazas;
    }
 
    public void reservaAsiento(String dni, Integer numAsiento) {
        
        if (tren.getAsientos()[numAsiento].equals("")){
            tren.getAsientos()[numAsiento] = dni;
        }else{
            System.out.println("Ese asiento ya está reservado");
        }
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
