public class Circulo extends Figura {
    
    private Double radio;

    public Circulo(Double radio){
        this.radio = radio;
        cont++;
        this.nombre = "Cir" + cont;
    }

    @Override
    public Double area(){
        return PI * radio * radio;
    }

    @Override
    public Double perimetro(){
        return 2 * PI * radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
