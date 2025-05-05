import java.sql.*;
import java.util.Scanner;

public class PruebaContactos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // compilar / ejecutar: java(c) -cp :lib/mysql-connector-j-9.2.0.jar pruebaBD.java 

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactos", "senia", "seniadb");

            String insert = "INSERT INTO contactos.contacto (DNI, NOMBRE, EDAD) VALUES ('98765432T', 'Lucia Ferrandis Martinez', 20)";
            String delete = "DELETE FROM contacto WHERE EDAD >= 50";
            String update = "UPDATE contacto SET EDAD = 50 WHERE DNI = '07385709H'";
            String prSt = "SELECT * FROM contacto WHERE EDAD > ?";
            PreparedStatement st = con.prepareStatement(prSt);

            System.out.print("Introduce la edad a buscar: ");

            st.setInt(1, sc.nextInt());
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("NOMBRE") + ": " + rs.getInt("EDAD"));
            }
            
            // int rsDelete = st.executeUpdate(delete);
            // int rsInsert = st.executeUpdate(insert);
            // int rsUpdate = st.executeUpdate(update);
            // System.out.println("Líneas: " + rsUpdate); 
            

        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }   
    }
}
