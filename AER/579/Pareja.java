public class Pareja implements Comparable<Pareja>{
    
    private Integer prioridad;
    private Integer tiempo;

    public Pareja(){}

    public Pareja(Integer prioridad, Integer tiempo){
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public Integer getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Integer getTiempo() {
        return this.tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String toString(){
        return this.prioridad + " " + this.tiempo;
    }

    public int compareTo(Pareja pareja){
        if(this.prioridad != pareja.prioridad){
            return (pareja.prioridad - this.prioridad);
        }

        return (pareja.tiempo - this.tiempo);
    }
}