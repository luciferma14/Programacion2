import java.sql.*;
import java.util.Scanner;

public class EjemploInsert {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // compilar / ejecutar: java(c) -cp :lib/mysql-connector-j-9.2.0.jar pruebaBD.java 

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactos", "senia", "seniadb");  

            String insert = "INSERT INTO contactos.contacto (DNI, NOMBRE, EDAD) VALUES (?, ?, ?)";

            PreparedStatement st = con.prepareStatement(insert);

            System.out.print("Introduce el DNI: ");
            st.setString(1, sc.nextLine());
            System.out.print("Introduce el nombre: ");
            st.setString(2, sc.nextLine());
            System.out.print("Introduce la edad: ");
            st.setInt(3, sc.nextInt());

            int rs = st.executeUpdate();            

        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }   
    }
}
