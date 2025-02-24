public class Fraccion {
    
    private Integer numerador;
    private Integer denominador;

    public Fraccion(Integer numerador, Integer denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(){
        this.numerador = 1;
        this.denominador = 1;
    }

    public void invertir(){
        Integer aux = this.denominador;
        this.denominador = this.numerador;
        this.numerador = aux;
    }

    public void simplificar(){
        int num = 2;
        int menor = Math.min(this.numerador, this.denominador);

        while(num < menor){

            if(this.numerador % num == 0 && this.denominador % num == 0){
                this.numerador = this.numerador / num;
                this.denominador = this.denominador / num;
            }else{
                num++;
            }
        }
    }

    public void suma(Fraccion fraccion){
        int numAux1;
        int numAux2;
        int denAux;

        numAux1 = this.numerador * fraccion.getDenominador();
        numAux2 = this.denominador * fraccion.getNumerador();
        denAux = this.denominador * fraccion.getDenominador();

        this.numerador = numAux1 + numAux2;
        this.denominador = denAux;
        
        this.simplificar();
    }

    public void multiplicar(Fraccion fraccion){
        this.numerador = this.numerador * fraccion.getNumerador();
        this.denominador = this.denominador * fraccion.getDenominador();   
    }

    public void dividir(Fraccion fraccion){
        this.numerador = this.numerador * fraccion.getDenominador();
        this.denominador = this.denominador * fraccion.getNumerador();
    }


    public Integer getNumerador() {
        return this.numerador;
    }

    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    public Integer getDenominador() {
        return this.denominador;
    }

    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }

    public String toString(){

        return this.numerador + "/" + this.denominador;
    }
}