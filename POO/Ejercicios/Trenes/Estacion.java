public class Estacion {
    
    private String nombreEst;
    private Double precioBill;

    public Estacion(){}

    public Estacion(String nombreEst, Double precioBill){
        this.nombreEst = nombreEst;
        this.precioBill = precioBill;
    }

    public double precioBillete(Integer edad) {

        if(edad < 16){
            return precioBill / 2;
        }
        return precioBill;
    }

//-------- Getters y Setters ---------

    public String getNombreEst() {
        return this.nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public Double getPrecioBill() {
        return this.precioBill;
    }

    public Double getPrecioBill(Integer edad) {
        if(edad < 16){
            return precioBill / 2;
        }
        return precioBill;
    }

    public void setPrecioBill(Double precioBill) {
        this.precioBill = precioBill;
    }
}
