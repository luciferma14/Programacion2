package ReservaVuelos;

public class Pasajeros {
    
    private Integer id_Pasajero;
    private String pasaporte;
    private String nombre;

    public Pasajeros(){}

    public Pasajeros(Integer id_Pasajero, String pasaporte, String nombre){
        this.id_Pasajero = id_Pasajero;
        this.pasaporte = pasaporte;
        this.nombre = nombre;
    }

    public Integer getId_Pasajero() {
        return id_Pasajero;
    }

    public void setId_Pasajero(Integer id_Pasajero) {
        this.id_Pasajero = id_Pasajero;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
