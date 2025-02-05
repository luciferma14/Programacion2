public class Planeta {
    
    private String nombre;
    private Long masa;
    private Double diametro;
    private Integer nSatelites;

    public Planeta(){}

    public Planeta(String nombre){
        this.nombre = nombre;
        this.nSatelites = 0;
    }

    public Planeta(String nombre, Long masa, Double diametro){
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.nSatelites = 0;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getMasa() {
        return this.masa;
    }
    public void setMasa(Long masa) {
        this.masa = masa;
    }
    public Double getDiametro() {
        return this.diametro;
    }
    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    public Integer getnSatelites() {
        return this.nSatelites;
    }
    public void setnSatelites(int nSatelites) {
        this.nSatelites = nSatelites;
    }
}
