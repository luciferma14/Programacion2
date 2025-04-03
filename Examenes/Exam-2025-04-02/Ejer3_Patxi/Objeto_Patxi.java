public abstract class Objeto_Patxi {
    
    private String nombre;
    private Integer valor;

    public Objeto_Patxi(){
        this.nombre = eligeNombre();
        this.valor = eligeValor();
    }

    public abstract String eligeNombre();
    public abstract Integer eligeValor();

    public void usar(){
        this.valor = valor - 1;
    }

    public void usar(Integer g){
        this.valor = valor - g;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    
}
