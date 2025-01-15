import java.util.Scanner;

public class Ejer2 {

    public static boolean esBisiesto(int anyo){

        boolean bisiesto;

        if(anyo >= 1582){  // Año Bisiesto   
            if(anyo % 400 == 0){
                bisiesto = true;
            }else{
                if(anyo % 100 == 0){

                    bisiesto = false;
                }else{
                    if(anyo % 4 == 0){
                        bisiesto = true;
                    }else{
                        bisiesto = false;
                    }
                }
            }
        }else{ // Año Juliano
            if(anyo % 4 == 0){
                bisiesto = true;
            }else{
                bisiesto = false;
            }
        }
        // if((anyo % 400 == 0) || (anyo % 100 == 0) && (anyo % 4 == 0)){         
        //     bisiesto = true;
        // }else{                      --> Lo mismo de arriba
        //     bisiesto = false;
        // }

        return bisiesto;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String nac;
        String fall;
        String anyo;
        int aNac;
        int aFall;
        int calculo;

        casos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < casos; i++){
            nac = sc.next();

            String[] fechaNac = nac.split("/");
            anyo = fechaNac[2];
            aNac = Integer.parseInt(anyo);

            //int aNac1 = Integer.valueOf(sc.next().split("/")[2]); --> Lo mismo que lo de arriba, pero en una línea.

            aFall = Integer.valueOf(sc.next().split("/")[2]);

            calculo = 0;
            for(int j = aNac; j <= aFall; j++){
                if (esBisiesto(j)){
                    calculo++;
                }
            }

            System.out.println(calculo);
        }
    }
}