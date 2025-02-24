public class Vehiculo {
    
    protected static int vehiculosCreados;
    private static int kilometrosTotales;
    private int kilometrosRecorridos;
    protected static Integer cont = 0;

    public Integer anda(Integer km) {
        kilometrosRecorridos += km;
        kilometrosTotales += km;
        return kilometrosRecorridos;
    }


    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}
