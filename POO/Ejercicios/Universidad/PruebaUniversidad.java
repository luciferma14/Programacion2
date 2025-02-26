import java.util.ArrayList;

public class PruebaUniversidad{
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Calle 1", "Valencia", 12345, "España");
        Direccion direccion2 = new Direccion("Calle 2", "Madrid", 67890, "España");

        Estudiante estudiante1 = new Estudiante("Lucía", "Ferrandis", "12345678A", direccion1, 987654321);
        Estudiante estudiante2 = new Estudiante("Álvaro", "Ferrandis", "123456789B", 87654321);

        Profesor profesor1 = new Profesor("Patxi", "Sanchis", "123456789A", direccion1, 11111111);
        Profesor profesor2 = new Profesor("Vicent", "Tatay", "987654321B", direccion2, 22222222);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(estudiante1);
        personas.add(estudiante2);
        personas.add(profesor1);
        personas.add(profesor2);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}