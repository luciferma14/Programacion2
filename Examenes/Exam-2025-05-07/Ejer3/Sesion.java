public class Sesion {
    
    private String idSesion;
    private String modulo;

    public Sesion(){}

    public Sesion(String idSesion, String modulo){
        this.idSesion = idSesion;
        this.modulo = modulo;
    }

    public String getIdSesion() {
        return this.idSesion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public String getModulo() {
        return this.modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return getIdSesion() + " - " + getModulo();
    }

    
}
