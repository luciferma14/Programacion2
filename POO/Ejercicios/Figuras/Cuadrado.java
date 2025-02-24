public class Cuadrado extends Figura{
    
    private Double lado;
    
    public Cuadrado(Double lado){
        this.lado = lado;
        cont++;
        this.nombre = "Cua" + cont;
    }

    @Override
    public Double area(){
        return lado * lado;
    }

    @Override
    public Double perimetro(){
        return lado * 4;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
}
