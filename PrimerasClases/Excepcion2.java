public class Excepcion2 {
    public static void main(String[] args) {
        
        try {
            funcion1();

        } catch (Exception e) {
            System.out.println("Excepción capturada main: " + e.getMessage());
        }
    }

    public static void funcion1() throws Exception {
        funcion2();
    }

    public static void funcion2() throws Exception {
        throw new Exception("Excepción generada en la funcion2");
    }
}
