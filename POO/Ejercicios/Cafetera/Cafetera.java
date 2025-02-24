public class Cafetera {
    
    private Integer capacidadMaxima;
    private Integer cantidadActual;
    public static Integer numCafeteras;

    public Cafetera(){
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        this.numCafeteras++;
    }

    public Cafetera(Integer capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
        this.numCafeteras++;
    }

    public Cafetera(Integer capacidadMaxima, Integer cantidadActual){
        this.capacidadMaxima = capacidadMaxima;

        if(cantidadActual > capacidadMaxima){
            this.cantidadActual = capacidadMaxima;
        }else{
            this.cantidadActual = cantidadActual;
        }
        this.numCafeteras++;
    }

    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }

    public Integer servirTaza(Integer cantidadTaza){
        Integer aux = this.cantidadActual;

        if (cantidadTaza <= this.cantidadActual) {
            this.cantidadActual = this.cantidadActual - cantidadTaza;
            return cantidadTaza;
        }else{
            this.cantidadActual = 0;
            return aux;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void agregarCafe(Integer cantidadCafe){

        if((this.cantidadActual + cantidadCafe) > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;   
        }else{
            this.cantidadActual = this.cantidadActual + cantidadCafe;
        }
    }

    public Integer getCapacidadMaxima(){
        return this.capacidadMaxima;
    }

    public Integer getCantidadActual(){
        return this.cantidadActual;
    }

    public void setCapacidadMaxima(Integer capacidadMaximaNueva){
        this.capacidadMaxima = capacidadMaximaNueva;
    }

    public void setCantidadActual(Integer cantidadActualNueva){
        this.cantidadActual = cantidadActualNueva;
    }
}