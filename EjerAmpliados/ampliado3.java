public class Ampliado3 {
    public static void main(String[] args) {

        double PI = 3.141592;
        double radio = 7.7;
        double alt = 41.2;
        double volumen = PI * radio * radio * alt;

        System.out.printf("Radio = %.1f \nAltura = %.1f \nEl volumen del cilindro es %.7f \n", radio, alt, volumen);
    }
}