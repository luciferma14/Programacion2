public class Planeta extends Satelite{
    
    private String nombre;
    private Double masa;
    private Double diametro;

    public Planeta(){}

    public Planeta(String nombre, Double masa, Double diametro){
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
    }


    public Integer cuantosOrbitan(){
        int cont = 0;

        //if(getPlaneta() == this.nombre){
        //    cont++;
        //}

        return cont;
    }


    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getMasa() {
        return this.masa;
    }
    public void setMasa(Double masa) {
        this.masa = masa;
    }
    public Double getDiametro() {
        return this.diametro;
    }
    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    

}
