public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected String nif;
    protected Direccion direccion;

    public Persona(String nombre, String apellidos, String nif, Direccion direccion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido, String nif){
        this.nombre = nombre;
        this.apellidos = apellido;
        this.nif = nif;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}