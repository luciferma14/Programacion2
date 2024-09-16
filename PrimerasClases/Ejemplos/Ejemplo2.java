public class Ejemplo2 {
    public static void main(String[] args) {
        
        int p = 6;
        int q = 4;

        int suma = p + q;
        int resta = p - q;
        int mult = p * q;
        double div = p / q;
        double divDecimales = (double) p / q;
        int resto = p % q;

        double quitaDecimales = 100.99;
        int x = (int) quitaDecimales; // quita los decimáles cortándolo directamente, sin redondear (Pasa de double a int)

        boolean result1 = (p == q);
        boolean result2 = (p == q * 2);

        boolean result3 = (p > q && p <= q);  // Siempre da false
        boolean result4 = (p > q || p < q);  // Si una de las dos es true, es true. Si son iguales es false 

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Mult: " + mult);
        System.out.println("Div: " + div);
        System.out.println("Div Decimales: " + divDecimales);
        System.out.println("Resto: " + resto);

        System.out.println("Sin quitar decimales: " + quitaDecimales);
        System.out.println("Quitando los decimales: " + x);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}