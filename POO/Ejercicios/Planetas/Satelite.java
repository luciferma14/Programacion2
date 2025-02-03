public class Satelite {
    
    private String nombre;
    private Planeta planeta;
    private Double distanAlPlaneta;

    public Satelite(){}

    public Satelite(String nombre, Planeta planeta, Double distanAlPlaneta){
        this.nombre = nombre;
        this.planeta = planeta;
        this.distanAlPlaneta = distanAlPlaneta;
    }

    public Boolean orbita(String nombre){
        if (nombre.equals(this.planeta.getNombre())){
            return true;   
        }else{
            return false;
        }
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
    public Double getDistanAlPlaneta() {
        return this.distanAlPlaneta;
    }
    public void setDistanAlPlaneta(Double distanAlPlaneta) {
        this.distanAlPlaneta = distanAlPlaneta;
    }
}
