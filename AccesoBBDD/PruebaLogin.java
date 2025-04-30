
import java.sql.*;
import java.util.Scanner;

public class PruebaLogin {

    static Scanner sc = new Scanner(System.in);

    public static int menu(){

        System.out.println("MENÚ");
        System.out.println("1. Validar usuario");
        System.out.println("2. Registrar nuevo usuario");
        System.out.println("3. Darse de baja");
        System.out.println("4. Salir");
        System.out.print("Introduce opción: ");

        return sc.nextInt();
    }
    public static void main(String[] args) {
        
        int n;

        do { 
            n = menu(); sc.nextLine();

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "senia", "seniadb");
                int id = 1;

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

                    
                        String insert = "INSERT INTO login.usuarios (idUsu, nomUsu, passwd) VALUES (id, ?, ?)";

                        PreparedStatement st = con.prepareStatement(insert);

                        System.out.println("Introduce el nombre del usuario: ");
                        st.setString(1, sc.nextLine());
                        
                        ResultSet rs2 = st.executeQuery();
                        boolean encontrado2 = false;

                        while(rs2.next()){
                            encontrado2 = true;
                            System.out.println("El usuario ya existe");
                        }

                        if(! encontrado2){
                            System.out.println("Introduce la contraseña: ");
                            st.setString(2, sc.nextLine());
                        }         

                        id++;

                    break;

                    case 3:
                        String delete = "DELETE FROM usuarios WHERE nomUsu = ?";
                        PreparedStatement ps = con.prepareStatement(delete);

                        System.out.println("Introduce el usuario que quieres dar de baja: ");
                        ps.setString(1, sc.nextLine());

                        int rse = ps.executeUpdate();
                        
                        int rsDelete = ps.executeUpdate(delete);
                    break;

                    case 4:
                        System.out.println("Saliendo... :(");
                    break;
                    default:
                       System.out.println("Opción no válida");
                }
    
    
            } catch (SQLException e) {
                System.out.println("Error en la conexión");
                e.printStackTrace();
            }   

        } while (n != 4);
    }
}
