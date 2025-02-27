import java.util.ArrayList;

public class Carcel {
    
    private String nombre;
    protected ArrayList<Forajido> presidiarios = new ArrayList();

    public Carcel(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        String texto = this.nombre.toUpperCase();
        texto +=  "\n=========\n";
        for(Forajido f : presidiarios){
            texto += f.getNombre();
            texto += "\n";
        }

        return texto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Forajido> getPresidiarios() {
        return presidiarios;       
    }

    public void setPresidiarios(Forajido f) {
        this.presidiarios.add(f);
    }
    
}
