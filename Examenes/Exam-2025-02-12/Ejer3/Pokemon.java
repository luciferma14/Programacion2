public class Pokemon implements Comparable<Pokemon>{
    // lo comentado es lo que hice yo :(
    
    private Integer numero;
    private String nombre;
    private String tipo;
    private Integer vida;
    private Integer experiencia;
    private Generacion generacion;

    public Pokemon(){}

    public Pokemon(Integer numero, String nombre, String tipo, Integer vida, Integer experiencia, Generacion generacion){
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.experiencia = experiencia;
        this.generacion = generacion;
    }

    public void ataquePokemon(Pokemon p){
        int puntos = 1;
        //int vid;

        if(this.experiencia > p.experiencia){
            puntos = (int)(Math.random() * 3) +1;
            //vid = p.vida - puntos;
            //if(vid < 0){
            //    p.vida = 0;
            //}
        }//else{
            //vid = p.vida - 1;
            // if(vid < 0){
            //     p.vida = 0;
            // }
         // }
        if(p.getVida() - puntos >= 0){
            p.setVida(p.getVida() - puntos);
        }else{
            p.setVida(0);
        }
        // lo mismo que lo de arriba -->   p.setVida(Math.max(p.getVida() - puntos, 0));
        // max = de dos valores el más mayor
    }

    public int compareTo(Pokemon p){
        //if(this.experiencia != p.experiencia){
            //return (p.experiencia - this.experiencia);
        //}
        //return (p.experiencia + this.experiencia);  

        if(this.experiencia > p.experiencia){
            return -1;
        }
        if(this.experiencia < p.experiencia){
            return 1;
        }
        return 0;

        // lo mismo que lo de arriba --> return p.experiencia - this.experiencia;
    }

    public String toString(){
        return "==========\n" + this.nombre.toUpperCase() + "\n" + generacion.getNombre() + "\n" + this.tipo + "\n" + this.vida + "\n" + this.experiencia + "\n==========";
    }

//-------- Getters y Setters ---------

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getVida() {
        return this.vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Generacion getGeneracion() {
        return this.generacion;
    }

    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }


    
}
