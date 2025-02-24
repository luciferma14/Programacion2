import java.util.Vector;

public class PruebaFiguras {
    public static void main(String[] args) {
        Vector<Figura> figuras = new Vector<Figura>();
        double mayorArea = 0.0;
        String nombreFiguraMayor = "";

        figuras.add(new Circulo(5.0)); // Radio=10
        figuras.add(new Cuadrado(10.0)); // Lado=10
        figuras.add(new Cuadrado(8.0));
        figuras.add(new Triangulo(12.0,5.0)); // Base=10, Altura=5;
        
        for (Figura f: figuras){
            double a = f.area();
            System.out.println("Área: "+f.area());
            System.out.println("Perímetro: "+f.perimetro());

            if(a > mayorArea){
                mayorArea = a;
                nombreFiguraMayor = f.nombre;
            }
        }

        System.out.println("La figura de mayor área es: " + nombreFiguraMayor);
    }
}