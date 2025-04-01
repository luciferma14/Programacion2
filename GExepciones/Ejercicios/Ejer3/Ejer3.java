
import java.util.Scanner;

public class Ejer3 {

    static Scanner sc = new Scanner(System.in);
    
    // a)
    public static Integer LeeInt(){

        Integer n = null;

        try {
            
            n = sc.nextInt();
            
        } catch (Exception e) {
            System.out.println("Valor no Entero");
        }

        return n;
    }

    // b)
    public static Integer LeeIntPos(){
        Integer n = null;

        try {
            
            n = sc.nextInt();
            error1(n);

            // if (n < 0){
            //     throw new ExcepcionPos("No es entero positivo");
            // }
            
        } catch (ExcepcionPos e) {
            System.out.println(e.toString());

        } catch (Exception e){
            System.out.println("Error indefinido");
        }

        return n;
    }

    private static void error1(Integer n) throws ExcepcionPos {
        if (n < 0){
            throw new ExcepcionPos("No es entero positivo");
        }
    }

    // c)
    public static Integer LeeIntRango(Integer min, Integer max){
        Integer n = null;
      
        try {
            
            n = sc.nextInt();
            
            error2(n, min, max);
            
        } catch (ExcepcionPos e) {
            System.out.println(e.toString());

        } catch (Exception e){
            System.out.println("Error indefinido");
        }

        return n;
    }

    private static void error2(Integer n, Integer min, Integer max) throws ExcepcionPos {
        if (n < min || n > max){
            throw new ExcepcionPos(n + " se sale del rango");
        }
    }

    // d)
    public static Double LeeDou(){

        Double n = null;

        try {
            
            n = sc.nextDouble();
            
        } catch (Exception e) {
            System.out.println("Valor no Double");
        }

        return n;
    }

    // e)
    public static Double LeeDouRango(Double min, Double max){
        Double n = null;

        try {
            
            n = sc.nextDouble();
            
            error2(n, min, max);
            
        } catch (Exception e){
            System.out.println("Error indefinido");
        }

        return n;
    }

    private static void error2(Double n, Double min, Double max) throws Exception {
        if (n < min || n > max){
            throw new Exception(n + " se sale del rango");
        }
    }

}
