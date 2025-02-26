

public class Forajido {
    
    private String nombre;
    private Integer precio;
    protected Boolean capturado = false;

    public Forajido(String nombre, Integer precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        if(capturado == true){
            System.out.println("Ya ha sido capturado, no se puede cambiar el precio");
        }else{
            this.precio = precio;
        }
    }

    public Boolean getCapturado() {
        return capturado;
    }

    public void setCapturado(Boolean capturado) {
        this.capturado = capturado;
    }
    
}
