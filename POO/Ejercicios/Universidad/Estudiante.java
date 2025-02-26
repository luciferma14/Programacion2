public class Estudiante extends Persona {

    private Integer idEstudiante;

    public Estudiante(String nombre, String apellidos, String nif, Direccion direccion, Integer idEstudiante){
        super(nombre, apellidos, nif, direccion);
        this.idEstudiante = idEstudiante;
    }

    public Estudiante(String nombre, String apellidos, String nif, Integer idEstudiante){
        super(nombre, apellidos, nif);
        this.idEstudiante = idEstudiante;
    }

    public Integer getIdEstudiante() {
        return this.idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    
    public String toString(){

        if(this.direccion.equals(null)){
            return this.nombre + " " + this.apellidos + ", " + this.nif + ", ID: " + this.idEstudiante;
        }else{
            return this.nombre + " " + this.apellidos + ", " + this.nif + ", " + this.direccion + ", ID: " + this.idEstudiante;
        }
    }
}