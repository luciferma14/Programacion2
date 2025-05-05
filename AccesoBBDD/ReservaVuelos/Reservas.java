package ReservaVuelos;

import java.sql.*;
import java.util.*;

public class Reservas {
    
    static private ArrayList<Vuelos> vuelos = new ArrayList<>();
    static private ArrayList<Pasajeros> pasajeros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Alta Vuelo");
        System.out.println("2. Alta Pasajero");
        System.out.println("3. Reserva Vuelo");
        System.out.println("4. Modificar reserva");
        System.out.println("5. Baja reserva");
        System.out.println("6. Salir");
        System.out.print("Introduce opción: ");
        
        return sc.nextInt();
    }

    public static void main(String[] args) {
        
        int n = 0;

        do { 
            n = menu();
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ReservaVuelos", "senia", "seniadb");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM Vuelos");

                while(rs.next()){
                    Vuelos v = new Vuelos();
                    v.setId_Vuelo(rs.getString("Id_Vuelo"));
                    v.setOrigen(rs.getString("origen"));
                    v.setDestino(rs.getString("destino"));
                    v.setFecha(rs.getString("fecha"));
                    v.setCapacidad(rs.getInt("capacidad"));
                }
                

                switch (n) {
                    case 1:
                        
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                }

            }catch (SQLException e) {
                System.out.println("Error en la conexión");
                e.printStackTrace();
            } 

        } while (n != 6);
    }
}
