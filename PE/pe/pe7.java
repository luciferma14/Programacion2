import java.util.Scanner;

public class Pe7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jugOrd;
        int jugUsu;
        int puntOrd = 0;
        int puntUsu = 0;

        do{
            jugOrd = (int) (Math.random() * 3 + 1);

            System.out.println("Seleciona una opción");
            System.out.println("1 - Piedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tijeras");
            System.out.print("Tu Opción: ");
            jugUsu = sc.nextInt();

            if(jugUsu >= 1 && jugUsu <= 3){
                if (jugUsu == jugOrd){
                    System.out.println("Opción Ordenador: " + jugOrd);
                    System.out.println();  // Espacio
                    System.out.println("Empate!!");
                    System.out.println("Puntos Usuario: " + puntUsu);
                    System.out.println("Puntos Ordenador: " + puntOrd);
                    System.out.println();  // Espacio

                }else if ((jugUsu == 1 && jugOrd == 3) || (jugUsu == 2 && jugOrd == 1) || (jugUsu == 3 && jugOrd == 2)){
                    System.out.println("Opción Ordenador: " + jugOrd);
                    System.out.println();  // Espacio
                    System.out.println("Has Ganado!!");
                    puntUsu++;
                    System.out.println("Puntos Usuario: " + puntUsu);
                    System.out.println("Puntos Ordenador: " + puntOrd);
                    System.out.println();  // Espacio

                }else {
                    System.out.println("Opción Ordenador: " + jugOrd);
                    System.out.println(); // Espacio
                    System.out.println("Has Perdido!!");
                    puntOrd++;
                    System.out.println("Puntos Usuario: " + puntUsu);
                    System.out.println("Puntos Ordenador: " + puntOrd);
                    System.out.println();  // Espacio

                }
            }else{
                System.out.println("Opción incorrecta");
            }

        }while(puntUsu < 3 && puntOrd < 3);

        if ( puntUsu == 3){
            System.out.println("Has ganado la partida");
        }else{
            System.out.println("Has perdido la partida");
        }
    }
}