public class Alumno {
    
    private Integer numAlumno;
    private String nia;
    private String nombre;
    private Integer edad;

    public Alumno(){}

    public Alumno(Integer numAlumno, String nia, String nombre, Integer edad){
        this.numAlumno = numAlumno;
        this.nia = nia;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getNumAlumno() {
        return this.numAlumno;
    }

    public void setNumAlumno(Integer numAlumno) {
        this.numAlumno = numAlumno;
    }

    public String getNia() {
        return this.nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return getNumAlumno() + " - " + getNombre();
    }

    
    
}
