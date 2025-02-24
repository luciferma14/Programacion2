public class Coche extends Vehiculo {
    
    private Integer kilometrosRecorridos;

    public Coche(){
        this.kilometrosRecorridos = 0;
        cont++;
        vehiculosCreados = cont;
    }
}
