import java.util.Scanner;

public class PruebaPerson {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre1;
        int edad1;
        char sexo1;
        double peso1;
        double altura1;
        String nombre2;
        int edad2;
        char sexo2;
        
        System.out.println("Primera persona");
        System.out.print("Nombre: ");
        nombre1 = sc.nextLine();
        System.out.print("Edad: ");
        edad1 = sc.nextInt();
        System.out.print("Sexo (H-M): ");
        sexo1 = sc.next().charAt(0);
        System.out.print("Peso: ");
        peso1 = sc.nextDouble();
        System.out.print("Altura: ");
        altura1 = sc.nextDouble();

        Person per1 = new Person(nombre1, edad1, sexo1, peso1, altura1);

        sc.nextLine();
        System.out.println();
        System.out.println("Segunda persona");
        System.out.print("Nombre: ");
        nombre2 = sc.nextLine();
        System.out.print("Edad: ");
        edad2 = sc.nextInt();
        System.out.print("Sexo (H-M): ");
        sexo2 = sc.next().charAt(0);

        Person per2 = new Person(nombre2, edad2, sexo2);

        Person per3 = new Person();
        per3.setNombre("Álvaro");
        per3.setEdad(13);
        per3.generaDNI();
        per3.setSexo('H');
        per3.setPeso(45.6);
        per3.setAltura(1.62);

        double imc1 = (per1.getPeso() / (per1.getAltura() * per1.getAltura()));
        double imc3 = (per3.getPeso() / (per3.getAltura() * per3.getAltura()));

        System.out.println();
        if(per1.calcularIMC() == -1){
            System.out.println(per1.getNombre() + ": " + "Por debajo de su peso ideal: " + imc1);
        }else if (per1.calcularIMC() == 0){
            System.out.println(per1.getNombre() + ": " + "Peso ideal: " + imc1);
        }else {
            System.out.println(per1.getNombre() + ": " + "Por emcima de su peso ideal: " + imc1);
        }

        if(per3.calcularIMC() == -1){
            System.out.println(per3.getNombre() + ": " + "Por debajo de su peso ideal: " + imc3);
        }else if (per1.calcularIMC() == 0){
            System.out.println(per3.getNombre() + ": " + "Peso ideal: " + imc3);
        }else {
            System.out.println(per3.getNombre() + ": " + "Por emcima de su peso ideal: " + imc3);
        }

        System.out.println();
        if(per1.esMayorDeEdad()){
            System.out.println(per1.getNombre() + " es mayor de edad");
        }else{
            System.out.println(per1.getNombre() + " no es mayor de edad");

        }
        if(per2.esMayorDeEdad()){
            System.out.println(per2.getNombre() + " es mayor de edad");
        }else{
            System.out.println(per2.getNombre() + " no es mayor de edad");

        }
        if(per3.esMayorDeEdad()){
            System.out.println(per3.getNombre() + " es mayor de edad");
        }else{
            System.out.println(per3.getNombre() + " no es mayor de edad");

        }

        System.out.println();
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
    }
}
