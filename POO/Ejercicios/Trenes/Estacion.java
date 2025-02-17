public class Estacion {
    
    private static String nombreEst;
    private Double precioBill;

    public Estacion(){}

    public Estacion(String nombreEst, Double precioBill){
        this.nombreEst = nombreEst;
        this.precioBill = precioBill;
    }

    public double precioBillete(Integer edad) {
        //terminar
        double precio = 0;
        return precio;
    }

//-------- Getters y Setters ---------

    public static String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public Double getPrecioBill() {
        return precioBill;
    }

    public void setPrecioBill(Double precioBill) {
        this.precioBill = precioBill;
    }
}
