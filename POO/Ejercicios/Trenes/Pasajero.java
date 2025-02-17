public class Pasajero {

    private String nombrePas;
    private String apellido;
    private String dni;
    private Integer edad;

    public Pasajero(){}

    public Pasajero(String nombrePas, String apellido, String dni, Integer edad){
        this.nombrePas = nombrePas;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

//-------- Getters y Setters ---------

    public String getNombrePas() {
        return nombrePas;
    }

    public void setNombrePas(String nombrePas) {
        this.nombrePas = nombrePas;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
