import java.util.ArrayList;

public class Pistolero {
    
    private String nombre;
    private Integer recompensa;
    private ArrayList<Forajido> capturas = new ArrayList();

    public Pistolero(String nombre){
        this.nombre = nombre;

    }

    public void captura(Forajido f){

        if(f.getCapturado().equals(true)){
            System.out.println("Ya ha sido capturado");
        }else{
            capturas.add(f);
            f.setCapturado(true);
        }
    }

    public void meterCarcel(Forajido f, Carcel c) {
        c.setPresidiarios(f);
        capturas.remove(f);
        this.setRecompensa(f.getPrecio());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(Integer recompensa) {
        this.recompensa = recompensa;
    }

    public String getCapturas() {
        String texto = "";
        for(Forajido x : capturas){
            texto += x.getNombre();
            texto += ", ";
        }
        return texto;

    }

    public void setCapturas(ArrayList<Forajido> capturas) {
        this.capturas = capturas;
    }
}
