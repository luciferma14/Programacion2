public class Profesor extends Persona {

    private Integer nDespacho;

    public Profesor(String nombre, String apellidos, String nif, Direccion direccion, Integer nDespacho){
        super(nombre, apellidos, nif, direccion);
        this.nDespacho = nDespacho;
    }

    public Profesor(String nombre, String apellidos, String nif, Integer nDespacho){
        super(nombre, apellidos, nif);
        this.nDespacho = nDespacho;
    }

    public Integer getnDespacho() {
        return this.nDespacho;
    }

    public void setIdEstudiante(Integer nDespacho) {
        this.nDespacho = nDespacho;
    }
    
    public String toString(){

        if(this.direccion.equals(null)){
            return this.nombre + " " + this.apellidos + ", " + this.nif + ", Despacho: " + this.nDespacho;
        }else{
            return this.nombre + " " + this.apellidos + ", " + this.nif + ", " + this.direccion + ", Despacho: " + this.nDespacho;
        }
    }
}