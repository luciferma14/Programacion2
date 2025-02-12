public class Generacion {
    
    private Integer generacion;
    private String nombre;
    
    public Generacion(){}

    public Generacion(Integer generacion, String nombre){
        this.generacion = generacion;
        this.nombre = nombre;
    }
        
//-------- Getters y Setters ---------

    public Integer getGeneracion() {
        return this.generacion;
    }

    public void setGeneracion(Integer generacion) {
        this.generacion = generacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}