import java.util.Scanner;

public class peExtra6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num = (int) (Math.random() * 100) + 1;
        int intentos = 1;
        int usu;

        System.out.println();
        System.out.println("El ordenador a pensado un número del 1 al 100, adivinalo!! :)");
        System.out.println("Para ello tienes 6 oportunidades.");

        do {
            
            System.out.print(intentos + " intento: ");
            usu = sc.nextInt();

            if (num == usu){
                System.out.println("Has acertado!! :)");
                System.exit(0);
            }else{
                intentos++;
            }
            if (usu < num){
                System.out.println("Es mayor");
            }else {
                System.out.println("Es menor");
            }

        }while(intentos != 7);

        System.out.println("El número secreto era: " + num);
    }
}
