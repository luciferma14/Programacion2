

public class Triangulo extends Figura {
    
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
        cont++;
        this.nombre = "Tri" + cont;
    }

    @Override
    public Double area(){
        return (base * altura) / 2;
    }

    @Override
    public Double perimetro(){
        double l2 = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        return base + l2 + l2;
    }


    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
