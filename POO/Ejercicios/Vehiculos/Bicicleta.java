public class Bicicleta extends Vehiculo{
    
    private static Integer kilometrosRecorridos;
    
    public Bicicleta(){
        this.kilometrosRecorridos = 0;
        cont++;
        vehiculosCreados = cont;
    }
}