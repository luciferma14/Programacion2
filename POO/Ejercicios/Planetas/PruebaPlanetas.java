public class PruebaPlanetas {
    public static void main(String[] args) {
        
        Planeta planeta1 = new Planeta("Tierra", 1000000L, 3456.68);
        Planeta planeta2 = new Planeta("Saturno");
        Satelite satelite1 = new Satelite("Luna", planeta1, 15000L);
        Satelite satelite2 = new Satelite("Fobos", planeta2, 1000L);
        Satelite satelite3 = new Satelite("Deimos", planeta2, 1200L);


        if(satelite1.orbita("Tierra")){
            System.out.println("Si, orbita el planeta " + planeta1.getNombre());
        }else{
            System.out.println("No orbita en ningún planeta");
        }

        System.out.println(planeta1.getnSatelites());
        System.out.println(planeta2.getnSatelites());
        
    }
}