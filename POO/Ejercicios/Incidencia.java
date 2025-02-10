public class Incidencia implements Comparable<Incidencia> {
    
    private Integer puesto;
    private String causa;
    private static Integer aux = 1;
    private Integer codigo;
    private String estado;
    private String resuelto;
    private static Integer pendientes = 0;
    private Integer prioridad;

    public Incidencia(){
        this.estado = "Pendiente";
        this.codigo = aux++;
        pendientes++;
    }

    public Incidencia(Integer puesto, String causa, Integer prioridad){
        this.puesto = puesto;
        this.causa = causa;
        this.estado = "Pendiente";
        this.codigo = aux++;
        pendientes++;
        this.prioridad = prioridad;

    }

    public void resuelve(String resuelto){
        if(this.estado.equals("Resuelta")){
            System.out.println("Esta incidencia ya está resuelta");
        }else{
            this.resuelto = resuelto;
            this.estado = "Resuelta";
            pendientes--;
        }
    }

    public Integer getPuesto() {
        return this.puesto;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }

    public String getCausa() {
        return this.causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public static Integer getPendientes() {
        return Incidencia.pendientes;
    }

    public void setPendientes(Integer pendientes) {
        this.pendientes = pendientes;
    }

    public String toString(){
        if (this.resuelto != null){
            return "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.causa + " - " + this.estado + " - " + this.resuelto;
        }else{
            return "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.causa + " - " + this.estado;
        }
    }

    public int compareTo(Incidencia inc){

        if(this.prioridad != inc.prioridad){
            return (this.prioridad) - inc.prioridad;
        }

        return (this.prioridad + inc.prioridad);
    }
}