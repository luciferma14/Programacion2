public class PruebaFraccion {
    public static void main(String[] args) {
        
        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion(2, 3);
        Fraccion fraccion3 = new Fraccion(3, 14);
        Fraccion fraccion4 = new Fraccion(2, 9);
        Fraccion fraccion5 = new Fraccion(24, 54);
        
        System.out.println(fraccion1);
        System.out.println(fraccion2);
        System.out.println(fraccion3);

        fraccion2.invertir();
        System.out.println(fraccion2);

        fraccion2.multiplicar(fraccion3);
        System.out.println(fraccion2);

        fraccion2.dividir(fraccion4);
        System.out.println(fraccion2);
        
        fraccion5.simplificar();
        System.out.println(fraccion5);

        fraccion4.suma(fraccion5);
        System.out.println(fraccion4);
    }
}
