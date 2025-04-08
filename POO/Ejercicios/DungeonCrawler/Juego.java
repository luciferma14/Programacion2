
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String tipo;
        String nombre;
        Integer armaElegida;
        Integer nuevaPosHeroe;
        Integer danyoHeroe;
        Integer danyoMonstruo;
        
        Arma[] armas = {
            new Arma("Espada", 6),
            new Arma("Arco", 4),
            new Arma("Hacha", 7),
            new Arma("Hechizo", 5)
        };

        System.out.print("Elige tu clase (Mago, Guerrero, Enano): ");
        tipo = sc.nextLine();

        System.out.print("Nombre del Héroe: ");
        nombre = sc.nextLine();

        System.out.print("Arma que quieres llevar (0: Espada, 1: Arco, 2: Hacha, 3: Hechizo): ");
        armaElegida = sc.nextInt();
        Arma armaHeroe = armas[armaElegida];

        Heroe heroe = new Heroe(tipo, nombre, armaHeroe);    
        
        Personajes[] pasillo = new Personajes[40];
        pasillo[0] = heroe;

        String[] tiposMonstruos = {"Orco", "Dragon", "Zombi"};
        
        ArrayList<Integer> posicionesUsadas = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            Integer posi;
            
            do { 
                posi = random.nextInt(39) + 1;
            } while (posicionesUsadas.contains(posi));
            posicionesUsadas.add(posi);

            Arma armaMonstruo = armas[random.nextInt(armas.length)];

            Monstruo monstruo = new Monstruo(tiposMonstruos[i], tiposMonstruos[i], armaMonstruo);

            monstruo.setPosicion(posi);
            pasillo[posi] = monstruo;
        }

        // Juego
        while(heroe.estaVivo() && heroe.getPosicion() < 39){
            nuevaPosHeroe = heroe.getPosicion() +1;
            System.out.println("\n" + heroe.getNombre() + " avanza a la casilla " + nuevaPosHeroe);
            if(pasillo[nuevaPosHeroe] == null){
                heroe.avanzar();
                System.out.println("Casilla vacía. Vida actual: " + heroe.getPuntosDeVida());
                try {
                    Thread.sleep(1000); // 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                Monstruo enemigo = (Monstruo) pasillo[nuevaPosHeroe];
                System.out.println(""); // Espacio
                System.out.println("\nTe has encontrado con un " + enemigo.getNombre() + "!");
                try {
                    Thread.sleep(1700); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                while(heroe.estaVivo() && enemigo.estaVivo()){
                    danyoHeroe = heroe.getArma().danyoArma();
                    enemigo.recibirDanyo(danyoHeroe);
                    System.out.println("\n" + heroe.getNombre() + " ataca al " + enemigo.getNombre() + " con su " + heroe.getArma().getNombre());
                    System.out.println("Y hace " + danyoHeroe + " de daño!");
                    System.out.println("Vida " + enemigo.getNombre() + ": " + enemigo.getPuntosDeVida());
                    try {
                        Thread.sleep(2850); // 2,85 segundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if(!enemigo.estaVivo()){
                        System.out.println("\nEl " + enemigo.getNombre() + " ha sido derrotado!!\n");
                        heroe.avanzar();
                        pasillo[nuevaPosHeroe] = null;
                        break;
                    }

                    danyoMonstruo = enemigo.getArma().danyoArma();
                    heroe.recibirDanyo(danyoMonstruo);
                    System.out.println("\nEl " + enemigo.getNombre() + " ataca a " + heroe.getNombre() + " con su " + enemigo.getArma().getNombre());
                    System.out.println("Y hace " + danyoMonstruo + " de daño!");
                    System.out.println("Vida " + heroe.getNombre() + ": " + heroe.getPuntosDeVida()); 
                    try {
                        Thread.sleep(2850); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }   
                }
            }
        }

        System.out.println("");
        if(heroe.estaVivo()){
            System.out.println("\n" + heroe.getNombre() + " ha llegado al final del pasillo.");
            System.out.println("HAS GANADO!!");
        }else{
            System.out.println("\n" + heroe.getNombre() + " ha muerto por el camino...");
            System.out.println("GAME OVER!!");
        }
    }
}
