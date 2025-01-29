public class Mesa {
    
    String estado;
    String color;
    String material;
    Integer numPatas;
    String tamanyo;
    String superficie;

    public Mesa(){}

    public Mesa(String estado, String color, String material, Integer numPatas, String tamanyo, String superficie){
        this.estado = estado;
        this.color = color;
        this.material = material;
        this.numPatas = numPatas;
        this.tamanyo = tamanyo;
        this.superficie = superficie;
    }

    public boolean comerEnMesa(){
        if(this.material.equals("Cristal") || this.material.equals("Plastico")){
            return true;
        }else{
            return false;
        }
    }

    public boolean reservaMesa(){

        if(this.estado.equals("Libre")){
            this.estado = "Ocupada";
            System.out.println("Reserva hecha");
            return true;
        }else{
            System.out.println("No ha sido posible reservar");
            return false;
        }
    }
}