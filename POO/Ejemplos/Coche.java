public class Coche {
    
    String matricula;
    String marca;
    String modelo;
    String color;
    int numPlazas;

    public Coche(){} // Lo crea por defecto en el programa principal, no hace falta crearlo

    public Coche(String marca, String modelo, String color, int numPlazas){
     this.marca = marca;
     this.modelo = modelo;
     this.color = color;
     this.numPlazas = numPlazas;
    }
}

