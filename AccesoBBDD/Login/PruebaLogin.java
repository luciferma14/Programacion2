package Login;

import java.sql.*;
import java.util.Scanner;

public class PruebaLogin {

    static Scanner sc = new Scanner(System.in);

    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Validar usuario");
        System.out.println("2. Registrar nuevo usuario");
        System.out.println("3. Darse de baja");
        System.out.println("4. Modificar contraseña");
        System.out.println("5. Salir");
        System.out.print("Introduce opción: ");

        return sc.nextInt();
    }
    public static void main(String[] args) {
        
        int n;

        do { 
            n = menu(); sc.nextLine();

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "senia", "seniadb");
                
                switch (n) {
                    case 1:
                        System.out.println("Introduce usuario: ");
                        String usuario = sc.nextLine();
                        System.out.println("Introduce contraseña: ");
                        String pass = sc.nextLine();

                        PreparedStatement pst = con.prepareStatement("SELECT * FROM usuarios WHERE nomUsu = ?");
                        pst.setString(1, usuario);

                        ResultSet rset = pst.executeQuery();

                        boolean encotrado = false;

                        while (rset.next()){

                            encotrado = true;

                            if (rset.getString("passwd").equals(pass)){
                                System.out.println("Usuario correcto");
                            }else {
                                System.out.println("Passwd incorrecto");
                            }
                        }
                        if(! encotrado){
                            System.out.println("El usuario no existe");
                        }
                    break;

                    case 2:
                        System.out.println("Introduce usuario: ");
                        String usuario2 = sc.nextLine();
                    
                        PreparedStatement pst2 = con.prepareStatement("SELECT * FROM usuarios WHERE nomUsu = ?");
                        pst2.setString(1, usuario2);
                        
                        ResultSet rs2 = pst2.executeQuery();
                        boolean encontrado2 = false;

                        while(rs2.next()){
                            encontrado2 = true;
                            System.out.println("El usuario ya existe");
                        }

                        if(! encontrado2){
                            System.out.println("Introduce la contraseña: ");
                            String contra2 = sc.nextLine();
                            pst2 = con.prepareStatement("INSERT INTO login.usuarios (nomUsu, passwd) VALUES (?, ?)");
                            pst2.setString(1, usuario2);
                            pst2.setString(2,contra2);

                            int res = pst2.executeUpdate();
                            if (res > 0){
                                System.out.println("Usuario añadido");
                            }
                        }         

                    break;

                    case 3:

                        System.out.println("Introduce usuario: ");
                        String usuario3 = sc.nextLine();
                    
                        PreparedStatement pst3 = con.prepareStatement("SELECT * FROM usuarios WHERE nomUsu = ?");
                        pst3.setString(1, usuario3);
                        
                        ResultSet rs3 = pst3.executeQuery();
                        boolean encontrado3 = false;

                        while(rs3.next()){
                            encontrado3 = true;                        
                        
                            System.out.println("Introduce la contraseña: ");
                            String contra3 = sc.nextLine();

                            if (rs3.getString("passwd").equals(contra3)){
                                pst3 = con.prepareStatement("DELETE FROM usuarios WHERE nomUsu = ?");
                                pst3.setString(1, usuario3);

                                int res = pst3.executeUpdate();
                                if (res > 0){
                                    System.out.println("Usuario borrado");
                                }
                            }else {
                                System.out.println("Passwd incorrecto");
                            }
                            
                        }
                        if (! encontrado3){
                            System.out.println("El usuario no existe");
                        }
                      
                    break;

                    case 4:

                        System.out.println("Introduce usuario: ");
                        String usuario4 = sc.nextLine();
                    
                        PreparedStatement pst4 = con.prepareStatement("SELECT * FROM usuarios WHERE nomUsu = ?");
                        pst4.setString(1, usuario4);
                        
                        ResultSet rs4 = pst4.executeQuery();
                        boolean encontrado4 = false;

                        if(! encontrado4){
                            System.out.println("El usuario no existe");
                        }

                        while(rs4.next()){
                            encontrado4 = true;
                            System.out.println("Introduce contraseña: ");
                            String pass4 = sc.nextLine();

                            if(rs4.getString("passwd").equals(pass4)){
                                System.out.println("Introduce nueva contraseña: ");
                                String nContra4 = sc.nextLine();
                                System.out.println("Introduce otra vez la contraseña: ");
                                String nContra42 = sc.nextLine();
                                if(nContra4.equals(nContra42)){
                                    pst4 = con.prepareStatement("UPDATE usuarios SET passwd = ? WHERE nomUsu = ?");
                                    pst4.setString(1, nContra4);
                                    pst4.setString(2, usuario4);

                                    int res = pst4.executeUpdate();

                                    if(res > 0){
                                        System.out.println("Contraseña modificada correctamente");
                                    }
                                }else{
                                    System.out.println("Contraseñas no coinciden");
                                }
                            }else{
                                System.out.println("Password incorrecto");
                            }
                        }
                    break;

                    case 5:
                        System.out.println("Saliendo... :(");
                    break;
                    default:
                       System.out.println("Opción no válida");
                }
    
    
            } catch (SQLException e) {
                System.out.println("Error en la conexión");
                e.printStackTrace();
            }   

        } while (n != 5);
    }
}
