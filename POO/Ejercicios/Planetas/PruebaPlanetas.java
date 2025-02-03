public class PruebaPlanetas {
    public static void main(String[] args) {
        
        Planeta planeta1 = new Planeta("Tierra", 10.0, 40.0);
        Satelite satelite1 = new Satelite("Luna", planeta1, 10.0);

        if(satelite1.orbita("Tierra")){
            System.out.println("Si, orbita el planeta " + planeta1.getNombre());
        }else{
            System.out.println("No orbita en planeta");
        }

        System.out.println(planeta1.cuantosOrbitan());

    }
}