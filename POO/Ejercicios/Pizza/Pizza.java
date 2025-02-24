public class Pizza {
    
    private String tamanyo;
    private String tipo;
    private String estado;
    private static Integer totalPedidas = 0;
    private static Integer totalServidas = 0;

    public Pizza(){
        this.tipo = "margarita";
        this.tamanyo = "mediana";
        this.estado = "pedida";
        totalPedidas++;
    }

    public Pizza(String tipo, String tamanyo){
        this.tipo = tipo;
        this.tamanyo = tamanyo;
        this.estado = "pedida";
        totalPedidas++;
    }

    public void sirve(){
        if(this.estado.equals("servida")){
            System.out.println("esa pizza ya se ha servido");
        }else{
            setEstado("servida");
            totalServidas++;
        }
        
    }

    public String getTamanyo() {
        return this.tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static Integer getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public void setTotalPedidas(Integer totalPedidas) {
        this.totalPedidas = totalPedidas;
    }

    public static Integer getTotalServidas() {
        return Pizza.totalServidas;
    }

    public void setTotalServidas(Integer totalServidas) {
        this.totalServidas = totalServidas;
    }

    public String toString(){
        return ("pizza " + this.tipo + " " + this.tamanyo + ", " + this.estado);
    }

}
