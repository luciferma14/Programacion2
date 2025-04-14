import java.sql.*;

public class pruebaBD {
    public static void main(String[] args){

        // compilar: javac -cp :lib/mysql-connector-j-9.2.0.jar pruebaBD.java 

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactos", "senia", "seniadb");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM contacto");
            System.out.println("hola");
            while (rs.next()) {
                String nombre = rs.getString("NOMBRE");
                int edad = rs.getInt("EDAD");
                System.out.println(nombre + ": " + edad);
            }

        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
    }
}
