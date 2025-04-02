public abstract class Objeto {
    
    private String nombre;
    private Integer valor;

    public Objeto(){
        this.nombre = elegirNombre();
        this.valor = elegirValor();
    }

    public abstract String elegirNombre();
    public abstract Integer elegirValor();

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
