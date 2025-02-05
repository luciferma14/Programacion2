public class Satelite {
    
    private String nombre;
    private Planeta planeta;
    private Long distanAlPlaneta;

    public Satelite(){}

    public Satelite(String nombre, Planeta planeta, Long distanAlPlaneta){
        this.nombre = nombre;
        this.planeta = planeta;
        this.distanAlPlaneta = distanAlPlaneta;
        this.planeta.setnSatelites(planeta.getnSatelites() + 1);
    }

    public Boolean orbita(String nombre){
        if (nombre.equals(this.planeta.getNombre())){
            return true;   
        }

       return false;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Planeta getPlaneta() {
        return this.planeta;
    }
    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }
    public Long getDistanAlPlaneta() {
        return this.distanAlPlaneta;
    }
    public void setDistanAlPlaneta(Long distanAlPlaneta) {
        this.distanAlPlaneta = distanAlPlaneta;
    }
}