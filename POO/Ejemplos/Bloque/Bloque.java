public abstract class Bloque {
    
    private Integer alto;
    private Integer ancho;
    private Integer fondo;
    private String color;

    public Bloque(){
        this.alto = 1;
        this.ancho = 1;
        this.fondo = 1;
        this.color = "Blanco";
    }

    public Bloque(Integer alto, Integer ancho, Integer fondo, String color){
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.color = color;
    }

    public abstract void colocar(); // Todas las subclases tienen que tener "colocar()" (obligado)

    public Integer getAlto() {
        return this.alto;
    }

    public Integer getAncho() {
        return this.ancho;
    }

    public Integer getFondo() {
        return this.fondo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
