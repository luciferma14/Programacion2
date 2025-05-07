
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaFaltasDAW {

    static Scanner sc = new Scanner(System.in);
    static private ArrayList<Alumno> alumnos = new ArrayList<>();
    static private ArrayList<Sesion> sesiones = new ArrayList<>();

    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Alta Alumno/a");
        System.out.println("2. Alta Nueva Sesión");
        System.out.println("3. Introducir falta");
        System.out.println("4. Salir");
        System.out.print("Introduce opción: ");

        return sc.nextInt();
    }
    public static void main(String[] args) {
        
        int n;

        do { 
            n = menu(); sc.nextLine();

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/FaltasDAW", "senia", "seniadb");
                
                switch (n) {
                        // Alta alumno
                    case 1:
                        System.out.println("Introduce NIA del alumno: ");
                        String nia = sc.nextLine();
                    
                        PreparedStatement pst1 = con.prepareStatement("SELECT * FROM Alumnos WHERE NIA = ?");
                        pst1.setString(1, nia);
                        
                        ResultSet rs1 = pst1.executeQuery();
                        boolean encontrado1 = false;

                        while(rs1.next()){
                            encontrado1 = true;
                            System.out.println("Alumno ya dado de alta");
                        }

                        if(! encontrado1){
                            System.out.println("Introduce nombre del alumno: ");
                            String nombre = sc.nextLine();
                            System.out.println("Introduce edad del alumno: ");
                            String edad = sc.nextLine();
    
                            pst1 = con.prepareStatement("INSERT INTO Alumnos (NIA, Nombre, Edad) VALUES (?, ?, ?)");
                            pst1.setString(1, nia);
                            pst1.setString(2, nombre);
                            pst1.setString(3, edad);
                        
                            int res = pst1.executeUpdate();
                            if (res > 0){
                                System.out.println("Alumno dado de alta");
                            }
                        }         

                    break;

                    case 2:
                            // Alta nueva sesión
                        System.out.println("Introduce el día (1-31): ");
                        String dia = sc.nextLine();
                    
                        System.out.println("Introduce el mes (1-12): ");
                        String mes = sc.nextLine();

                        System.out.println("Introduce la sesión (1-13): ");
                        String sesion = sc.nextLine();

                        String idSesion = mes + dia + sesion;

                        PreparedStatement pst2 = con.prepareStatement("SELECT * FROM Sesiones WHERE IdSesion = ?");
                        pst2.setString(1, idSesion);
                        
                        ResultSet rs2 = pst2.executeQuery();
                        boolean encontrado2 = false;

                        while(rs2.next()){
                            encontrado2 = true;
                            System.out.println("Esa sesión ya existe");
                        }

                        if(! encontrado2){
                            System.out.println("Introduce nombre del módulo: ");
                            String modulo = sc.nextLine();
    
                            pst2 = con.prepareStatement("INSERT INTO Sesiones (IdSesion, Modulo) VALUES (?, ?)");
                            pst2.setString(1, idSesion);
                            pst2.setString(2, modulo);
                        
                            int res = pst2.executeUpdate();
                            if (res > 0){
                                System.out.println("Sesión añadida");
                            }
                        }         

                    break;

                    case 3:
                            // Introducir falta
                        Statement st3 = con.createStatement();
                        ResultSet rs3 = st3.executeQuery("SELECT * FROM Alumnos");
        
                        while(rs3.next()){
                            Alumno alum = new Alumno();
                            alum.setNumAlumno(rs3.getInt("NumAlumno"));
                            alum.setNia(rs3.getString("NIA"));
                            alum.setNombre(rs3.getString("Nombre"));
                            alum.setEdad(rs3.getInt("Edad"));

                            alumnos.add(alum);
                        }

                        for (Alumno alu : alumnos) {
                            System.out.println(alu);
                        }
                        System.out.print("Elige un alumno: ");
                        Integer idAlu = sc.nextInt();
                        sc.nextLine();

                        rs3.close();

                        ResultSet rs4 = st3.executeQuery("SELECT * FROM Sesiones");

                        while(rs4.next()){
                            Sesion sesi = new Sesion();
                            sesi.setIdSesion(rs4.getString("IdSesion"));
                            sesi.setModulo(rs4.getString("Modulo"));

                            sesiones.add(sesi);
                        }

                        for (Sesion ses : sesiones){
                            System.out.println(ses);
                        }
                        
                        System.out.print("Elige un módulo: ");
                        String idSesi = sc.nextLine();

                        System.out.println("Elige 1 (Falta) | 2 (Retraso)");
                        Integer falret = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Justificante? 0 (NO) | 1 (SI)");
                        Integer just = sc.nextInt();
                        sc.nextLine();

                        pst1 = con.prepareStatement("INSERT INTO Faltas (NumAlumno, IdSesion, Tipo, Just) VALUES (?, ?, ?, ?)");
                        pst1.setInt(1, idAlu);
                        pst1.setString(2, idSesi);
                        pst1.setInt(3, falret);
                        pst1.setInt(4, just);
                    
                        int res = pst1.executeUpdate();
                        if (res > 0){
                            System.out.println("Falta resgistrada");
                        }
                    break;
                }

            }catch (SQLException e) {
                System.out.println("Error en la conexión");
                e.printStackTrace();
            }  
        } while (n != 4);
    } 
}
