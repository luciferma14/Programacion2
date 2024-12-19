public class Fact {

    public static int factorial(int num){

        if (num == 0 || num == 1){
            return 1;
        }else{
            return num * factorial(num - 1);

        }
    }
    public static void main(String[] args) {
        // Ejemplo recursividad
        
        int num = 10;
        int fac = 1;

        // Sin recursividad
        // for (int i = 1; i <= num; i++){
        //     fac = fac * i;
        // }

        System.out.println("Factorial: " + factorial(num));
    }
}
