public class Billete {
    
    private String dniPas;
    private String estacionDest;
    private String fechaBill;
    private String nombreTren;
    private Integer numAsiento;
    private Double precioBill;

    public Billete(){}

    public Billete(String dniPas, String estacionDest, String fechaBill, String nombreTren, Integer numAsiento, Double precioBill){
        this.dniPas = dniPas;
        this.estacionDest = estacionDest;
        this.fechaBill = fechaBill;
        this.nombreTren = nombreTren;
        this.numAsiento = numAsiento;
        this.precioBill = precioBill;
    }

    public String imprimeBillete() {

        return this.dniPas + ", " + this.estacionDest + ", " + this.fechaBill + ", " + this.nombreTren + ", " + this.numAsiento + ", " + this.precioBill;     
    }


//-------- Getters y Setters ---------

    public String getDniPas() {
        return dniPas;
    }

    public void setDniPas(String dniPas) {
        this.dniPas = dniPas;
    }

    public String getEstacionDest() {
        return estacionDest;
    }

    public void setEstacionDest(String estacionDest) {
        this.estacionDest = estacionDest;
    }

    public String getFechaBill() {
        return fechaBill;
    }

    public void setFechaBill(String fechaBill) {
        this.fechaBill = fechaBill;
    }

    public String getNombreTren() {
        return nombreTren;
    }

    public void setNombreTren(String nombreTren) {
        this.nombreTren = nombreTren;
    }

    public Integer getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(Integer numAsiento) {
        this.numAsiento = numAsiento;
    }

    public Double getPrecioBill() {
        return precioBill;
    }

    public void setPrecioBill(Double precioBill) {
        this.precioBill = precioBill;
    }
}
