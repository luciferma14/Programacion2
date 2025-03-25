public class PruebaExcepcion4 {
    public static void rango(int num) throws Excepcion4 {
        if ((num > 100) || (num < 0)) {
            throw new Excepcion4("Número fuera del rango [0,100]");
        }
    }
    public static void main(String[] args) {
        try {
            System.out.println("Probamos con un número 50");
            rango(50);
            System.out.println("Probamos con un número 150");
            rango(150);
        } catch (Excepcion4 e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}