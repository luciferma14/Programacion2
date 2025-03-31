public class PruebaMesa {
    public static void main(String[] args) {
        
        Mesa mesaCocina = new Mesa("Libre", "Gris", "Cristal", 4, "Grande", "150x70cm");
        Mesa mesaEstudio = new Mesa("Ocupada", "Marron","Madera",2, "Mediano","70x40cm");

        if(mesaCocina.estado.equals("Libre")){
            System.out.println("Está libre para comer");
        }

        System.out.println(mesaEstudio.comerEnMesa()); // False

// ---------------------------------------------------------------
        
        Mesa[] bar = new Mesa[5];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = new Mesa("Libre", "Gris", "Cristal", 4, "Grande", "150x70cm");
        }

        System.out.println("Estado: " + bar[3].estado);

        bar[3].reservaMesa();

        System.out.println("Estado: " + bar[3].estado);

        bar[3].reservaMesa();
    }
}