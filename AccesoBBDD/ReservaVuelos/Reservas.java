package ReservaVuelos;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class Reservas {
    
    static private ArrayList<Vuelos> vuelos = new ArrayList<>();
    static private ArrayList<Pasajeros> pasajeros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static int menu(){

        System.out.println();
        System.out.println("---- MENÚ----");
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
                //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ReservaVuelos", "senia", "seniadb");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ReservaVuelos", "root", "rootroot");

                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM Vuelos");

                while(rs.next()){
                    Vuelos v = new Vuelos();
                    v.setId_Vuelo(rs.getString("Id_Vuelo"));
                    v.setOrigen(rs.getString("origen"));
                    v.setDestino(rs.getString("destino"));
                    v.setFecha(rs.getString("fecha"));
                    v.setCapacidad(rs.getInt("capacidad"));

                    vuelos.add(v);
                }
                

                switch (n) {
                    case 1: // Alta vuelo
                        sc.nextLine();
                        System.out.print("Introduce Id del vuelo: ");
                        String idVuelo = sc.nextLine();
                    
                        PreparedStatement pst1 = con.prepareStatement("SELECT * FROM Vuelos WHERE Id_Vuelo = ?");
                        pst1.setString(1, idVuelo);
                        
                        ResultSet rs1 = pst1.executeQuery();
                        boolean encontrado1 = false;

                        while(rs1.next()){
                            encontrado1 = true;
                            System.out.println("Ese vuelo ya existe");
                        }

                        if(! encontrado1){
                            System.out.print("Destino: ");
                            String destino = sc.nextLine();
                            System.out.print("Origen: ");
                            String origen = sc.nextLine();
                            System.out.print("Capacidad: ");
                            Integer capac = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Fecha (aaaa-mm-dd): ");
                            Date fech = Date.valueOf(sc.nextLine());
         
                            pst1 = con.prepareStatement("INSERT INTO Vuelos (Id_Vuelo, destino, origen, capacidad, fecha) VALUES (?, ?, ?, ?, ?)");
                            pst1.setString(1, idVuelo.toUpperCase());
                            pst1.setString(2, destino.toUpperCase());
                            pst1.setString(3, origen.toUpperCase());
                            pst1.setInt(4, capac);
                            pst1.setDate(5, fech);

                            int res = pst1.executeUpdate();
                            if (res > 0){
                                System.out.println("Vuelo añadido");
                            }
                        }         

                    break;

                    case 2: // Alta pasajero
                    sc.nextLine();
                    System.out.print("Introduce Id del pasajero: ");
                        Integer idPasajero = sc.nextInt();
                    
                        PreparedStatement pst2 = con.prepareStatement("SELECT * FROM Pasajeros WHERE Id_Pasajero = ?");
                        pst2.setInt(1, idPasajero);
                        
                        ResultSet rs2 = pst2.executeQuery();
                        boolean encontrado2 = false;

                        while(rs2.next()){
                            encontrado2 = true;
                            System.out.println("Ese pasajero ya existe");
                        }

                        if(! encontrado2){
                            sc.nextLine();
                            System.out.print("Nombre y apellido: ");
                            String nombre = sc.nextLine();
                            System.out.print("Pasaporte: ");
                            String pasaporte = sc.nextLine();
         
                            pst2 = con.prepareStatement("INSERT INTO Pasajeros (Id_Pasajero, Nombre_Pasajero, Pasaporte) VALUES (?, ?, ?)");
                            pst2.setInt(1, idPasajero);
                            pst2.setString(2, nombre);
                            pst2.setString(3, pasaporte);

                            int res = pst2.executeUpdate();
                            if (res > 0){
                                System.out.println("Pasajero añadido");
                            }
                        }         

                    break;


                    case 6:
                        System.out.println("Saliendo... :(");
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
