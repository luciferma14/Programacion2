import java.util.Scanner;
import java.util.TreeSet;

public class AER_185 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos;
        String palab;
        String respu;
        boolean salir;

        casos = Integer.valueOf(sc.next());

        while(casos != 0){

            TreeSet<String> si = new TreeSet<String>();
            TreeSet<String> no = new TreeSet<String>();

            for(int i = 0; i < casos; i++){
                respu = sc.next(); // SI: o NO:

                if(respu.equals("SI:")){
                    salir = false;

                    do { 
                        palab = sc.next();

                        if(palab.equals("FIN")){
                            salir = true;
                        }else{
                            si.add(palab);
                            no.remove(palab);
                        }
        
                    } while (!salir);

                }else{
                    salir = false;

                    do { 
                        palab = sc.next();

                        if(palab.equals("FIN")){
                            salir = true;
                        }else{
                            if(!si.contains(palab)){
                                no.add(palab);
                            }
                        }

                    } while (!salir);
                }
            }


            if(no.size() > 0){
                Object[] solu = no.toArray();

                System.out.print(solu[0]);
            
                for(int i = 1; i < solu.length; i++){
                    System.out.print(" " + solu[i]);
                }
            }

            System.out.println();

            casos = Integer.valueOf(sc.next());
        }
    }
}